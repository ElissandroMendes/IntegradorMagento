package br.com.mind.integrador.core;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.google.gson.Gson;

import br.com.mind.integrador.commands.AttributeAddOptionCommand;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductImageUploadCommand;
import br.com.mind.integrador.commands.ProductUpdateCommand;
import br.com.mind.magento.client.AssociativeEntity;
import br.com.mind.magento.client.CatalogAttributeOptionEntity;
import br.com.mind.magento.client.CatalogCategoryEntityCreate;
import br.com.mind.magento.client.CatalogCategoryTree;
import br.com.mind.magento.client.CatalogProductAttributeMediaCreateEntity;
import br.com.mind.magento.client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductImageEntity;
import br.com.mind.magento.client.CatalogProductReturnEntity;
import br.com.mind.magento.client.CatalogProductTypeEntity;
import br.com.mind.magento.client.ComplexFilter;
import br.com.mind.magento.client.CustomerCustomerEntity;
import br.com.mind.magento.client.Filters;
import br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType;
import br.com.mind.magento.client.MagentoServiceLocator;
import br.com.mind.magento.client.SalesOrderListEntity;
import br.com.mind.magento.client.StoreEntity;

public class MageAPI {
	
	private String endpointUrl = null;
	private String sessionId = null;
	private Mage_Api_Model_Server_V2_HandlerPortType mageService;
	
	public MageAPI(String endpointUrl, String sessionId) {
		this.endpointUrl = endpointUrl;
		this.sessionId = sessionId;
		
		try {
			this.getMageService();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	private void getMageService() throws ServiceException {
		MagentoServiceLocator locator = new MagentoServiceLocator();
		locator.setMage_Api_Model_Server_V2_HandlerPortEndpointAddress(endpointUrl);
		this.mageService = locator.getMage_Api_Model_Server_V2_HandlerPort(); 
	}
	
	public String mageLogin(String user, String password) throws RemoteException {
		return this.mageService.login(user, password);
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
		
		Filters filters = new Filters();
		AssociativeEntity filter = new AssociativeEntity();
		filter.setKey("sku");
		filter.setValue(product.sku);
		
		filters.setFilter(new AssociativeEntity[]{ filter });
		
		CatalogProductEntity[] list = this.mageService.catalogProductList(this.getSessionId(), filters, null);
		String result = null;
		
		if( list.length == 0 ) {
			result = String.valueOf(this.mageService.catalogProductCreate(this.getSessionId(), product.type, product.set, product.sku, product.productData, product.storeView)); 
			System.out.println("Creating product. DONE. Product ID: " + result);
		} else {
			System.out.println("Product already exists. SKU " + product.sku + " - ID " + list[0].getProduct_id());
			result = list[0].getProduct_id();
		}
		return result;
	}
	
	public String updateProducts(ProductUpdateCommand product) throws RemoteException {
		System.out.println("Updating product. ID " + product.sku);
		String result = String.valueOf(this.mageService.catalogProductUpdate(this.getSessionId(), product.sku, product.productData, product.storeView, "sku")); 
		System.out.println("Updating product. DONE. " + result);
		return result;
	}

	public boolean uploadProductImages(ProductImageUploadCommand imageInfo) throws RemoteException {
		System.out.println("Uploading product Images. SKU: " + imageInfo.getProduct());
		CatalogProductImageEntity[] imageList = getProductImageList(imageInfo.getProduct());
		for (CatalogProductAttributeMediaCreateEntity imageData : imageInfo.getData()) {

//			if (imageData.getTypes().length == 0) {
//				imageData.setTypes(new String[] {"image"});
//			}
			
			boolean imageExists = false;
			for (CatalogProductImageEntity image : imageList) {
				if (image.getLabel().equalsIgnoreCase(imageData.getLabel())) {
					imageExists = true;
					break;
				}
			}
			
			if ( !imageExists ) {
				System.out.println("Uploading Image: " + imageData.getLabel());
				this.mageService.catalogProductAttributeMediaCreate(this.getSessionId(), imageInfo.getProduct(), imageData, imageInfo.getStoreView(), "sku");
			} else {
				System.out.println("Image already exists: " + imageData.getLabel());
			}
		}
		System.out.println("Upload product images.DONE.");
		return true;
	}

	public boolean createProductLink(String product, String linkedProduct) throws RemoteException {
		System.out.println("Assign product link.");
		boolean result = this.mageService.catalogProductLinkAssign(this.getSessionId(), "grouped", product, linkedProduct, null, "sku"); 
		System.out.println("Assign product link. DONE. Link created (" + product + " -> " + linkedProduct + "): " + result);
		return result;
	}
		
	public boolean addAttributeOption(AttributeAddOptionCommand attributeOption) throws RemoteException {
		System.out.println("Adding Attribute Option. Attr: " + attributeOption.getAttribute() + " Option: " + attributeOption.getData().getLabel()[0].getValue());
		boolean result = this.mageService.catalogProductAttributeAddOption(this.getSessionId(), attributeOption.getAttribute(), attributeOption.getData());
		System.out.println("Adding Attribute Option. DONE.");
		return result;
	}

	public CatalogProductReturnEntity getProductInfo(String idOrSku) throws RemoteException {
		System.out.println("Getting product Info SKU: " + idOrSku);
		System.out.println("Getting product Info SKU: " + idOrSku + ". DONE.");
		return this.mageService.catalogProductInfo(this.getSessionId(), idOrSku, null, null, "sku");
	}
	
	public CatalogProductImageEntity[] getProductImageList(String skuOrIdProduct) throws RemoteException {
		return this.mageService.catalogProductAttributeMediaList(this.getSessionId(), skuOrIdProduct, null, "sku"); 
	}
	public CatalogProductImageEntity getProductImageInfo(String skuOrIdProduct, String fileName) throws RemoteException {
		return this.mageService.catalogProductAttributeMediaInfo(this.getSessionId(), skuOrIdProduct, fileName, null, "sku"); 
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
	
	 
	public CustomerCustomerEntity[] getCustomerList( Filters filters ) throws RemoteException {
		System.out.println("Getting Customer List.");
		CustomerCustomerEntity[] result = this.mageService.customerCustomerList(getSessionId(), filters);
		System.out.println("Getting Customer List. DONE.");
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
//		MageOptions c = new MageOptions();
//		
//		c.setEndpointUrl("http://handara.signashop.com.br/api/v2_soap");
//		c.setPassword("YzU4ODZjNjQwYjI5NTc3YmZi");
//		c.setUser("integrador.noix");
//		 -> 
		MageAPI magento = new MageAPI("http://handara.signashop.com.br/api/v2_soap", "bc207d6a69b6b8ac009039c0552e2ab2");
//		System.out.println(magento.createProductLink("476972944", 	"476972940"));
//		CatalogProductImageEntity[] c = magento.getProductImageList("476972944");
		
		Filters filters = new Filters();
		AssociativeEntity idx1 = new AssociativeEntity("gteq", "2016-06-01");
		AssociativeEntity idx2 = new AssociativeEntity("lteq", "2016-06-30");
		
		filters.setComplex_filter(new ComplexFilter[] { new ComplexFilter("created_at", idx1), new ComplexFilter("created_at", idx2) });
//		filters.setFilter(new AssociativeEntity[] { new AssociativeEntity("created_at", "2016-03-17 23:52:35") });
		
		CustomerCustomerEntity[] c = magento.getCustomerList(filters);
		Gson json = new Gson();
		System.out.println(json.toJson(c));
		
//		[{"file":"/1/0/1060093_-1895818022.jpg_21.jpg","label":"1060093_-1895818022.jpg","position":"0","exclude":"0","url":"http://handara.signashop.com.br/media/catalog/product/1/0/1060093_-1895818022.jpg_21.jpg","types":[],"__hashCodeCalc":false},{"file":"/1/0/1060093_1_-1895818022.jpg_21.jpg","label":"1060093_1_-1895818022.jpg","position":"0","exclude":"0","url":"http://handara.signashop.com.br/media/catalog/product/1/0/1060093_1_-1895818022.jpg_21.jpg","types":[],"__hashCodeCalc":false},{"file":"/1/0/1060093_-1895818024.jpg_21.jpg","label":"1060093_-1895818024.jpg","position":"0","exclude":"0","url":"http://handara.signashop.com.br/media/catalog/product/1/0/1060093_-1895818024.jpg_21.jpg","types":[],"__hashCodeCalc":false},{"file":"/1/0/1060093_1_-1895818024.jpg_21.jpg","label":"1060093_1_-1895818024.jpg","position":"0","exclude":"0","url":"http://handara.signashop.com.br/media/catalog/product/1/0/1060093_1_-1895818024.jpg_21.jpg","types":["small_image"],"__hashCodeCalc":false},{"file":"/1/0/1060093_-1895818023.jpg_21.jpg","label":"1060093_-1895818023.jpg","position":"0","exclude":"0","url":"http://handara.signashop.com.br/media/catalog/product/1/0/1060093_-1895818023.jpg_21.jpg","types":[],"__hashCodeCalc":false},{"file":"/1/0/1060093_1_-1895818023.jpg_21.jpg","label":"1060093_1_-1895818023.jpg","position":"0","exclude":"0","url":"http://handara.signashop.com.br/media/catalog/product/1/0/1060093_1_-1895818023.jpg_21.jpg","types":["thumbnail"],"__hashCodeCalc":false}]

		
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
