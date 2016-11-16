package br.com.mind.integrador.core;

import java.rmi.RemoteException;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

import com.google.gson.Gson;

import br.com.mind.integrador.commands.AttributeAddOptionCommand;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductUpdateCommand;
import br.com.mind.integrador.commands.UploadImagemCommand;
import br.com.mind.magento.client.CatalogAttributeOptionEntity;
import br.com.mind.magento.client.CatalogCategoryEntityCreate;
import br.com.mind.magento.client.CatalogCategoryTree;
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
	
	private String user;
	private String password;
	private String endpointUrl;
	
	private static Mage_Api_Model_Server_V2_HandlerPortType mageService;
	private static String sessionId;
	
	public MageAPI(ConnectionData connData) {
		
		this.user = connData.getUser();
		this.password = connData.getPassword();
		this.endpointUrl = connData.getEndpointUrl();

		try {
			this.getMageService();
			this.mageLogin();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	private void getMageService() throws ServiceException {
		System.out.println("Getting locator and server.");
		MagentoServiceLocator locator = new MagentoServiceLocator();
		locator.setMage_Api_Model_Server_V2_HandlerPortEndpointAddress(this.endpointUrl);
		MageAPI.mageService = locator.getMage_Api_Model_Server_V2_HandlerPort(); 
		System.out.println("Getting locator and server. DONE.");
	}
	
	private void mageLogin() throws ServiceException, RemoteException {
		System.out.println("Logging...");
		MageAPI.sessionId = MageAPI.mageService.login(this.user, this.password);
		System.out.println("Logging... DONE. Session ID: " + MageAPI.sessionId);
	}	

	public String createCategory(int parentId2, CatalogCategoryEntityCreate categoryData) throws RemoteException {
		System.out.println("Creating category.");
		String result = String.valueOf(MageAPI.mageService.catalogCategoryCreate(MageAPI.sessionId, parentId2, categoryData, null)); 
		System.out.println("Creating category. DONE. Category ID: " + result);
		return result;
	}
	
	public CatalogCategoryTree listCategories() throws RemoteException {
		System.out.println("Listing categories.");
		CatalogCategoryTree result = MageAPI.mageService.catalogCategoryTree(MageAPI.sessionId, null, null); 
		System.out.println("Listing categories. DONE.");
		return result;
	}

	/**
	 * BEGIN - API´s relacionadas a PRODUTOS
	 */

	public String createProducts(ProductCreateCommand product) throws RemoteException {
		System.out.println("Creating product. SKU " + product.sku);
		String result = String.valueOf(MageAPI.mageService.catalogProductCreate(MageAPI.sessionId, product.type, product.set, product.sku, product.productData, product.storeView)); 
		System.out.println("Creating product. DONE. Product ID: " + result);
		return result;
	}
	
	public String updateProducts(ProductUpdateCommand product) throws RemoteException {
		System.out.println("Updating product. ID " + product.sku);
		String result = String.valueOf(MageAPI.mageService.catalogProductUpdate(MageAPI.sessionId, product.sku, product.productData, product.storeView, "")); 
		System.out.println("Updating product. DONE. " + result);
		return result;
	}

	public boolean createProductLink(String product, String linkedProduct) throws RemoteException {
		System.out.println("Assign product link.");
		System.out.println(product);
		System.out.println(linkedProduct);
		boolean result = MageAPI.mageService.catalogProductLinkAssign(MageAPI.sessionId, "grouped", product, linkedProduct, null, null); 
		System.out.println("Assign product link. DONE. Link created (" + product + "-> + " + linkedProduct + "): " + result);
		return result;
	}
		
	public String uploadNewProductImage(UploadImagemCommand uploadImageInfo) throws RemoteException {
		System.out.println("Uploading product image.");
		String result = MageAPI.mageService.catalogProductAttributeMediaCreate(MageAPI.sessionId, uploadImageInfo.getProduct(), uploadImageInfo.getData(), null, "SKU");
		System.out.println("Uploading product image. DONE. Image URL: " + result);
		return result;
	}
	
	public boolean addAttributeOption(AttributeAddOptionCommand attributeOption) throws RemoteException {
		System.out.println("Adding Attribute Option. Attr: " + attributeOption.getAttribute() + " Option: " + attributeOption.getData().getLabel()[0].getValue());
		boolean result = MageAPI.mageService.catalogProductAttributeAddOption(MageAPI.sessionId, attributeOption.getAttribute(), attributeOption.getData());
		System.out.println("Adding Attribute Option. DONE.");
		return result;
	}

	public CatalogProductEntity[] listAllProducts() throws RemoteException {
		return MageAPI.mageService.catalogProductList(MageAPI.sessionId, null, null);
	}
	
	public CatalogProductReturnEntity getProductInfo(String idOrSku) throws RemoteException {
		return MageAPI.mageService.catalogProductInfo(MageAPI.sessionId, idOrSku, null, null, null);
	}
	
	public CatalogProductTypeEntity[] listProductTypes() throws RemoteException {
		return MageAPI.mageService.catalogProductTypeList(MageAPI.sessionId);
	}

	public CatalogProductAttributeSetEntity[] listProductAttributeSet() throws RemoteException {
		return MageAPI.mageService.catalogProductAttributeSetList(MageAPI.sessionId);
	}
	
	public CatalogAttributeOptionEntity[] listAttributeOptions( String attribute, String storeView ) throws RemoteException {
		System.out.println("Getting Attribute Options List. Attr: " + attribute);
		CatalogAttributeOptionEntity[] result = MageAPI.mageService.catalogProductAttributeOptions(MageAPI.sessionId, attribute, storeView);
		System.out.println("Getting Attribute Options List. DONE.");
		return result;
	}
	 	 
	/**
	 * END - API´s relacionadas a PRODUTOS
	 */

	/**
	 * BEGIN - API´s relacionadas a CLIENTES
	 */
	public String createCustomer(CustomerCreateCommand customer) throws RemoteException {
		System.out.println("Creating customer.");
		String result = String.valueOf(MageAPI.mageService.customerCustomerCreate(MageAPI.sessionId, customer.customerData)); 
		System.out.println("Creating customer. DONE. Customer ID: " + result);
		return result;
	}

	public String createCustomerAddress(CustomerAddressCreateCommand addr) throws RemoteException {
		System.out.println("Creating Customer Address.");
		String result = String.valueOf(MageAPI.mageService.customerAddressCreate(MageAPI.sessionId, addr.getCustomerId(), addr.getAddressdata()[0])); 
		System.out.println("Creating customer. DONE. Customer Addres ID: " + result);
		return result;
	}
	
	public StoreEntity[] listStore() throws RemoteException {
		return MageAPI.mageService.storeList(MageAPI.sessionId);
	}
	
	public SalesOrderListEntity[] getOrderList( Filters filters ) throws RemoteException {
		System.out.println("Getting Order List.");
		SalesOrderListEntity[] result = MageAPI.mageService.salesOrderList(MageAPI.sessionId, filters);
		System.out.println("Getting Order List. DONE.");
		return result;
	}
	
	public static void main(String[] args) throws RemoteException {
//		MageAPI magento = new MageAPI();
//		CatalogCategoryEntityCreate categoryData = new CatalogCategoryEntityCreate();

		String data = "{\"name\": \"Roupa de Frio\",\"description\":\"XXXXX\",\"active\":1,\"include_in_menu\":0, \"available_sort_by\":[\"Posição\", \"Nome do produto\", \"Preço\"], \"default_sort_by\":\"Posição\"}";
		
		Gson json = new Gson();
//		CreateCategoryDataParams categoryData = json.fromJson(data, CreateCategoryDataParams.class);
		CatalogCategoryEntityCreate categoryData = json.fromJson(data, CatalogCategoryEntityCreate.class);
		System.out.println(Arrays.toString(categoryData.getAvailable_sort_by()));
		
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
