package br.com.mind.integrador.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.exception.ExceptionUtils;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.integrador.commands.AttributeAddOptionCommand;
import br.com.mind.integrador.commands.CategoryCreateCommand;
import br.com.mind.integrador.commands.Command;
import br.com.mind.integrador.commands.CommandResult;
import br.com.mind.integrador.commands.CustomerAddressCreateCommand;
import br.com.mind.integrador.commands.CustomerAddressUpdateCommand;
import br.com.mind.integrador.commands.CustomerCreateCommand;
import br.com.mind.integrador.commands.CustomerInfo;
import br.com.mind.integrador.commands.CustomerUpdateCommand;
import br.com.mind.integrador.commands.ProductCreateCommand;
import br.com.mind.integrador.commands.ProductImageUploadCommand;
import br.com.mind.integrador.commands.ProductLinkCreateCommand;
import br.com.mind.integrador.commands.ProductUpdateCommand;
import br.com.mind.integrador.commands.ResultERROR;
import br.com.mind.integrador.commands.ResultOK;
import br.com.mind.integrador.commands.SalesOrderInfo;
import br.com.mind.magento.client.AssociativeEntity;
import br.com.mind.magento.client.CatalogAttributeOptionEntity;
import br.com.mind.magento.client.CatalogCategoryTree;
import br.com.mind.magento.client.CatalogInventoryStockItemEntity;
import br.com.mind.magento.client.CatalogInventoryStockItemUpdateEntity;
import br.com.mind.magento.client.CatalogProductEntity;
import br.com.mind.magento.client.CatalogProductReturnEntity;
import br.com.mind.magento.client.ComplexFilter;
import br.com.mind.magento.client.CustomerAddressEntityItem;
import br.com.mind.magento.client.Filters;
import br.com.mind.magento.client.RewardpointsTransactionAdd;
import br.com.mind.magento.client.SalesOrderShipmentEntity;

public class MageBemaErpBridge extends Enginelet {
	private ArrayList<CommandResult> result = new ArrayList<>();
	
	@Override
	public String handleCommand(String command, String[] commandArgs) {
		
		try {
			String sessionId = null;

			MageOptions options = Command.json.fromJson(commandArgs[0], MageOptions.class);
			
			System.out.println("Initializing br.com.mind.magento.client SOAP API");
			MageAPI magento = new MageAPI(options.getUser(), options.getPassword());
			
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
	
				StringBuilder productsList = new StringBuilder();
				for (int i = 0; i < products.length; i++) {
					productsList.append(products[i].sku).append(","); 
				}
				
				AssociativeEntity filter = new AssociativeEntity();
				filter.setKey("in");
				filter.setValue(productsList.toString());
				
				ComplexFilter[] filterCpx = { new ComplexFilter() };
				filterCpx[0].setKey("sku");
				filterCpx[0].setValue(filter);
				
				Filters filters = new Filters();
				filters.setComplex_filter(filterCpx);
				
				HashMap<String,String> productsExistsList = magento.getProductExists(filters);

				for (ProductCreateCommand product : products) {
					if ( ! productsExistsList.containsKey(product.sku)) {
						int id = magento.createProducts(product);
						result.add(new ResultOK(id, product.sku));
					} else {
						result.add(new ResultOK(productsExistsList.get(product.sku), product.sku));
					}
				}
	
			} else if (command.equals("listStockProducts")) {
				String c = commandArgs[1];
				
				String[] productsIds = Command.json.fromJson(c, String[].class);
				
				CatalogInventoryStockItemEntity[] ok = magento.listStockProducts(productsIds);
				result.add(new ResultOK(ok));

			} else if (command.equals("updateStockProducts")) {
				String c = commandArgs[1];
				
				ProductUpdateCommand[] products = Command.json.fromJson(c, ProductUpdateCommand[].class);
				
				System.out.println(products.length + " Time(s).");
	
				for (ProductUpdateCommand product : products) {
					int ok = magento.updateStockProduct(product);
					result.add(new ResultOK(ok, product.sku));
				}

			} else if (command.equals("updateStockProductsBulk")) {
				String c = commandArgs[1];
				String[] productsIds = Command.json.fromJson(c, String[].class);
				
				String c1 = commandArgs[2];
				CatalogInventoryStockItemUpdateEntity[] products = Command.json.fromJson(c1, CatalogInventoryStockItemUpdateEntity[].class);
				
				boolean ok = magento.updateStockProductBulk(productsIds, products);
				result.add(new ResultOK(ok));

			} else if (command.equals("updateProducts")) {
				String c = commandArgs[1];
				
				ProductUpdateCommand[] products = Command.json.fromJson(c, ProductUpdateCommand[].class);
				
				System.out.println(products.length + " Time(s).");
	
				for (ProductUpdateCommand product : products) {
					String ok = magento.updateProducts(product);
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
				String[] emails = new String[customers.length];
				for (int i = 0; i < customers.length; i++) {
					emails[i] = customers[i].getCustomerData().getEmail();
				}
				
				HashMap<String,Integer> emailList = magento.getCustomerListByEmail(emails);

				for (int i = 0; i < customers.length; i++) {
					CustomerCreateCommand customer = customers[i];
					String email = customer.getCustomerData().getEmail();
					if ( ! emailList.containsKey(email) ) {
						try {
							int id = magento.createCustomer(customer);
	
							addresses[i].setCustomerId(id);
							int customer_address_id = magento.createCustomerAddress(addresses[i]);
							customer.setCustomer_address_id(customer_address_id);
						
							result.add(new ResultOK(id, customer));
							
						} catch(MageAPIException ex) {
							if (ex.getMessage().indexOf("Erro ao criar cliente:") != -1) {
								result.add(new ResultERROR(ex.getCause().getMessage(), email));
							} else {
								throw ex;
							}
							
						}
					} else {
						System.out.println("Customer: " + email + " already exists.");
						CustomerAddressEntityItem[] address = magento.getCustomerAddress(emailList.get(email));
						if ( address.length > 0 ) {
							customer.setCustomer_address_id(address[0].getCustomer_address_id());
						}
						result.add(new ResultOK(emailList.get(email) , customer));
					}
				}
	
			} else if (command.equals("updateCustomers")) {
				String c = commandArgs[1];
				String e = commandArgs[2];
				
				CustomerUpdateCommand[] customers = Command.json.fromJson(c, CustomerUpdateCommand[].class);
				CustomerAddressUpdateCommand[] addresses = Command.json.fromJson(e, CustomerAddressUpdateCommand[].class);
				
				System.out.println(customers.length + " Time(s).");
	
				for (int i = 0; i < customers.length; i++) {
					CustomerUpdateCommand customer = customers[i];
					try {
						boolean id = magento.updateCustomer(customer);
						result.add(new ResultOK(id, customer.getCustomerData().getTaxvat()));
					} catch(MageAPIException ex) {
						if (ex.getMessage().indexOf("Erro ao atualizar Cliente ID:") != -1) {
							result.add(new ResultERROR(ex.getCause().getMessage(), customer.getCustomer_id()));
						} else {
							throw ex;
						}
					}

					if ( addresses != null && addresses.length > 0 ) {
						try {
							magento.updateCustomerAddress(addresses[i]);
						} catch(Exception ex) {
							//nop -> Endere�o no magento n�o � mandat�rio estar atualizado...
						}
					}
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

			} else if (command.equals("updateRewardpoints")) {
				String customerId = commandArgs[1];
				String points = commandArgs[2];
				
				RewardpointsTransactionAdd data = new RewardpointsTransactionAdd();
				data.setCustomerId(customerId);
				data.setStoreId("1");
				data.setPointAmount(points);
				
				String transactionId = magento.createOrUpdateCustomerRewardsPoints(data);
				result.add(new ResultOK(customerId, transactionId));

			} else if (command.equals("listProducts")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				CatalogProductEntity[] t = magento.getProductList(filters);

				result.add(new ResultOK(t));

			} else if (command.equals("listConsumers")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				CustomerInfo[] t = magento.getCustomerList(filters, true);

				result.add(new ResultOK(t));

			} else if (command.equals("getProductInfo")) {
				String c = commandArgs[1];
				System.out.println("Get product infor: " + c);
				CatalogProductReturnEntity productInfo = magento.getProductInfo(c);
				result.add(new ResultOK(productInfo));
				
			} else if (command.equals("listSalesOrders")) {
				String c = commandArgs[1];
				
				Filters filters = Command.json.fromJson(c, Filters.class);
				SalesOrderInfo[] t = magento.listSalesOrders(filters);
				for (SalesOrderInfo salesOrderInfo : t) {
					result.add(new ResultOK(salesOrderInfo));
				}

			} else if (command.equals("addOrderComment")) {
				String incrementID = commandArgs[1];
				String status = commandArgs[2];
				String comment = commandArgs[3];
				boolean r = magento.addOrderComment(incrementID, status, comment);
				result.add(new ResultOK(r));

			} else if (command.equals("addOrderShipmentAndTrack")) {
				String orderId = commandArgs[1];
				String incrementId = commandArgs[2];
				String courier = commandArgs[3];
				String trackNumber = commandArgs[4];
				String comment = commandArgs[5];
				
				SalesOrderShipmentEntity[] shipments = magento.getOrderShipmentList(orderId);
				
				String shipmentId = null;
				if ( shipments.length == 0 ) {
					shipmentId = magento.addOrderShipment(incrementId, comment);
				} else {
					shipmentId = shipments[0].getIncrement_id();
				}

				int trackNumberId = magento.addOrderTrack(shipmentId, courier, trackNumber);
				boolean r = magento.addOrderShipmentComment(shipmentId, "C�digo Rastreio:" + trackNumber);
				
				result.add(new ResultOK(trackNumberId));

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
			
		} catch (IOException | ServiceException | MageAPIException e) {
			System.out.println("Executing " + command + " - Error:");
			System.out.println(ExceptionUtils.getRootCauseMessage(e));
//			System.out.println(Utils.StackTraceToString(e));
			System.out.println(" ");
//			result.add(new ResultERROR(Utils.StackTraceToString(e)));
			result.add(new ResultERROR(e.getCause() + " - " + ExceptionUtils.getRootCauseMessage(e)));
		}
		
		return Command.json.toJson(result);
	}
	
	public static void main(String[] args) throws IOException, ServiceException, MageAPIException {
		MageBemaErpBridge b = new MageBemaErpBridge();
//		String r = b.handleCommand("getProductInfo", new String[] { "{\"user\":\"novointegrador\",\"password\":\"c2b5a6544a0357b7557b7b\",\"endpointUrl\":null,\"sessionId\":null}", "\"476409492\"" } );
		String r = b.handleCommand("listSalesOrders", new String[] { "{\"user\":\"novointegrador\",\"password\":\"c2b5a6544a0357b7557b7b\",\"endpointUrl\":null,\"sessionId\":null}", "{\"complex_filter\":[{\"value\":{\"value\":\"2018-01-01 00:00:00\",\"key\":\"from\"},\"key\":\"created_at\"},{\"value\":{\"value\":\"2019-05-30 23:59:59\",\"key\":\"to\"},\"key\":\"created_at\"},{\"value\":{\"value\":\"processing,holded\",\"key\":\"in\"},\"key\":\"status\"}]}" } );
		
		System.out.println(r);
	}
	
}
