package br.com.mind.integrador.core;

import java.io.IOException;
import java.util.ArrayList;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.integrador.commands.AttributeAddOptionCommand;
import br.com.mind.integrador.commands.CategoryCreateCommand;
import br.com.mind.integrador.commands.Command;
import br.com.mind.integrador.commands.CommandResult;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductImageUploadCommand;
import br.com.mind.integrador.commands.ProductLinkCreateCommand;
import br.com.mind.integrador.commands.ProductUpdateCommand;
import br.com.mind.integrador.commands.ResultERROR;
import br.com.mind.integrador.commands.ResultOK;
import br.com.mind.magento.client.CatalogAttributeOptionEntity;
import br.com.mind.magento.client.CatalogCategoryTree;
import br.com.mind.magento.client.CatalogProductAttributeSetEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductReturnEntity;
import br.com.mind.magento.client.CatalogProductTypeEntity;
import br.com.mind.magento.client.Filters;
import br.com.mind.magento.client.SalesOrderEntity;
import br.com.mind.magento.client.StoreEntity;

public class MageBemaErpBridge extends Enginelet {
	private ArrayList<CommandResult> result = new ArrayList<>();
	
	@Override
	public String handleCommand(String command, String[] commandArgs) {
		try {
			String sessionId = null;

			MageOptions options = Command.json.fromJson(commandArgs[0], MageOptions.class);
			
			System.out.println("Initializing Magento SOAP API");
			MageAPI magento = new MageAPI(options.getEndpointUrl(), options.getSessionId());
			
			System.out.println("Executing: " + command);

			if (command.equals("getSessionId")) {
				sessionId = magento.mageLogin(options.getUser(), options.getPassword());
				result.add(new ResultOK(sessionId));
				
			} else {
				sessionId = commandArgs[0];
			}
			
			if (command.equals("createCategories")) {
				String c = commandArgs[1];
				
				CategoryCreateCommand[] categories = Command.json.fromJson(c, CategoryCreateCommand[].class);
				
				System.out.println(categories.length + " Time(s).");
	
				for (CategoryCreateCommand category : categories) {
					String id = magento.createCategory(category.getParentId(), category.getCategoryData());
					result.add(new ResultOK(id));
				}
					
			} else if (command.equals("listCategories")) {
				CatalogCategoryTree categories = magento.listCategories();
				result.add(new ResultOK(categories));

			} else if (command.equals("createProducts")) {
				String c = commandArgs[1];
				
				ProductCreateCommand[] products = Command.json.fromJson(c, ProductCreateCommand[].class);
				
				System.out.println(products.length + " Time(s).");
	
				for (ProductCreateCommand product : products) {
					String id = magento.createProducts(product);

//					for (ProductCreateCommand child : product.children) {
//						magento.createProduct(product);
//					}

					result.add(new ResultOK(id, product.sku));
				}
	
			} else if (command.equals("updateProducts")) {
				String c = commandArgs[1];
				
				ProductUpdateCommand[] products = Command.json.fromJson(c, ProductUpdateCommand[].class);
				
				System.out.println(products.length + " Time(s).");
	
				for (ProductUpdateCommand product : products) {
					String ok = magento.updateProducts(product);

//					for (ProductCreateCommand child : product.children) {
//						magento.createProduct(product);
//					}

					result.add(new ResultOK(ok, product.sku));
				}

			} else if (command.equals("uploadProductImages")) {
				String c = commandArgs[1];
				
				ProductImageUploadCommand[] images = Command.json.fromJson(c, ProductImageUploadCommand[].class);
				
				System.out.println(images.length + " Time(s).");
	
				for (ProductImageUploadCommand image : images) {
					boolean ok = magento.uploadProductImages(image);
					result.add(new ResultOK(ok));
				}

			} else if (command.equals("createCustomers")) {
				String c = commandArgs[1];
				
				CustomerCreateCommand[] customers = Command.json.fromJson(c, CustomerCreateCommand[].class);
				
				System.out.println(customers.length + " Time(s).");
	
				for (CustomerCreateCommand customer : customers) {
					String id = magento.createCustomer(customer);
					result.add(new ResultOK(id));
				}
	
			} else if (command.equals("createCustomerAddress")) {
				String c = commandArgs[1];
				
				CustomerAddressCreateCommand[] address = Command.json.fromJson(c, CustomerAddressCreateCommand[].class);
				
				System.out.println(address.length + " Time(s).");
	
				for (CustomerAddressCreateCommand addr : address) {
					String id = magento.createCustomerAddress(addr);
					result.add(new ResultOK(id));
				}
	
			} else if (command.equals("createProductLink")) {
				String l = commandArgs[1];
				
				ProductLinkCreateCommand[] linkDefs = Command.json.fromJson(l, ProductLinkCreateCommand[].class);
				
				System.out.println(linkDefs.length + " Time(s).");

				for (ProductLinkCreateCommand linkDef : linkDefs) {
					for(String linkTo : linkDef.getLinkTo()) {
						result.add(new ResultOK(magento.createProductLink(linkDef.getProduct(), linkTo)));	
					}
				}

			} else if (command.equals("listAllProducts")) {
				CatalogProductEntity[] products = magento.listAllProducts();
				result.add(new ResultOK(products));

			} else if (command.equals("listProducts")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				CatalogProductEntity[] t = magento.getProductList(filters);

				result.add(new ResultOK(t));

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
	
			} else if (command.equals("listSalesOrders")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				SalesOrderEntity[] t = magento.listSalesOrders(filters);

				result.add(new ResultOK(t));

			} else if (command.equals("addAttributeOption")) {
				String c = commandArgs[1];
				
				AttributeAddOptionCommand[] attributeOptions = Command.json.fromJson(c, AttributeAddOptionCommand[].class);
				
				System.out.println(attributeOptions.length + " Time(s).");
	
				for (AttributeAddOptionCommand attributeOption : attributeOptions) {
					boolean r = magento.addAttributeOption(attributeOption);
					result.add(new ResultOK(r));
				}

			} else if (command.equals("listAttributeOptions")) {

				String attributeCode = commandArgs[1];
				String storeView = commandArgs[2];
				
				CatalogAttributeOptionEntity[] t = magento.listAttributeOptions(attributeCode, storeView);

				result.add(new ResultOK(t));

			}

			System.out.println(" ");
			
		} catch (IOException e) {
			System.out.println("Executing " + command + " - Error:");
			System.out.println(Utils.StackTraceToString(e));
			System.out.println(" ");
			result.add(new ResultERROR(Utils.StackTraceToString(e)));
		}
		
		return Command.json.toJson(result);
	}
	
	public static void main(String[] args) {
		MageBemaErpBridge magentoBridge = new MageBemaErpBridge();
		String [] commandArgs = {"{\"password\":\"YzU4ODZjNjQwYjI5NTc3YmZi\",\"user\":\"integrador.noix\",\"endpointUrl\":\"http://handara.signashop.com.br/api/v2_soap\"}"};
		System.out.println(magentoBridge.handleCommand("getSessionId", commandArgs));
		
	}

}
