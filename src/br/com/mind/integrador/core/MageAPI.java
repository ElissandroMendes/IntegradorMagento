package br.com.mind.integrador.core;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.mind.integrador.commands.AttributeAddOptionCommand;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductImageUploadCommand;
import br.com.mind.integrador.commands.ProductUpdateCommand;
import br.com.mind.magento.client.CatalogAttributeOptionEntity;
import br.com.mind.magento.client.CatalogCategoryEntityCreate;
import br.com.mind.magento.client.CatalogCategoryTree;
import br.com.mind.magento.client.CatalogProductAttributeMediaCreateEntity;
import br.com.mind.magento.client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductReturnEntity;
import br.com.mind.magento.client.CatalogProductTypeEntity;
import br.com.mind.magento.client.Filters;
import br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType;
import br.com.mind.magento.client.MagentoServiceLocator;
import br.com.mind.magento.client.SalesOrderListEntity;
import br.com.mind.magento.client.StoreEntity;

public class MageAPI {
	
	private String sessionId = null;
	private MageOptions options = null;
	private Mage_Api_Model_Server_V2_HandlerPortType mageService;
	
	public MageAPI(MageOptions options) {
		this.options = options;
		this.sessionId = options.getSessionId();
		
		try {
			this.getMageService();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	private void getMageService() throws ServiceException {
		MagentoServiceLocator locator = new MagentoServiceLocator();
		locator.setMage_Api_Model_Server_V2_HandlerPortEndpointAddress(options.getEndpointUrl());
		this.mageService = locator.getMage_Api_Model_Server_V2_HandlerPort(); 
	}
	
	public String mageLogin() throws ServiceException, RemoteException {
		return this.mageService.login(options.getUser(), options.getPassword());
	}	

	public String createCategory(int parentId2, CatalogCategoryEntityCreate categoryData) throws RemoteException {
		System.out.println("Creating category.");
		String result = String.valueOf(this.mageService.catalogCategoryCreate(this.getSessionId(), parentId2, categoryData, null)); 
		System.out.println("Creating category. DONE. Category ID: " + result);
		return result;
	}
	
	public CatalogCategoryTree listCategories() throws RemoteException {
		System.out.println("Listing categories.");
		CatalogCategoryTree result = this.mageService.catalogCategoryTree(this.getSessionId(), null, null); 
		System.out.println("Listing categories. DONE.");
		return result;
	}

	/**
	 * BEGIN - API´s relacionadas a PRODUTOS
	 */

	public String createProducts(ProductCreateCommand product) throws RemoteException {
		System.out.println("Creating product. SKU " + product.sku);
		String result = String.valueOf(this.mageService.catalogProductCreate(this.getSessionId(), product.type, product.set, product.sku, product.productData, product.storeView)); 
		System.out.println("Creating product. DONE. Product ID: " + result);
		return result;
	}
	
	public String updateProducts(ProductUpdateCommand product) throws RemoteException {
		System.out.println("Updating product. ID " + product.sku);
		String result = String.valueOf(this.mageService.catalogProductUpdate(this.getSessionId(), product.sku, product.productData, product.storeView, "")); 
		System.out.println("Updating product. DONE. " + result);
		return result;
	}

	public boolean uploadProductImages(ProductImageUploadCommand imageInfo) throws RemoteException {
		System.out.println("Uploading product Images. SKU: " + imageInfo.getProduct());
		for (CatalogProductAttributeMediaCreateEntity imageData : imageInfo.getData()) {
			System.out.println("Uploading  Image: " + imageData.getFile().getName());
			this.mageService.catalogProductAttributeMediaCreate(this.getSessionId(), imageInfo.getProduct(), imageData, imageInfo.getStoreView(), "sku"); 
		}
		System.out.println("Upload product images.DONE.");
		return true;
	}

	public boolean createProductLink(String product, String linkedProduct) throws RemoteException {
		System.out.println("Assign product link.");
		boolean result = this.mageService.catalogProductLinkAssign(this.getSessionId(), "grouped", product, linkedProduct, null, null); 
		System.out.println("Assign product link. DONE. Link created (" + product + "-> + " + linkedProduct + "): " + result);
		return result;
	}
		
	public boolean addAttributeOption(AttributeAddOptionCommand attributeOption) throws RemoteException {
		System.out.println("Adding Attribute Option. Attr: " + attributeOption.getAttribute() + " Option: " + attributeOption.getData().getLabel()[0].getValue());
		boolean result = this.mageService.catalogProductAttributeAddOption(this.getSessionId(), attributeOption.getAttribute(), attributeOption.getData());
		System.out.println("Adding Attribute Option. DONE.");
		return result;
	}

	public CatalogProductReturnEntity getProductInfo(String idOrSku) throws RemoteException {
		return this.mageService.catalogProductInfo(this.getSessionId(), idOrSku, null, null, null);
	}
	
	public CatalogProductTypeEntity[] listProductTypes() throws RemoteException {
		return this.mageService.catalogProductTypeList(this.getSessionId());
	}

	public CatalogProductAttributeSetEntity[] listProductAttributeSet() throws RemoteException {
		return this.mageService.catalogProductAttributeSetList(this.getSessionId());
	}
	
	public CatalogAttributeOptionEntity[] listAttributeOptions( String attribute, String storeView ) throws RemoteException {
		System.out.println("Getting Attribute Options List. Attr: " + attribute);
		CatalogAttributeOptionEntity[] result = this.mageService.catalogProductAttributeOptions(this.getSessionId(), attribute, storeView);
		System.out.println("Getting Attribute Options List. DONE.");
		return result;
	}
	 	 
	public CatalogProductEntity[] getProductList( Filters filters ) throws RemoteException {
		System.out.println("Getting Product List.");
		CatalogProductEntity[] result = this.mageService.catalogProductList(this.getSessionId(), filters, null);
		System.out.println("Getting Product List. DONE.");
		return result;
	}

	public CatalogProductEntity[] listAllProducts() throws RemoteException {
		return this.mageService.catalogProductList(this.getSessionId(), null, null);
	}
	
	/**
	 * END - API´s relacionadas a PRODUTOS
	 */

	/**
	 * BEGIN - API´s relacionadas a CLIENTES
	 */
	public String createCustomer(CustomerCreateCommand customer) throws RemoteException {
		System.out.println("Creating customer.");
		String result = String.valueOf(this.mageService.customerCustomerCreate(this.getSessionId(), customer.customerData)); 
		System.out.println("Creating customer. DONE. Customer ID: " + result);
		return result;
	}

	public String createCustomerAddress(CustomerAddressCreateCommand addr) throws RemoteException {
		System.out.println("Creating Customer Address.");
		String result = String.valueOf(this.mageService.customerAddressCreate(this.getSessionId(), addr.getCustomerId(), addr.getAddressdata()[0])); 
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	
	public StoreEntity[] listStore() throws RemoteException {
		return this.mageService.storeList(this.getSessionId());
	}
	
	public SalesOrderListEntity[] getOrderList( Filters filters ) throws RemoteException {
		System.out.println("Getting Order List.");
		SalesOrderListEntity[] result = this.mageService.salesOrderList(this.getSessionId(), filters);
		System.out.println("Getting Order List. DONE.");
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		MageOptions c = new MageOptions();
		
		c.setEndpointUrl("http://handara.signashop.com.br/api/v2_soap");
		c.setPassword("YzU4ODZjNjQwYjI5NTc3YmZi");
		c.setUser("integrador.noix");
		
		MageAPI magento = new MageAPI(c);
		magento.listStore();
		
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
