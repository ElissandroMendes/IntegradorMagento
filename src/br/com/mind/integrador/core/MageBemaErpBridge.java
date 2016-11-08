package br.com.mind.integrador.core;

import java.rmi.RemoteException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.integrador.commands.CategoryCreateCommand;
import br.com.mind.integrador.commands.Command;
import br.com.mind.integrador.commands.CommandResult;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductLinkCreateCommand;
import br.com.mind.integrador.commands.ResultERROR;
import br.com.mind.integrador.commands.ResultOK;
import br.com.mind.magento.client.CatalogCategoryTree;
import br.com.mind.magento.client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductReturnEntity;
import br.com.mind.magento.client.CatalogProductTypeEntity;
import br.com.mind.magento.client.Filters;
import br.com.mind.magento.client.SalesOrderListEntity;
import br.com.mind.magento.client.StoreEntity;

public class MageBemaErpBridge extends Enginelet {
	private ArrayList<CommandResult> result = new ArrayList<>();
	
	@Override
	public String handleCommand(String command, String[] commandArgs) {
		System.out.println("Inicializando Magento SOAP API");
		ConnectionData connData = Command.json.fromJson(commandArgs[0], ConnectionData.class);
		MageAPI magento = new MageAPI(connData);

		System.out.println("Executando: " + command);
		
		try {
			if (command.equals("createCategories")) {
				String c = commandArgs[1];
				
				CategoryCreateCommand[] categories = Command.json.fromJson(c, CategoryCreateCommand[].class);
	
				for (CategoryCreateCommand category : categories) {
					String id = magento.createCategory(category.getParentId(), category.getCategoryData());
					result.add(new ResultOK(id));
				}
					
			} else if (command.equals("listCategories")) {
				CatalogCategoryTree categories = magento.listCategories();
				//Command.json.toJson(categories)
				result.add(new ResultOK(categories));

			} else if (command.equals("createProducts")) {
				String c = commandArgs[1];
				
				ProductCreateCommand[] products = Command.json.fromJson(c, ProductCreateCommand[].class);
	
				for (ProductCreateCommand product : products) {
					String id = magento.createProduct(product);

//					for (ProductCreateCommand child : product.children) {
//						magento.createProduct(product);
//					}

					result.add(new ResultOK(id, product.sku));
				}
	
			} else if (command.equals("createCustomers")) {
				String c = commandArgs[1];
				
				CustomerCreateCommand[] customers = Command.json.fromJson(c, CustomerCreateCommand[].class);
	
				for (CustomerCreateCommand customer : customers) {
					String id = magento.createCustomer(customer);
					result.add(new ResultOK(id));
				}
	
			} else if (command.equals("createCustomerAddress")) {
				String c = commandArgs[1];
				
				CustomerAddressCreateCommand[] address = Command.json.fromJson(c, CustomerAddressCreateCommand[].class);
	
				for (CustomerAddressCreateCommand addr : address) {
					String id = magento.createCustomerAddress(addr);
					result.add(new ResultOK(id));
				}
	
			} else if (command.equals("createProductLink")) {
				String l = commandArgs[1];
				
				ProductLinkCreateCommand[] linkDefs = Command.json.fromJson(l, ProductLinkCreateCommand[].class);

				for (ProductLinkCreateCommand linkDef : linkDefs) {
					for(String linkTo : linkDef.getLinkTo()) {
						System.out.println(linkTo);
						System.out.println(linkDef.getProduct()); 
						result.add(new ResultOK(magento.createProductLink(linkDef.getProduct(), linkTo)));	
					}
				}

			} else if (command.equals("listAllProducts")) {
				CatalogProductEntity[] products = magento.listAllProducts();
				result.add(new ResultOK(products));

			} else if (command.equals("getProductInfo")) {
				String c = commandArgs[1];
				
				CatalogProductReturnEntity productInfo = magento.getProductInfo(c);
				result.add(new ResultOK(productInfo));
				
			} else if (command.equals("listProductTypes")) {
				CatalogProductTypeEntity[] t = magento.listProductTypes();
				result.add(new ResultOK(t));

			} else if (command.equals("listProductAttributeSet")) {
				CatalogProductAttributeSetEntity[] t = magento.listProductAttributeSet();
				result.add(new ResultOK(t));

			} else if (command.equals("listStore")) {
					StoreEntity[] t = magento.listStore();
					result.add(new ResultOK(t));
	
			} else if (command.equals("salesOrderList")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				SalesOrderListEntity[] t = magento.getOrderList(filters);

				result.add(new ResultOK(t));
			}
		} catch (RemoteException e) {
			result.add(new ResultERROR(Utils.StackTraceToString(e)));
		}
		
		return Command.json.toJson(result);
	}
	
	public static void main(String[] args) {
		MageBemaErpBridge magentoBridge = new MageBemaErpBridge();
//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//				                 "[{\"product\":\"1751492\",\"linkedTo\":[147573346,147573348,147573347,147573349,147573350]},{\"product\":\"1751494\",\"linkedTo\":[147573358,147573357,147573355]}]"};
//		System.out.println(magentoBridge.handleCommand("createProductLink", commandArgs));
		
//		System.out.println(magentoBridge.handleCommand("listAllProducts", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listProductTypes", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listProductAttributeSet", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listStore", commandArgs));
//, \"set\":\"9\"
//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//        						 "[{\"sku\":\"KKKKKK1234\", \"type\":\"simple\", \"storeView\":\"1\", \"productData\":{\"categories\":[56], \"name\":\"Produto Teste\", \"description\":\"Descricao Longa\", \"short_description\":\"Descricao Curta\", \"weight\":\"0.1\"}}]"};

//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//								   "[{\"set\":\"9\",\"storeView\":\"1\",\"sku\":\"123456789\",\"type\":\"simple\",\"productData\":{\"status\":\"1\",\"description\":\"Descricao Longa\",\"stock_Data\":{\"min_qty\":1,\"use_config_manage_stock\":1,\"is_qty_decimal\":1,\"use_config_notify_stock_qty\":1,\"use_config_min_sale_qty\":1,\"max_sale_qty\":999,\"backorders\":1,\"min_sale_qty\":1,\"use_config_backorders\":1,\"qty\":10,\"is_in_stock\":1,\"manage_stock\":1,\"use_config_min_qty\":1,\"notify_stock_qty\":1,\"use_config_max_sale_qty\":1},\"weight\":\"1.0\",\"price\":20,\"visibility\":\"1\",\"websites\":[\"1\"],\"name\":\"Produto Teste\",\"short_description\":\"Descricao Curta\",\"categories\":[56]}}]"};
//		System.out.println(magentoBridge.handleCommand("createProducts", commandArgs));
		
//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//								 "{\"complex_filter\":[],\"filter\":[{\"value\":\"100000040\",\"key\":\"increment_id\"}]}"};
		
		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}"}; 

		String json = magentoBridge.handleCommand("listCategories", commandArgs);
		
		System.out.println(json);

//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		String prettyJson = gson.toJson(json);
//		System.out.println(prettyJson);
		
//		String json = magentoBridge.handleCommand("getOrderList", commandArgs);

	}

}