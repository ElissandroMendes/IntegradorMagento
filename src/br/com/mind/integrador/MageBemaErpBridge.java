package br.com.mind.integrador;

import java.rmi.RemoteException;
import java.util.ArrayList;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.magento.client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductReturnEntity;
import br.com.mind.magento.client.CatalogProductTypeEntity;
import br.com.mind.magento.client.Filters;
import br.com.mind.magento.client.SalesOrderListEntity;
import br.com.mind.magento.client.StoreEntity;

public class MageBemaErpBridge extends Enginelet {
	private ArrayList<CommandResult> jr = new ArrayList<>();
	
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
					jr.add(new CommandResult(id));
				} catch (RemoteException e) {
					jr.add(new CommandResult(Utils.StackTraceToString(e)));
				}
			}
				
		} else if (command.equals("createProducts")) {
			String c = commandArgs[1];
			
			ProductCreateCommand[] products = Command.json.fromJson(c, ProductCreateCommand[].class);

			for (ProductCreateCommand product : products) {
				try {
					String id = magento.createProduct(product);
					jr.add(new CommandResult(id));
				} catch (RemoteException e) {
					jr.add(new CommandResult(Utils.StackTraceToString(e)));
				}
			}

		} else if (command.equals("createCustomers")) {
			String c = commandArgs[1];
			
			CustomerCreateCommand[] customers = Command.json.fromJson(c, CustomerCreateCommand[].class);

			for (CustomerCreateCommand customer : customers) {
				try {
					String id = magento.createCustomer(customer);
					jr.add(new CommandResult(id));
				} catch (RemoteException e) {
					jr.add(new CommandResult(Utils.StackTraceToString(e)));
				}
			}

		} else if (command.equals("createCustomerAddress")) {
			String c = commandArgs[1];
			
			CustomerAddressCreateCommand[] address = Command.json.fromJson(c, CustomerAddressCreateCommand[].class);

			for (CustomerAddressCreateCommand addr : address) {
				try {
					String id = magento.createCustomerAddress(addr);
					jr.add(new CommandResult(id));
				} catch (RemoteException e) {
					jr.add(new CommandResult(Utils.StackTraceToString(e)));
				}
			}

		} else if (command.equals("listAllProducts")) {
			try {
				CatalogProductEntity[] products = magento.listAllProducts();
				jr.add(new CommandResult(products));
			} catch (RemoteException e) {
				jr.add(new CommandResult(Utils.StackTraceToString(e)));
			}
			
		} else if (command.equals("getProductInfo")) {
			String c = commandArgs[1];
			
			try {
				CatalogProductReturnEntity productInfo = magento.getProductInfo(c);
				jr.add(new CommandResult(productInfo));
			} catch (RemoteException e) {
				jr.add(new CommandResult(Utils.StackTraceToString(e)));
			}
			
		} else if (command.equals("listProductTypes")) {
			try {
				CatalogProductTypeEntity[] t = magento.listProductTypes();
				jr.add(new CommandResult(t));
			} catch (RemoteException e) {
				jr.add(new CommandResult(Utils.StackTraceToString(e)));
			}
		} else if (command.equals("listProductAttributeSet")) {
			try {
				CatalogProductAttributeSetEntity[] t = magento.listProductAttributeSet();
				jr.add(new CommandResult(t));
			} catch (RemoteException e) {
				jr.add(new CommandResult(Utils.StackTraceToString(e)));
			}
		} else if (command.equals("listStore")) {
			try {
				StoreEntity[] t = magento.listStore();

				jr.add(new CommandResult(t));
			} catch (RemoteException e) {
				jr.add(new CommandResult(Utils.StackTraceToString(e)));
			}

		} else if (command.equals("getOrderList")) {
			String c = commandArgs[1];
			
			try {
				Filters filters = Command.json.fromJson(c, Filters.class);
				SalesOrderListEntity[] t = magento.getOrderList(filters);

				jr.add(new CommandResult(t));
			} catch (RemoteException e) {
				jr.add(new CommandResult(Utils.StackTraceToString(e)));
			}
		}
		
		return Command.json.toJson(jr);
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

//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//        						 "[{\"sku\":\"YYYYY\", \"type\":\"simple\", \"set\":\"9\", \"storeView\":\"1\", \"productData\":{\"categories\":[56], \"name\":\"Produto Teste\", \"description\":\"Descricao Longa\", \"short_description\":\"Descricao Curta\", \"weight\":\"0.1\"}}]"};

//		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
//								   "[{\"set\":\"9\",\"storeView\":\"1\",\"sku\":\"123456789\",\"type\":\"simple\",\"productData\":{\"status\":\"1\",\"description\":\"Descricao Longa\",\"stock_Data\":{\"min_qty\":1,\"use_config_manage_stock\":1,\"is_qty_decimal\":1,\"use_config_notify_stock_qty\":1,\"use_config_min_sale_qty\":1,\"max_sale_qty\":999,\"backorders\":1,\"min_sale_qty\":1,\"use_config_backorders\":1,\"qty\":10,\"is_in_stock\":1,\"manage_stock\":1,\"use_config_min_qty\":1,\"notify_stock_qty\":1,\"use_config_max_sale_qty\":1},\"weight\":\"1.0\",\"price\":20,\"visibility\":\"1\",\"websites\":[\"1\"],\"name\":\"Produto Teste\",\"short_description\":\"Descricao Curta\",\"categories\":[56]}}]"};
//		System.out.println(magentoBridge.handleCommand("createProducts", commandArgs));
		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}", 
								 "{\"complex_filter\":[],\"filter\":[{\"value\":\"100000040\",\"key\":\"increment_id\"}]}"};
		
		String json = magentoBridge.handleCommand("getOrderList", commandArgs);
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//	    String prettyJson = gson.toJson(jr);
//	    
//		System.out.println(prettyJson);
		
//		System.out.println(json);

	}

}
