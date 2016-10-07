package br.com.mind.integrador;

import java.rmi.RemoteException;
import java.util.ArrayList;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.magento.client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductTypeEntity;
import br.com.mind.magento.client.StoreEntity;

public class MageBemaErpBridge extends Enginelet {
	private ArrayList<String> jsonResult = new ArrayList<>();
	private String jsonResultTemplate = "{status:%s, message:%s, data:%s}";

	@Override
	public String handleCommand(String command, String[] commandArgs) {
		System.out.println("Inicializando Magento SOAP API");
		ConnectionData connData = Command.json.fromJson(commandArgs[0], ConnectionData.class);
		MageAPI magento = new MageAPI(connData);

		System.out.println("Executando: " + command);
		if (command.equals("createCategories")) {
			String c = commandArgs[1];
			
			CategoryCreateCommand[] categories = Command.json.fromJson(c, CategoryCreateCommand[].class);

			for (CategoryCreateCommand category : categories) {
				try {
					String id = magento.createCategory(category.getParentId(), category.getCategoryData());
					jsonResult.add(String.format(jsonResultTemplate, "OK", "", id));
				} catch (Exception e) {
					jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
				}
			}
				
		} else if (command.equals("createProducts")) {
			String c = commandArgs[1];
			
			ProductCreateCommand[] products = Command.json.fromJson(c, ProductCreateCommand[].class);

			for (ProductCreateCommand product : products) {
				try {
					String id = magento.createProduct(product);
					jsonResult.add(String.format(jsonResultTemplate, "OK", "", id));
				} catch (Exception e) {
					jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
				}
			}

		} else if (command.equals("listAllProducts")) {
			try {
				CatalogProductEntity[] products = magento.listAllProducts();
				String p = Command.json.toJson(products);
				jsonResult.add(String.format(jsonResultTemplate, "OK", "", p));
				
			} catch (RemoteException e) {
				jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
			}
		} else if (command.equals("listProductTypes")) {
			try {
				CatalogProductTypeEntity[] t = magento.listProductTypes();
				String p = Command.json.toJson(t);
				jsonResult.add(String.format(jsonResultTemplate, "OK", "", p));
				
			} catch (RemoteException e) {
				jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
			}
		} else if (command.equals("listProductAttributeSet")) {
			try {
				CatalogProductAttributeSetEntity[] t = magento.listProductAttributeSet();
				String p = Command.json.toJson(t);
				jsonResult.add(String.format(jsonResultTemplate, "OK", "", p));
				
			} catch (RemoteException e) {
				jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
			}
		} else if (command.equals("listStore")) {
			try {
				StoreEntity[] t = magento.listStore();
				String p = Command.json.toJson(t);
				jsonResult.add(String.format(jsonResultTemplate, "OK", "", p));
				
			} catch (RemoteException e) {
				jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
			}
		}
		
		return Command.json.toJson(jsonResult);
	}
	
	public static void main(String[] args) {
		MageBemaErpBridge magentoBridge = new MageBemaErpBridge();
//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//				                 "[{\"categoryData\":{\"name\":\"Roupas 1\",\"is_active\":1,\"description\":\"Roupas\",\"default_sort_by\":\"Preço\",\"include_in_menu\":0,\"available_sort_by\":[\"Posição\",\"Nome do produto\",\"Preço\"]},\"parentId\":\"3\"}]"};
//		System.out.println(magentoBridge.handleCommand("createCategories", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listAllProducts", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listProductTypes", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listProductAttributeSet", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listStore", commandArgs));

		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
        						 "[{\"sku\":\"YYYYY\", \"type\":\"simple\", \"set\":\"9\", \"storeView\":\"1\", \"productData\":{\"categories\":[56], \"name\":\"Produto Teste\", \"description\":\"Descricao Longa\", \"short_description\":\"Descricao Curta\", \"weight\":\"0.1\"}}]"};
		magentoBridge.handleCommand("createProducts", commandArgs);
	}

}
