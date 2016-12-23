package br.com.mind.integrador.core;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.integrador.commandsWithoutWSI.AttributeAddOptionCommand;
import br.com.mind.integrador.commandsWithoutWSI.CategoryCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.Command;
import br.com.mind.integrador.commandsWithoutWSI.CommandResult;
import br.com.mind.integrador.commandsWithoutWSI.CustomerAddressCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerAddressUpdateCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.CustomerInfo;
import br.com.mind.integrador.commandsWithoutWSI.CustomerUpdateCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductImageUploadCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductLinkCreateCommand;
import br.com.mind.integrador.commandsWithoutWSI.ProductUpdateCommand;
import br.com.mind.integrador.commandsWithoutWSI.ResultERROR;
import br.com.mind.integrador.commandsWithoutWSI.ResultOK;
import br.com.mind.integrador.commandsWithoutWSI.SalesOrderInfo;
import br.com.mind.magento.ClientWithoutWSI.CatalogAttributeOptionEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogCategoryTree;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductAttributeSetEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductReturnEntity;
import br.com.mind.magento.ClientWithoutWSI.CatalogProductTypeEntity;
import br.com.mind.magento.ClientWithoutWSI.Filters;
import br.com.mind.magento.ClientWithoutWSI.StoreEntity;

public class MageBemaErpBridgeWithoutWSI extends Enginelet {
	private ArrayList<CommandResult> result = new ArrayList<>();
	
	@Override
	public String handleCommand(String command, String[] commandArgs) {
		try {
			String sessionId = null;

			MageOptions options = Command.json.fromJson(commandArgs[0], MageOptions.class);
			
			System.out.println("Initializing Magento SOAP API");
			MageAPIWithoutWSI magento = new MageAPIWithoutWSI(options.getSessionId());
			
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
					int id = magento.createCategory(category.getParentId(), category.getCategoryData());
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
					int id = magento.createProducts(product);

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
				String e = commandArgs[2];
				
				CustomerCreateCommand[] customers = Command.json.fromJson(c, CustomerCreateCommand[].class);
				CustomerAddressCreateCommand[] addresses = Command.json.fromJson(e, CustomerAddressCreateCommand[].class);
				
				System.out.println(customers.length + " Time(s).");
	
				for (int i = 0; i < customers.length; i++) {
					CustomerCreateCommand customer = customers[i];
					int id = magento.createCustomer(customer);

					CustomerAddressCreateCommand address = addresses[i];
					address.setCustomerId(id);
					int customer_address_id = magento.createCustomerAddress(address);
					customer.setCustomer_address_id(customer_address_id);
					
					result.add(new ResultOK(id, customer));
				}
	
			} else if (command.equals("updateCustomers")) {
				String c = commandArgs[1];
				String e = commandArgs[2];
				
				CustomerUpdateCommand[] customers = Command.json.fromJson(c, CustomerUpdateCommand[].class);
				CustomerAddressUpdateCommand[] addresses = Command.json.fromJson(e, CustomerAddressUpdateCommand[].class);
				
				System.out.println(customers.length + " Time(s).");
	
				for (int i = 0; i < customers.length; i++) {
					CustomerUpdateCommand customer = customers[i];
					boolean id = magento.updateCustomer(customer);

					magento.updateCustomerAddress(addresses[i]);
					
					result.add(new ResultOK(id, customer.getCustomerData().getTaxvat()));
				}

			} else if (command.equals("createCustomerAddress")) {
				String c = commandArgs[1];
				
				CustomerAddressCreateCommand[] address = Command.json.fromJson(c, CustomerAddressCreateCommand[].class);
				
				System.out.println(address.length + " Time(s).");
	
				for (CustomerAddressCreateCommand addr : address) {
					int id = magento.createCustomerAddress(addr);
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

			} else if (command.equals("listConsumers")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				CustomerInfo[] t = magento.getCustomerList(filters);

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
				SalesOrderInfo[] t = magento.listSalesOrders(filters);
				
				for (SalesOrderInfo salesOrderInfo : t) {
					result.add(new ResultOK(salesOrderInfo));
				}

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
			
		} catch (IOException | ServiceException e) {
			System.out.println("Executing " + command + " - Error:");
			System.out.println(Utils.StackTraceToString(e));
			System.out.println(" ");
			result.add(new ResultERROR(Utils.StackTraceToString(e)));
		}
		
		return Command.json.toJson(result);
	}
	
}
