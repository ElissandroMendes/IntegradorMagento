package br.com.mind.integrador.core;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import com.google.gson.Gson;

import br.com.mind.integrador.commands.AttributeAddOptionCommand;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerAddressUpdateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.CustomerInfo;
import br.com.mind.integrador.commands.CustomerUpdateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductImageUploadCommand;
import br.com.mind.integrador.commands.ProductUpdateCommand;
import br.com.mind.integrador.commands.SalesOrderInfo;
import br.com.mind.magento.Client.AssociativeEntity;
import br.com.mind.magento.Client.CatalogAttributeEntity;
import br.com.mind.magento.Client.CatalogAttributeOptionEntity;
import br.com.mind.magento.Client.CatalogCategoryAttributeListRequestParam;
import br.com.mind.magento.Client.CatalogCategoryCreateRequestParam;
import br.com.mind.magento.Client.CatalogCategoryEntityCreate;
import br.com.mind.magento.Client.CatalogCategoryTree;
import br.com.mind.magento.Client.CatalogCategoryTreeRequestParam;
import br.com.mind.magento.Client.CatalogProductAttributeAddOptionRequestParam;
import br.com.mind.magento.Client.CatalogProductAttributeMediaCreateEntity;
import br.com.mind.magento.Client.CatalogProductAttributeMediaCreateRequestParam;
import br.com.mind.magento.Client.CatalogProductAttributeMediaInfoRequestParam;
import br.com.mind.magento.Client.CatalogProductAttributeMediaListRequestParam;
import br.com.mind.magento.Client.CatalogProductAttributeOptionsRequestParam;
import br.com.mind.magento.Client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.Client.CatalogProductAttributeSetListRequestParam;
import br.com.mind.magento.Client.CatalogProductCreateRequestParam;
import br.com.mind.magento.Client.CatalogProductEntity;
import br.com.mind.magento.Client.CatalogProductImageEntity;
import br.com.mind.magento.Client.CatalogProductInfoRequestParam;
import br.com.mind.magento.Client.CatalogProductLinkAssignRequestParam;
import br.com.mind.magento.Client.CatalogProductListRequestParam;
import br.com.mind.magento.Client.CatalogProductReturnEntity;
import br.com.mind.magento.Client.CatalogProductTypeEntity;
import br.com.mind.magento.Client.CatalogProductTypeListRequestParam;
import br.com.mind.magento.Client.CatalogProductUpdateRequestParam;
import br.com.mind.magento.Client.CustomerAddressCreateRequestParam;
import br.com.mind.magento.Client.CustomerAddressEntityItem;
import br.com.mind.magento.Client.CustomerAddressListRequestParam;
import br.com.mind.magento.Client.CustomerAddressUpdateRequestParam;
import br.com.mind.magento.Client.CustomerCustomerCreateRequestParam;
import br.com.mind.magento.Client.CustomerCustomerEntity;
import br.com.mind.magento.Client.CustomerCustomerInfoRequestParam;
import br.com.mind.magento.Client.CustomerCustomerListRequestParam;
import br.com.mind.magento.Client.CustomerCustomerUpdateRequestParam;
import br.com.mind.magento.Client.Filters;
import br.com.mind.magento.Client.LoginParam;
import br.com.mind.magento.Client.Mage_Api_Model_Server_Wsi_HandlerPortType;
import br.com.mind.magento.Client.MagentoInfoEntity;
import br.com.mind.magento.Client.MagentoInfoRequestParam;
import br.com.mind.magento.Client.MagentoServiceLocator;
import br.com.mind.magento.Client.SalesOrderEntity;
import br.com.mind.magento.Client.SalesOrderInfoRequestParam;
import br.com.mind.magento.Client.SalesOrderInvoiceEntity;
import br.com.mind.magento.Client.SalesOrderInvoiceInfoRequestParam;
import br.com.mind.magento.Client.SalesOrderListEntity;
import br.com.mind.magento.Client.SalesOrderListRequestParam;
import br.com.mind.magento.Client.StoreEntity;
import br.com.mind.magento.Client.StoreListRequestParam;

public class MageAPI {
	
	private String sessionId = null;
	private Mage_Api_Model_Server_Wsi_HandlerPortType mageService;
	
	public MageAPI(String sessionId) throws RemoteException, ServiceException {
		MagentoServiceLocator locator = new MagentoServiceLocator();
		this.mageService = locator.getMage_Api_Model_Server_Wsi_HandlerPort();
		this.sessionId = sessionId;
	}
	
	@SuppressWarnings("unused")
	private boolean isValidSession() throws RemoteException {
		System.out.println("Validating Session");
		boolean isValid = true;
		try {
			this.mageService.magentoInfo(new MagentoInfoRequestParam(sessionId));
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
		return this.mageService.login(new LoginParam(user, password)).getResult();
	}	

	public int createCategory(int parentId, CatalogCategoryEntityCreate categoryData) throws RemoteException {
		System.out.println("Creating category.");
		int result = this.mageService
				.catalogCategoryCreate(new CatalogCategoryCreateRequestParam(sessionId, parentId, categoryData, null))
				.getResult(); 
		System.out.println("Creating category. DONE. Category ID: " + result);
		return result;
	}
	
	public CatalogCategoryTree listCategories() throws RemoteException {
		System.out.println("Listing categories.");
		CatalogCategoryTree result = this.mageService
				.catalogCategoryTree(new CatalogCategoryTreeRequestParam(sessionId, null, null))
				.getResult(); 
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
		
		CatalogProductEntity[] listResult = this.mageService
				.catalogProductList(new CatalogProductListRequestParam(sessionId, filters, null))
				.getResult();

		int result;
		if( listResult.length == 0 ) {
			result = this.mageService.catalogProductCreate(new CatalogProductCreateRequestParam(sessionId, product.type, product.set, product.sku, product.productData, product.storeView)).getResult(); 
			System.out.println("Creating product. DONE. Product ID: " + result);
		} else {
			System.out.println("Product already exists. SKU " + product.sku + " - ID " + listResult[0].getProduct_id());
			result = Integer.parseInt(listResult[0].getProduct_id());
		}
		return result;
	}
	
	public String updateProducts(ProductUpdateCommand product) throws RemoteException {
		System.out.println("Updating product. ID " + product.sku);
		String result = String.valueOf(this.mageService.catalogProductUpdate(new CatalogProductUpdateRequestParam(sessionId, product.sku, product.productData, product.storeView, "sku"))); 
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
				this.mageService.catalogProductAttributeMediaCreate(new CatalogProductAttributeMediaCreateRequestParam(sessionId, imageInfo.getProduct(), imageData, imageInfo.getStoreView(), "sku")).getResult();
			} else {
				System.out.println("Image already exists: " + imageData.getLabel());
			}
		}
		System.out.println("Upload product images.DONE.");
		return true;
	}

	public String createProductLink(String product, String linkedProduct) throws RemoteException {
		System.out.println("Assign product link.");
		String result = this.mageService.catalogProductLinkAssign(new CatalogProductLinkAssignRequestParam(sessionId, "grouped", product, linkedProduct, null, "sku")).getResult(); 
		System.out.println("Assign product link. DONE. Link created (" + product + " -> " + linkedProduct + "): " + result);
		return result;
	}
		
	public boolean addAttributeOption(AttributeAddOptionCommand attributeOption) throws RemoteException {
		System.out.println("Adding Attribute Option. Attr: " + 
				attributeOption.getAttribute() + " Option: " + 
				attributeOption.getData().getLabel()[0].getValue());
		
		boolean result = this.mageService
				.catalogProductAttributeAddOption(new CatalogProductAttributeAddOptionRequestParam(sessionId, attributeOption.getAttribute(), attributeOption.getData())).isResult();
		
		System.out.println("Adding Attribute Option. DONE.");
		return result;
	}

	public CatalogProductReturnEntity getProductInfo(String idOrSku) throws RemoteException {
		System.out.println("Getting product Info SKU: " + idOrSku);
		CatalogProductReturnEntity result = this.mageService.catalogProductInfo(new CatalogProductInfoRequestParam(sessionId, idOrSku, null, null, "sku")).getResult();
		System.out.println("Getting product Info SKU: " + idOrSku + ". DONE.");
		return result;
	}
	
	public CatalogProductImageEntity[] getProductImageList(String skuOrIdProduct) throws RemoteException {
		return this.mageService
				.catalogProductAttributeMediaList(new CatalogProductAttributeMediaListRequestParam(sessionId, skuOrIdProduct, null, "sku")).getResult(); 
	}
	public CatalogProductImageEntity getProductImageInfo(String skuOrIdProduct, String fileName) throws RemoteException {
		return this.mageService
				.catalogProductAttributeMediaInfo(new CatalogProductAttributeMediaInfoRequestParam(sessionId, skuOrIdProduct, fileName, null, "sku")).getResult(); 
	}
	
	public CatalogProductTypeEntity[] listProductTypes() throws RemoteException {
		return this.mageService.catalogProductTypeList(new CatalogProductTypeListRequestParam(sessionId)).getResult();
	}

	public CatalogProductAttributeSetEntity[] listProductAttributeSet() throws RemoteException {
		return this.mageService.catalogProductAttributeSetList(new CatalogProductAttributeSetListRequestParam(sessionId)).getResult();
	}
	
	public CatalogAttributeOptionEntity[] listAttributeOptions( String attribute, String storeView ) throws RemoteException {
		System.out.println("Getting Attribute Options List. Attr: " + attribute);
		CatalogAttributeOptionEntity[] result = this.mageService
													.catalogProductAttributeOptions(new CatalogProductAttributeOptionsRequestParam(sessionId, attribute, storeView))
													.getResult();
		System.out.println("Getting Attribute Options List. DONE.");
		return result;
	}

	public CatalogAttributeEntity[] listAttributes () throws RemoteException {
		System.out.println("Getting Attribute List.");
		CatalogAttributeEntity[] result = this.mageService
				.catalogCategoryAttributeList(new CatalogCategoryAttributeListRequestParam(sessionId)).getResult();
		System.out.println("Getting Attribute List. DONE.");
		return result;
	}
	 	 
	public CatalogProductEntity[] getProductList( Filters filters ) throws RemoteException {
		System.out.println("Getting Product List.");
		CatalogProductEntity[] result = this.mageService
											.catalogProductList(new CatalogProductListRequestParam(sessionId, filters, null))
											.getResult();
		System.out.println("Getting Product List. DONE.");
		return result;
	}

	public CatalogProductEntity[] listAllProducts() throws RemoteException {
		return this.mageService
					.catalogProductList(new CatalogProductListRequestParam(sessionId, null, null))
					.getResult();
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
		
		CustomerCustomerEntity[] list = this.mageService.customerCustomerList(new CustomerCustomerListRequestParam(sessionId, filters)).getResult();
		int result;
		
		if( list.length == 0 ) {
			result = this.mageService.customerCustomerCreate(new CustomerCustomerCreateRequestParam(sessionId, customer.getCustomerData())).getResult(); 
			System.out.println("Creating customer. DONE. Customer ID: " + result);
		} else {
			System.out.println("Customer already exists. Email " + customer.getCustomerData().getEmail() + " - ID " + list[0].getCustomer_id());
			result = list[0].getCustomer_id();
		}
		return result;
	}

	public int createCustomerAddress(CustomerAddressCreateCommand addr) throws RemoteException {
		System.out.println("Creating Customer Address.");
		int result = this.mageService.customerAddressCreate(new CustomerAddressCreateRequestParam(sessionId, addr.getCustomerId(), addr.getAddressdata()[0])).getResult(); 
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	
	 
	public boolean updateCustomer(CustomerUpdateCommand customer) throws RemoteException {
		System.out.println("Updating customer. ID " + customer.getCustomer_id());
		boolean result = this.mageService
				.customerCustomerUpdate(new CustomerCustomerUpdateRequestParam(sessionId, customer.getCustomer_id(), customer.getCustomerData()))
				.isResult();
		System.out.println("Updating customer. DONE.");
		return result;
	}

	public boolean updateCustomerAddress(CustomerAddressUpdateCommand address) throws RemoteException {
		System.out.println("Updating customer address.");
		boolean result = this.mageService
				.customerAddressUpdate(new CustomerAddressUpdateRequestParam(sessionId, address.getAddressId(), address.getAddressdata()))
				.isResult();
		System.out.println("Updating customer address. DONE.");
		return result;
	}

	public CustomerInfo[] getCustomerList( Filters filters ) throws RemoteException {
		System.out.println("Getting Customer List.");
		CustomerCustomerEntity[] customerList = this.mageService.customerCustomerList(new CustomerCustomerListRequestParam(sessionId, filters)).getResult();
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
				this.mageService.customerCustomerInfo(new CustomerCustomerInfoRequestParam(sessionId, customerId, null)).getResult();
		System.out.println("Getting Customer Info. DONE.");
		return result;
	}

	public CustomerAddressEntityItem[] getCustomerAddress( int customerId ) throws RemoteException {
		System.out.println("Getting Customer Address. ID " + customerId);
		CustomerAddressEntityItem[] result = 
				this.mageService.customerAddressList(new CustomerAddressListRequestParam(sessionId, customerId)).getResult();
		System.out.println("Getting Customer Address. DONE.");
		return result;
	}

	public StoreEntity[] listStore() throws RemoteException {
		return this.mageService.storeList(new StoreListRequestParam(sessionId)).getResult();
	}
	
	
	/**
	 * BEGIN - API´s relacionadas a VENDAS
	 */
	 
	public SalesOrderInfo[] listSalesOrders( Filters filters ) throws RemoteException {
		System.out.println("Getting Sales Orders List.");
		SalesOrderListEntity[] orderList = this.mageService.salesOrderList(new SalesOrderListRequestParam(sessionId, filters)).getResult();

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
		SalesOrderEntity result = this.mageService.salesOrderInfo(new SalesOrderInfoRequestParam(sessionId, orderIncrementId)).getResult();
		System.out.println("Getting Sale Order Info. DONE.");
		return result;
	}
	
	public MagentoInfoEntity getMagentoInfo() throws RemoteException {
		System.out.println("Getting Sales Orders List.");
		MagentoInfoEntity result = this.mageService.magentoInfo(new MagentoInfoRequestParam(sessionId)).getResult();
		System.out.println("Getting Sales Orders List. DONE.");
		return result;
	}
	
	public  SalesOrderInvoiceEntity getInvoceInfo( String orderIncrementId ) throws RemoteException {
		System.out.println("Getting Invoice Info. OrderIncrementId " + orderIncrementId);
		SalesOrderInvoiceEntity result = this.mageService.salesOrderInvoiceInfo(new SalesOrderInvoiceInfoRequestParam(sessionId, orderIncrementId)).getResult();
		System.out.println("Getting Invoice Info. DONE.");
		return result;
	}

	public static void main(String[] args) throws IOException, ServiceException {
		MageAPI magento = new MageAPI("2e64f09e2a661f2ff02a7389737d8757");
//		String sessionId = magento.mageLogin("integrador.noix", "YzU4ODZjNjQwYjI5NTc3YmZi");
//		System.out.println(sessionId);
//		
		Gson json = new Gson();
		
//		CatalogAttributeOptionEntity[] c = magento.listAttributeOptions(null, null);
//		CatalogAttributeEntity[] c = magento.listAttributes();
//		CustomerInfo[] c = magento.getCustomerList(filters);

//		AssociativeEntity filter = new AssociativeEntity();
//		filter.setKey("increment_id");
//		filter.setValue("100000113");
//		
//		Filters filters = new Filters();
//		filters.setFilter(new AssociativeEntity[] { filter });
//		
//		SalesOrderInfo[] c = magento.listSalesOrders(filters);
//		System.out.println(json.toJson(c));

		SalesOrderEntity b = magento.getOrderInfo("100000113");
		System.out.println(json.toJson(b));

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

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
