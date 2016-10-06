package br.com.mind.integrador;

import java.rmi.RemoteException;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

import com.google.gson.Gson;

import br.com.mind.magento.client.CatalogCategoryEntityCreate;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType;
import br.com.mind.magento.client.MagentoServiceLocator;

public class MageAPI {
	
	private String user;
	private String password;
	private String endpointUrl;
	
	private static Mage_Api_Model_Server_V2_HandlerPortType mageService;
	private static String sessionId;
	
	
	
	public MageAPI(ConnectionData connData) {
		
		this.user = connData.getSoapApiUser();
		this.password = connData.getSoapApiPassword();
		this.endpointUrl = connData.getSoapApiEndpointUrl();

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

//	public String createProduct(int sku, CatalogProductCreateEntity productData) throws RemoteException {
//	}
	
	public CatalogProductEntity[] listAllProducts() throws RemoteException {
		return MageAPI.mageService.catalogProductList(MageAPI.sessionId, null, null);
	}
	
	public void createProduct() {
		
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
