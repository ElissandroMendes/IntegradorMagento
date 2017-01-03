package br.com.mind.integrador.core;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import com.google.gson.Gson;

import br.com.mind.integrador.commandsWithoutWSI.AttributeAddOptionCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerAddressCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerAddressUpdateCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerInfo;
import br.com.mind.integrador.commandsWithoutWSI.CustomerUpdateCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductImageUploadCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductUpdateCommand;
import br.com.mind.integrador.commandsWithoutWSI.SalesOrderInfo;
import br.com.mind.magento.ClientWithoutWSI.AssociativeEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogAttributeEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogAttributeOptionEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogCategoryEntityCreate;
import br.com.mind.magento.ClientWithoutWSI.CatalogCategoryTree;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductAttributeMediaCreateEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductAttributeSetEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductImageEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductReturnEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductTypeEntity;
import br.com.mind.magento.ClientWithoutWSI.CustomerAddressEntityItem;
import br.com.mind.magento.ClientWithoutWSI.CustomerCustomerEntity;
import br.com.mind.magento.ClientWithoutWSI.Filters;
import br.com.mind.magento.ClientWithoutWSI.Mage_Api_Model_Server_V2_HandlerPortType;
import br.com.mind.magento.ClientWithoutWSI.MagentoInfoEntity;
import br.com.mind.magento.ClientWithoutWSI.MagentoServiceLocator;
import br.com.mind.magento.ClientWithoutWSI.RewardpointsTransactionAdd;
import br.com.mind.magento.ClientWithoutWSI.SalesOrderEntity;
import br.com.mind.magento.ClientWithoutWSI.SalesOrderInvoiceEntity;
import br.com.mind.magento.ClientWithoutWSI.SalesOrderListEntity;
import br.com.mind.magento.ClientWithoutWSI.StoreEntity;

public class MageAPIWithoutWSI {
	
	private String sessionId = null;
	private Mage_Api_Model_Server_V2_HandlerPortType mageService;
	
	public MageAPIWithoutWSI(String sessionId) throws RemoteException, ServiceException {
		MagentoServiceLocator locator = new MagentoServiceLocator();
		this.mageService = locator.getMage_Api_Model_Server_V2_HandlerPort();
		this.sessionId = sessionId;
	}
	
	@SuppressWarnings("unused")
	private boolean isValidSession() throws RemoteException {
		System.out.println("Validating Session");
		boolean isValid = true;
		try {
			this.mageService.magentoInfo(sessionId);
		} catch(AxisFault e) {
			System.out.println(e.getFaultCode().toString());
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				System.out.println("Session Expired");
				isValid = false;
			} else {
				e.printStackTrace();
			}
		}
		return isValid;
	}
	public String mageLogin(String user, String password) throws RemoteException {
		return this.mageService.login(user, password);
	}	

	public int createCategory(int parentId, CatalogCategoryEntityCreate categoryData) throws RemoteException {
		System.out.println("Creating category.");
		int result = this.mageService
				.catalogCategoryCreate(sessionId, parentId, categoryData, null); 
		System.out.println("Creating category. DONE. Category ID: " + result);
		return result;
	}
	
	public CatalogCategoryTree listCategories() throws RemoteException {
		System.out.println("Listing categories.");
		CatalogCategoryTree result = this.mageService
				.catalogCategoryTree(sessionId, null, null); 
		System.out.println("Listing categories. DONE.");
		return result;
	}

	/**
	 * BEGIN - API´s relacionadas a PRODUTOS
	 */

	public int createProducts(ProductCreateCommand product) throws RemoteException {
		System.out.println("Creating product. SKU " + product.sku);
		
		AssociativeEntity filter = new AssociativeEntity();
		filter.setKey("sku");
		filter.setValue(product.sku);
		
		Filters filters = new Filters();
		filters.setFilter(new AssociativeEntity[] { filter });
		
		CatalogProductEntity[] listResult = this.mageService.catalogProductList(sessionId, filters, null);

		int result;
		if( listResult.length == 0 ) {
			result = this.mageService.catalogProductCreate(sessionId, product.type, product.set, product.sku, product.productData, product.storeView); 
			System.out.println("Creating product. DONE. Product ID: " + result);
		} else {
			System.out.println("Product already exists. SKU " + product.sku + " - ID " + listResult[0].getProduct_id());
			result = Integer.parseInt(listResult[0].getProduct_id());
		}
		return result;
	}
	
	public String updateProducts(ProductUpdateCommand product) throws RemoteException {
		System.out.println("Updating product. ID " + product.sku);
		String result = String.valueOf(this.mageService.catalogProductUpdate(sessionId, product.sku, product.productData, product.storeView, "sku")); 
		System.out.println("Updating product. DONE. " + result);
		return result;
	}

	public boolean uploadProductImages(ProductImageUploadCommand imageInfo) throws RemoteException {
		System.out.println("Uploading product Images. SKU: " + imageInfo.getProduct());
		CatalogProductImageEntity[] imageList = getProductImageList(imageInfo.getProduct());
		CatalogProductAttributeMediaCreateEntity[] imagesData = imageInfo.getData();
		
		for (CatalogProductAttributeMediaCreateEntity imageData : imagesData) {

//			if (imageData.getTypes().length == 0) {
//				imageData.setTypes(new String[] {"image"});
//			}
			
			boolean imageExists = false;
			if (imageList != null) {
				for (CatalogProductImageEntity image : imageList) {
					if (image.getLabel().equalsIgnoreCase(imageData.getLabel())) {
						imageExists = true;
						break;
					}
				}
			}
			
			if ( !imageExists ) {
				System.out.println("Uploading Image: " + imageData.getLabel());
				this.mageService.catalogProductAttributeMediaCreate(sessionId, imageInfo.getProduct(), imageData, imageInfo.getStoreView(), "sku");
			} else {
				System.out.println("Image already exists: " + imageData.getLabel());
			}
		}
		System.out.println("Upload product images.DONE.");
		return true;
	}

	public boolean createProductLink(String product, String linkedProduct) throws RemoteException {
		System.out.println("Assign product link.");
		boolean result = this.mageService.catalogProductLinkAssign(sessionId, "grouped", product, linkedProduct, null, "sku"); 
		System.out.println("Assign product link. DONE. Link created (" + product + " -> " + linkedProduct + "): " + result);
		return result;
	}
		
	public boolean addAttributeOption(AttributeAddOptionCommand attributeOption) throws RemoteException {
		System.out.println("Adding Attribute Option. Attr: " + 
				attributeOption.getAttribute() + " Option: " + 
				attributeOption.getData().getLabel()[0].getValue());
		
		boolean result = this.mageService.catalogProductAttributeAddOption(sessionId, attributeOption.getAttribute(), attributeOption.getData());
		
		System.out.println("Adding Attribute Option. DONE.");
		return result;
	}

	public CatalogProductReturnEntity getProductInfo(String idOrSku) throws RemoteException {
		System.out.println("Getting product Info SKU: " + idOrSku);
		CatalogProductReturnEntity result = this.mageService.catalogProductInfo(sessionId, idOrSku, null, null, "sku");
		System.out.println("Getting product Info SKU: " + idOrSku + ". DONE.");
		return result;
	}
	
	public CatalogProductImageEntity[] getProductImageList(String skuOrIdProduct) throws RemoteException {
		return this.mageService
				.catalogProductAttributeMediaList(sessionId, skuOrIdProduct, null, "sku"); 
	}
	public CatalogProductImageEntity getProductImageInfo(String skuOrIdProduct, String fileName) throws RemoteException {
		return this.mageService
				.catalogProductAttributeMediaInfo(sessionId, skuOrIdProduct, fileName, null, "sku"); 
	}
	
	public CatalogProductTypeEntity[] listProductTypes() throws RemoteException {
		return this.mageService.catalogProductTypeList(sessionId);
	}

	public CatalogProductAttributeSetEntity[] listProductAttributeSet() throws RemoteException {
		return this.mageService.catalogProductAttributeSetList(sessionId);
	}
	
	public CatalogAttributeOptionEntity[] listAttributeOptions( String attribute, String storeView ) throws RemoteException {
		System.out.println("Getting Attribute Options List. Attr: " + attribute);
		CatalogAttributeOptionEntity[] result = this.mageService.catalogProductAttributeOptions(sessionId, attribute, storeView);
		System.out.println("Getting Attribute Options List. DONE.");
		return result;
	}

	public CatalogAttributeEntity[] listAttributes () throws RemoteException {
		System.out.println("Getting Attribute List.");
		CatalogAttributeEntity[] result = this.mageService.catalogCategoryAttributeList(sessionId);
		System.out.println("Getting Attribute List. DONE.");
		return result;
	}
	 	 
	public CatalogProductEntity[] getProductList( Filters filters ) throws RemoteException {
		System.out.println("Getting Product List.");
		CatalogProductEntity[] result = this.mageService.catalogProductList(sessionId, filters, null);
		System.out.println("Getting Product List. DONE.");
		return result;
	}

	public CatalogProductEntity[] listAllProducts() throws RemoteException {
		return this.mageService.catalogProductList(sessionId, null, null);
	}
	
	/**
	 * END - API´s relacionadas a PRODUTOS
	 */

	/**
	 * BEGIN - API´s relacionadas a CLIENTES
	 */
	public int createCustomer(CustomerCreateCommand customer) throws RemoteException {
		System.out.println("Creating customer. Email " + customer.getCustomerData().getEmail());
		
		AssociativeEntity filter = new AssociativeEntity();
		filter.setKey("email");
		filter.setValue(customer.getCustomerData().getEmail());
		
		Filters filters = new Filters();
		filters.setFilter(new AssociativeEntity[] { filter });
		
		CustomerCustomerEntity[] list = this.mageService.customerCustomerList(sessionId, filters);
		int result;
		
		if( list.length == 0 ) {
			result = this.mageService.customerCustomerCreate(sessionId, customer.getCustomerData()); 
			System.out.println("Creating customer. DONE. Customer ID: " + result);
		} else {
			System.out.println("Customer already exists. Email " + customer.getCustomerData().getEmail() + " - ID " + list[0].getCustomer_id());
			result = list[0].getCustomer_id();
		}
		
		if (customer.getRewardpoints() > 0) {
			RewardpointsTransactionAdd data = new RewardpointsTransactionAdd();
			data.setCustomerId(String.valueOf(result));
			data.setPointAmount(String.valueOf(customer.getRewardpoints()));
			data.setActionCode("api");
			createCustomerRewardsPoints(data);
		}
		return result;
	}

	public int createCustomerAddress(CustomerAddressCreateCommand addr) throws RemoteException {
		System.out.println("Creating Customer Address.");
		int result = this.mageService.customerAddressCreate(sessionId, addr.getCustomerId(), addr.getAddressdata()[0]); 
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	
	public String createCustomerRewardsPoints(RewardpointsTransactionAdd transactionData) throws RemoteException {
		System.out.println("Creating Customer Reward Points. Customer ID: ");
		String result = this.mageService.rewardpointsTransactionAdd(sessionId, transactionData); 
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	 
	public boolean updateCustomer(CustomerUpdateCommand customer) throws RemoteException {
		System.out.println("Updating customer. ID " + customer.getCustomer_id());
		boolean result = this.mageService.customerCustomerUpdate(sessionId, customer.getCustomer_id(), customer.getCustomerData());

		if (customer.getRewardpoints() > 0) {
			RewardpointsTransactionAdd data = new RewardpointsTransactionAdd();
			data.setCustomerId(String.valueOf(customer.getCustomer_id()));
			data.setPointAmount(String.valueOf(customer.getRewardpoints()));
			data.setActionCode("api");
			createCustomerRewardsPoints(data);
		}

		System.out.println("Updating customer. DONE.");
		return result;
	}

	public boolean updateCustomerAddress(CustomerAddressUpdateCommand address) throws RemoteException {
		System.out.println("Updating customer address.");
		boolean result = this.mageService.customerAddressUpdate(sessionId, address.getAddressId(), address.getAddressdata());
		System.out.println("Updating customer address. DONE.");
		return result;
	}

	public CustomerInfo[] getCustomerList( Filters filters ) throws RemoteException {
		System.out.println("Getting Customer List.");
		CustomerCustomerEntity[] customerList = this.mageService.customerCustomerList(sessionId, filters);
		CustomerInfo[] result = new CustomerInfo[customerList.length];
		
		System.out.println(customerList.length + " customer selected.");
		
		for (int i = 0; i < customerList.length; i++) {
			result[i] = new CustomerInfo();
			CustomerAddressEntityItem[] customerAddress = this.getCustomerAddress(customerList[i].getCustomer_id());
			
			result[i].setCustomerData(customerList[i]);
			result[i].setCustomerAddress(customerAddress);
		}
		System.out.println("Getting Customer List. DONE.");
		return result;
	}
	
	public CustomerCustomerEntity getCustomerInfo( int customerId ) throws RemoteException {
		System.out.println("Getting Customer Info. ID " + customerId);
		CustomerCustomerEntity result = 
				this.mageService.customerCustomerInfo(sessionId, customerId, null);
		System.out.println("Getting Customer Info. DONE.");
		return result;
	}

	public CustomerAddressEntityItem[] getCustomerAddress( int customerId ) throws RemoteException {
		System.out.println("Getting Customer Address. ID " + customerId);
		CustomerAddressEntityItem[] result = this.mageService.customerAddressList(sessionId, customerId);
		System.out.println("Getting Customer Address. DONE.");
		return result;
	}

	public StoreEntity[] listStore() throws RemoteException {
		return this.mageService.storeList(sessionId);
	}
	
	
	/**
	 * BEGIN - API´s relacionadas a VENDAS
	 */
	 
	public SalesOrderInfo[] listSalesOrders( Filters filters ) throws RemoteException {
		System.out.println("Getting Sales Orders List.");
		SalesOrderListEntity[] orderList = this.mageService.salesOrderList(sessionId, filters);

		SalesOrderInfo[] result = new SalesOrderInfo[orderList.length];
		for (int i = 0; i < orderList.length; i++) {
			SalesOrderListEntity saleEntity = orderList[i];
			SalesOrderEntity saleEntityInfo = getOrderInfo(saleEntity.getIncrement_id());
			
			SalesOrderInfo saleInfo = new SalesOrderInfo();  
			
			saleInfo.setOrder_id(saleEntity.getOrder_id());
			saleInfo.setCreated_at(saleEntity.getCreated_at());
			saleInfo.setUpdated_at(saleEntity.getUpdated_at());
			saleInfo.setStatus(saleEntity.getStatus());
			saleInfo.setIncrement_id(saleEntity.getIncrement_id());
			saleInfo.setTax_amount(saleEntity.getTax_amount());
			saleInfo.setShipping_amount(saleEntity.getShipping_amount());
			saleInfo.setDiscount_amount(saleEntity.getDiscount_amount());
			saleInfo.setSubtotal(saleEntity.getSubtotal());
			saleInfo.setGrand_total(saleEntity.getGrand_total());
			saleInfo.setRemote_ip(saleEntity.getRemote_ip());
			
			CustomerCustomerEntity c = new CustomerCustomerEntity();
			c.setCustomer_id(Integer.valueOf(saleEntity.getCustomer_id()));
			c.setFirstname(saleEntity.getFirstname());
			c.setLastname(saleEntity.getLastname());
			c.setMiddlename(saleEntity.getCustomer_middlename());
			c.setDob(saleEntity.getCustomer_dob());
			c.setEmail(saleEntity.getCustomer_email());
			c.setTaxvat(saleEntity.getCustomer_taxvat());
			c.setGroup_id(Integer.valueOf(saleEntity.getCustomer_group_id()));
			saleInfo.setCustomer(c);
			
//			saleInfo.setCustomer(getCustomerInfo(Integer.valueOf(saleEntity.getCustomer_id())));
			saleInfo.setShipping_address(saleEntityInfo.getShipping_address());
			saleInfo.setBilling_address(saleEntityInfo.getBilling_address());
			saleInfo.setItems(saleEntityInfo.getItems());
			saleInfo.setPayment(saleEntityInfo.getPayment());
			
			result[i] = saleInfo; 
		}
		System.out.println("Getting Sales Orders List. DONE.");
		return result;
	}
	
	public  SalesOrderEntity getOrderInfo( String orderIncrementId ) throws RemoteException {
		System.out.println("Getting Sale Order Info. OrderIncrementId " + orderIncrementId);
		SalesOrderEntity result = this.mageService.salesOrderInfo(sessionId, orderIncrementId);
		System.out.println("Getting Sale Order Info. DONE.");
		return result;
	}
	
	public MagentoInfoEntity getMagentoInfo() throws RemoteException {
		System.out.println("Getting Sales Orders List.");
		MagentoInfoEntity result = this.mageService.magentoInfo(sessionId);
		System.out.println("Getting Sales Orders List. DONE.");
		return result;
	}
	
	public SalesOrderInvoiceEntity getInvoceInfo( String orderIncrementId ) throws RemoteException {
		System.out.println("Getting Invoice Info. OrderIncrementId " + orderIncrementId);
		SalesOrderInvoiceEntity result = this.mageService.salesOrderInvoiceInfo(sessionId, orderIncrementId);
		System.out.println("Getting Invoice Info. DONE.");
		return result;
	}
	
	public boolean addOrderComment( String orderIncrementId, String status, String comment ) throws RemoteException {
		System.out.println("Adding Order Comment. OrderIncrementId " + orderIncrementId);
		boolean result = this.mageService.salesOrderAddComment(sessionId, orderIncrementId, status, comment, null);
		System.out.println("Adding Order Comment. DONE.");
		return result;
	}
	
	public String addOrderShipment( String orderIncrementId, String comment ) throws RemoteException {
		System.out.println("Adding Order Shipment. OrderIncrementId " + orderIncrementId);
		String result = this.mageService.salesOrderShipmentCreate(sessionId, orderIncrementId, null, comment, 1, 1);
		System.out.println("Adding Order Shipment. DONE.");
		return result;
	}

	public int addOrderTrack( String shipmentId, String courier, String trackNumber ) throws RemoteException {
		System.out.println("Adding Order Shipment Track. Shipment ID " + shipmentId);
		int result = this.mageService.salesOrderShipmentAddTrack(sessionId, shipmentId, courier, courier, trackNumber);
		System.out.println("Adding Order Shipment Track. DONE.");
		return result;
	}
	
	public AssociativeEntity[] getCarriersInfo( String orderIncrementId ) throws RemoteException {
		System.out.println("Getting Carriers Info. OrderIncrementId " + orderIncrementId);
		AssociativeEntity[] result = this.mageService.salesOrderShipmentGetCarriers(sessionId, orderIncrementId);
		System.out.println("Getting Carriers Info. DONE.");
		return result;
	}
	 

	public static void main(String[] args) throws IOException, ServiceException {
		MageAPIWithoutWSI magento = new MageAPIWithoutWSI("08a543b1c66881275268151568bba9a3");
//		String sessionId = magento.mageLogin("integrador.noix", "YzU4ODZjNjQwYjI5NTc3YmZi");
//		System.out.println(sessionId);

		Gson json = new Gson();
		
//		String c = magento.addOrderShipment("100000115", "Envio pedido 100000115");
		int c = magento.addOrderTrack("100000008", "signativa_correios", "1000ABCD");
//		AssociativeEntity[] c = magento.getCarriersInfo("100000115");
		System.out.println(json.toJson(c));
		

//		CatalogProductReturnEntity c = magento.getProductInfo("409602336");
//		System.out.println(json.toJson(c));
		
//		CatalogAttributeOptionEntity[] c = magento.listAttributeOptions(null, null);
//		CatalogAttributeEntity[] c = magento.listAttributes();
//		CustomerInfo[] c = magento.getCustomerList(filters);

//		AssociativeEntity filter1 = new AssociativeEntity();
//		filter1.setKey("increment_id");
//		filter1.setValue("100000097");
		
//		AssociativeEntity filter2 = new AssociativeEntity();
//		filter2.setKey("status");
//		filter2.setValue("processing");
//
//		Filters filters = new Filters();
//		filters.setFilter(new AssociativeEntity[] { filter2 });
//		
//		SalesOrderInfo[] c = magento.listSalesOrders(filters);
//		System.out.println(json.toJson(c));

//		SalesOrderEntity b = magento.getOrderInfo("100000097");
//		System.out.println(json.toJson(b));

//		System.out.println(json.toJson(magento.getCustomerInfo(38)));
		
//		CustomerCustomerEntity[] c = magento.getCustomerList(filters);
//		System.out.println(json.toJson(c));
		
		
//		CatalogCategoryEntityCreate categoryData = new CatalogCategoryEntityCreate();

//		String data = "{\"name\": \"Roupa de Frio\",\"description\":\"XXXXX\",\"active\":1,\"include_in_menu\":0, \"available_sort_by\":[\"Posição\", \"Nome do produto\", \"Preço\"], \"default_sort_by\":\"Posição\"}";
//		
//		Gson json = new Gson();
//		CreateCategoryDataParams categoryData = json.fromJson(data, CreateCategoryDataParams.class);
//		CatalogCategoryEntityCreate categoryData = json.fromJson(data, CatalogCategoryEntityCreate.class);
//		System.out.println(Arrays.toString(categoryData.getAvailable_sort_by()));
		
//		categoryData.setName("Roupa de Frio");
//		categoryData.setDescription("Roupa de frio para voce arrasar no inverno!!!");
//		categoryData.setIs_active(1);
//		categoryData.setInclude_in_menu(1);
//		categoryData.setAvailable_sort_by(new String[] {"Posição", "Nome do produto", "Preço"});
//		categoryData.setDefault_sort_by("Posição");
//
//		
//		int id = magento.createCategory(3, categoryData);
//		System.out.println("Category ID: " + id);
	}

}
