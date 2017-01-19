package br.com.mind.integrador.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Scanner;

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
import br.com.mind.magento.ClientWithoutWSI.SalesOrderShipmentEntity;
import br.com.mind.magento.ClientWithoutWSI.StoreEntity;

public class MageAPIWithoutWSI {
	
	final Class<?> referenceClass = MageAPIWithoutWSI.class;
	final URL url = referenceClass.getProtectionDomain().getCodeSource().getLocation();
	
	private String sessionId = null;
	private String user = null;
	private String password = null;
	private Mage_Api_Model_Server_V2_HandlerPortType mageService;
	
	public MageAPIWithoutWSI(String user, String password) throws RemoteException, ServiceException {
		this.user = user;
		this.password = password;
		
		MagentoServiceLocator locator = new MagentoServiceLocator();
		this.mageService = locator.getMage_Api_Model_Server_V2_HandlerPort();
		
		this.initializeSessionId();
	}
	
	private File getSessionFile() {
		File f = null;
		String sessionFileName = null;
		try{
		    f = new File(url.toURI()).getParentFile();
		    sessionFileName = f.getPath() + File.separator + "session.txt";
		} catch(final URISyntaxException e){
			System.out.println("Erro!!!");
		}
		return new File(sessionFileName);
	}
	
	private void initializeSessionId() {
		File sessionFile = getSessionFile();
		
		String actualSessionId = "";
		Scanner scanner;
		try {
			scanner = new Scanner(sessionFile);
			actualSessionId = scanner.next();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.sessionId = actualSessionId;  
		System.out.println("Current session ID: " + actualSessionId);
	}
	
	private void renewSessionId() {
		File sessionFile = getSessionFile();
		try {
			System.out.println("Session Expired - Getting new Session.");
			String newSessionId = this.mageLogin(this.user, this.password);
			PrintWriter writer = new PrintWriter(sessionFile);
			writer.println(newSessionId);
			writer.close();
			
			this.sessionId = newSessionId;
			
		} catch (RemoteException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String mageLogin(String user, String password) throws RemoteException {
		return this.mageService.login(user, password);
	}	

	public int createCategory(int parentId, CatalogCategoryEntityCreate categoryData) throws RemoteException {
		System.out.println("Creating category.");
		int result = this.mageService.catalogCategoryCreate(sessionId, parentId, categoryData, null); 
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
		
		CatalogProductEntity[] listResult = null;
		try {
			listResult = this.mageService.catalogProductList(sessionId, filters, null);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				listResult = this.mageService.catalogProductList(sessionId, filters, null);
			} else {
				throw e;
			}
		}

		int result = -1;
		if( listResult.length == 0 ) {
			try {
				result = this.mageService.catalogProductCreate(sessionId, product.type, product.set, product.sku, product.productData, product.storeView); 
			} catch(AxisFault e) {
				if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
					renewSessionId();
					listResult = this.mageService.catalogProductList(sessionId, filters, null);
				} else {
					throw e;
				}
			}
			System.out.println("Creating product. DONE. Product ID: " + result);
		} else {
			System.out.println("Product already exists. SKU " + product.sku + " - ID " + listResult[0].getProduct_id());
			result = Integer.parseInt(listResult[0].getProduct_id());
		}
		return result;
	}
	
	public String updateProducts(ProductUpdateCommand product) throws RemoteException {
		System.out.println("Updating product. ID " + product.sku);
		String result = null;
		try {
			result = String.valueOf(this.mageService.catalogProductUpdate(sessionId, product.sku, product.productData, product.storeView, "sku")); 
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = String.valueOf(this.mageService.catalogProductUpdate(sessionId, product.sku, product.productData, product.storeView, "sku"));
			} else {
				throw e;
			}
		}
		System.out.println("Updating product. DONE. " + result);
		return result;
	}

	public boolean uploadProductImages(ProductImageUploadCommand imageInfo) throws RemoteException {
		System.out.println("Uploading product Images. SKU: " + imageInfo.getProduct());

		CatalogProductImageEntity[] imageList = null;
		try {
			imageList = this.mageService.catalogProductAttributeMediaList(sessionId, imageInfo.getProduct(), null, "sku"); 
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				imageList = this.mageService.catalogProductAttributeMediaList(sessionId, imageInfo.getProduct(), null, "sku");
			} else {
				throw e;
			}
		}
		
		CatalogProductAttributeMediaCreateEntity[] imagesData = imageInfo.getData();
		
		for (CatalogProductAttributeMediaCreateEntity imageData : imagesData) {
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
				try {
					this.mageService.catalogProductAttributeMediaCreate(sessionId, imageInfo.getProduct(), imageData, imageInfo.getStoreView(), "sku");
				} catch(AxisFault e) {
					if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
						renewSessionId();
						this.mageService.catalogProductAttributeMediaCreate(sessionId, imageInfo.getProduct(), imageData, imageInfo.getStoreView(), "sku");
					} else {
						throw e;
					}
				}
			} else {
				System.out.println("Image already exists: " + imageData.getLabel());
			}
		}
		System.out.println("Upload product images.DONE.");
		return true;
	}

	public boolean createProductLink(String product, String linkedProduct) throws RemoteException {
		System.out.println("Assign product link.");
		boolean result = false; 
		try {
			result = this.mageService.catalogProductLinkAssign(sessionId, "grouped", product, linkedProduct, null, "sku"); 
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.catalogProductLinkAssign(sessionId, "grouped", product, linkedProduct, null, "sku");
			} else {
				throw e;
			}
		}
		System.out.println("Assign product link. DONE. Link created (" + product + " -> " + linkedProduct + "): " + result);
		return result;
	}
		
	public boolean addAttributeOption(AttributeAddOptionCommand attributeOption) throws RemoteException {
		System.out.println("Adding Attribute Option. Attr: " + attributeOption.getAttribute() + " Option: " + attributeOption.getData().getLabel()[0].getValue());
		boolean result = false; 
		try {
			result = this.mageService.catalogProductAttributeAddOption(sessionId, attributeOption.getAttribute(), attributeOption.getData()); 
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.catalogProductAttributeAddOption(sessionId, attributeOption.getAttribute(), attributeOption.getData());
			} else {
				throw e;
			}
		}
		System.out.println("Adding Attribute Option. DONE.");
		return result;
	}

	public CatalogProductReturnEntity getProductInfo(String idOrSku) throws RemoteException {
		System.out.println("Getting product Info SKU: " + idOrSku);
		CatalogProductReturnEntity result = null;
		try {
			result = this.mageService.catalogProductInfo(sessionId, idOrSku, null, null, "sku"); 
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.catalogProductInfo(sessionId, idOrSku, null, null, "sku");
			} else {
				throw e;
			}
		}
		System.out.println("Getting product Info SKU: " + idOrSku + ". DONE.");
		return result;
	}
	
	public CatalogAttributeOptionEntity[] listAttributeOptions( String attribute, String storeView ) throws RemoteException {
		System.out.println("Getting Attribute Options List. Attr: " + attribute);
		CatalogAttributeOptionEntity[] result = null;
		try {
			result = this.mageService.catalogProductAttributeOptions(sessionId, attribute, storeView);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.catalogProductAttributeOptions(sessionId, attribute, storeView);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Attribute Options List. DONE.");
		return result;
	}

	public CatalogAttributeEntity[] listAttributes() throws RemoteException {
		System.out.println("Getting Attribute List.");
		CatalogAttributeEntity[] result = null;
		try {
			result = this.mageService.catalogCategoryAttributeList(sessionId);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.catalogCategoryAttributeList(sessionId);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Attribute List. DONE.");
		return result;
	}
	 	 
	public CatalogProductEntity[] getProductList( Filters filters ) throws RemoteException {
		System.out.println("Getting Product List.");
		CatalogProductEntity[] result = null;
		try {
			result = this.mageService.catalogProductList(sessionId, filters, null);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.catalogProductList(sessionId, filters, null);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Product List. DONE.");
		return result;
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
		
		CustomerCustomerEntity[] list = null;
		try {
			list = this.mageService.customerCustomerList(sessionId, filters);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				list = this.mageService.customerCustomerList(sessionId, filters);
			} else {
				throw e;
			}
		}

		int result;
		if( list.length == 0 ) {
			try {
				result = this.mageService.customerCustomerCreate(sessionId, customer.getCustomerData());
			} catch(AxisFault e) {
				if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
					renewSessionId();
					result = this.mageService.customerCustomerCreate(sessionId, customer.getCustomerData());
				} else {
					throw e;
				}
			}
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
		try {
			result = this.mageService.customerAddressCreate(sessionId, addr.getCustomerId(), addr.getAddressdata()[0]);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.customerAddressCreate(sessionId, addr.getCustomerId(), addr.getAddressdata()[0]);
			} else {
				throw e;
			}
		}
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	
	public String createCustomerRewardsPoints(RewardpointsTransactionAdd transactionData) throws RemoteException {
		System.out.println("Creating Customer Reward Points. Customer ID: ");
		String result = null; 
		try {
			result = this.mageService.rewardpointsTransactionAdd(sessionId, transactionData);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.rewardpointsTransactionAdd(sessionId, transactionData);
			} else {
				throw e;
			}
		}
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	 
	public boolean updateCustomer(CustomerUpdateCommand customer) throws RemoteException {
		System.out.println("Updating customer. ID " + customer.getCustomer_id());
		boolean result = false;
		try {
			result = this.mageService.customerCustomerUpdate(sessionId, customer.getCustomer_id(), customer.getCustomerData());
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.customerCustomerUpdate(sessionId, customer.getCustomer_id(), customer.getCustomerData());
			} else {
				throw e;
			}
		}

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
		boolean result = false;
		try {
			result = this.mageService.customerAddressUpdate(sessionId, address.getAddressId(), address.getAddressdata());
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.customerAddressUpdate(sessionId, address.getAddressId(), address.getAddressdata());
			} else {
				throw e;
			}
		}
		System.out.println("Updating customer address. DONE.");
		return result;
	}

	public CustomerInfo[] getCustomerList( Filters filters ) throws RemoteException {
		System.out.println("Getting Customer List.");
		CustomerCustomerEntity[] customerList = this.mageService.customerCustomerList(sessionId, filters);
		try {
			customerList = this.mageService.customerCustomerList(sessionId, filters);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				customerList = this.mageService.customerCustomerList(sessionId, filters);
			} else {
				throw e;
			}
		}

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
		CustomerCustomerEntity result = null;
		try {
			result = this.mageService.customerCustomerInfo(sessionId, customerId, null);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.customerCustomerInfo(sessionId, customerId, null);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Customer Info. DONE.");
		return result;
	}

	public CustomerAddressEntityItem[] getCustomerAddress( int customerId ) throws RemoteException {
		System.out.println("Getting Customer Address. ID " + customerId);
		CustomerAddressEntityItem[] result = null;
		try {
			result = this.mageService.customerAddressList(sessionId, customerId);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.customerAddressList(sessionId, customerId);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Customer Address. DONE.");
		return result;
	}

	/**
	 * BEGIN - API´s relacionadas a VENDAS
	 */
	 
	public SalesOrderInfo[] listSalesOrders( Filters filters ) throws RemoteException {
		System.out.println("Getting Sales Orders List.");
		SalesOrderListEntity[] orderList = null;
		try {
			orderList = this.mageService.salesOrderList(sessionId, filters);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				orderList = this.mageService.salesOrderList(sessionId, filters);
			} else {
				throw e;
			}
		}

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
		SalesOrderEntity result = null;
		try {
			result = this.mageService.salesOrderInfo(sessionId, orderIncrementId); 
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderInfo(sessionId, orderIncrementId);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Sale Order Info. DONE.");
		return result;
	}
	
	public SalesOrderInvoiceEntity getInvoceInfo( String orderIncrementId ) throws RemoteException {
		System.out.println("Getting Invoice Info. OrderIncrementId " + orderIncrementId);
		SalesOrderInvoiceEntity result = null;
		try {
			result = this.mageService.salesOrderInvoiceInfo(sessionId, orderIncrementId);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderInvoiceInfo(sessionId, orderIncrementId);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Invoice Info. DONE.");
		return result;
	}
	
	public boolean addOrderComment( String orderIncrementId, String status, String comment ) throws RemoteException {
		System.out.println("Adding Order Comment. OrderIncrementId " + orderIncrementId);
		boolean result = false;
		try {
			result = this.mageService.salesOrderAddComment(sessionId, orderIncrementId, status, comment, null);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderAddComment(sessionId, orderIncrementId, status, comment, null);
			} else {
				throw e;
			}
		}
		System.out.println("Adding Order Comment. DONE.");
		return result;
	}
	
	public String addOrderShipment( String orderIncrementId, String comment ) throws RemoteException {
		System.out.println("Adding Order Shipment. OrderIncrementId " + orderIncrementId);
		String result = null;
		try {
			result = this.mageService.salesOrderShipmentCreate(sessionId, orderIncrementId, null, comment, 1, 1);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderShipmentCreate(sessionId, orderIncrementId, null, comment, 1, 1);
			} else {
				throw e;
			}
		}
		System.out.println("Adding Order Shipment. DONE.");
		return result;
	}

	public int addOrderTrack( String shipmentId, String courier, String trackNumber ) throws RemoteException {
		System.out.println("Adding Order Shipment Track. Shipment ID " + shipmentId);
		int result = -1;
		try {
			result = this.mageService.salesOrderShipmentAddTrack(sessionId, shipmentId, courier, "", trackNumber);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderShipmentAddTrack(sessionId, shipmentId, courier, "", trackNumber);
			} else {
				throw e;
			}
		}
		System.out.println("Adding Order Shipment Track. DONE.");
		return result;
	}
	
	public SalesOrderShipmentEntity[] getOrderShipmentList( String orderId ) throws RemoteException {
		Filters filters = new Filters();
		AssociativeEntity filter = new AssociativeEntity("order_id", orderId);
		filters.setFilter(new AssociativeEntity[] { filter });
		
		SalesOrderShipmentEntity[] result = null;
		try {
			result = this.mageService.salesOrderShipmentList(sessionId, filters);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderShipmentList(sessionId, filters);
			} else {
				throw e;
			}
		}
		return result;
	}

	public AssociativeEntity[] getCarriersInfo( String orderIncrementId ) throws RemoteException {
		System.out.println("Getting Carriers Info. OrderIncrementId " + orderIncrementId);
		AssociativeEntity[] result = null;
		try {
			result = this.mageService.salesOrderShipmentGetCarriers(sessionId, orderIncrementId);
		} catch(AxisFault e) {
			if (e.getFaultCode().toString().equalsIgnoreCase("5")) {
				renewSessionId();
				result = this.mageService.salesOrderShipmentGetCarriers(sessionId, orderIncrementId);
			} else {
				throw e;
			}
		}
		System.out.println("Getting Carriers Info. DONE.");
		return result;
	}
	 

	public static void main(String[] args) throws IOException, ServiceException {
		
		MageAPIWithoutWSI magento = new MageAPIWithoutWSI("integrador.noix", "YzU4ODZjNjQwYjI5NTc3YmZi");

		Gson json = new Gson();
		SalesOrderEntity b = magento.getOrderInfo("100000113");
		System.out.println(json.toJson(b));
		
//		String c = magento.addOrderShipment("100000115", "Envio pedido 100000115");
//		int s = magento.addOrderTrack(c, "signativa_correios", "1000ABCD");
		
//		SalesOrderShipmentEntity[] s = magento.getOrderShipmentList("76");
//		AssociativeEntity[] c = magento.getCarriersInfo("100000115");
//		System.out.println(json.toJson(s));
		

//		CatalogProductReturnEntity c = magento.getProductInfo("409602336");
//		System.out.println(json.toJson(c));
		
//		CatalogAttributeOptionEntity[] c = magento.listAttributeOptions(null, null);
//		CatalogAttributeEntity[] c = magento.listAttributes();
//		CustomerInfo[] c = magento.getCustomerList(filters);

//		AssociativeEntity filter1 = new AssociativeEntity();
//		filter1.setKey("increment_id");
//		filter1.setValue("100000097");
		
//		AssociativeEntity filter = new AssociativeEntity();
//		filter.setKey("gt");
//		filter.setValue("0");
//		
//		ComplexFilter complex_filter = new ComplexFilter("special_price", filter);
//
//		Filters filters = new Filters();
//		filters.setComplex_filter(new ComplexFilter[] { complex_filter });
//		
//		CatalogProductEntity[] c = magento.getProductList(filters);
//		System.out.println(json.toJson(c));
		
//		SalesOrderInfo[] c = magento.listSalesOrders(filters);
//		System.out.println(json.toJson(c));

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
