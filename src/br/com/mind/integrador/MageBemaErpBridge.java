package br.com.mind.integrador;

import java.rmi.RemoteException;
import java.util.ArrayList;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.magento.client.CatalogProductEntity;

public class MageBemaErpBridge extends Enginelet {
	@Override
	public String handleCommand(String command, String[] commandArgs) {
		ArrayList<String> jsonResult = new ArrayList<>();

		String jsonResultTemplate = "{status:%s, message:%s, data:%s}";
				
		System.out.println("Inicializando Magento SOAP API");
		ConnectionData connData = Command.json.fromJson(commandArgs[0], ConnectionData.class);
		MageAPI magento = new MageAPI(connData);
		
		System.out.println("Executando: " + command);
		if (command.equals("createCategories")) {
			
			
			for (String cmd : commandArgs) {
				try {
					CategoryCreateCommand ccc = CategoryCreateCommand.createFromJson(cmd);
					String id = magento.createCategory(ccc.getParentId(), ccc.getCategoryData());
					jsonResult.add(String.format(jsonResultTemplate, "OK", "", id));
					
				} catch (Exception e) {
					jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
				}
			}
				
		} else if (command.equals("createProduct")) {

		} else if (command.equals("listAllProducts")) {
			try {
				CatalogProductEntity[] products = magento.listAllProducts();
				String p = Command.json.toJson(products);
				jsonResult.add(String.format(jsonResultTemplate, "OK", "", p));
				
			} catch (RemoteException e) {
				jsonResult.add(String.format(jsonResultTemplate, "ERROR", Utils.StackTraceToString(e), ""));
			}
		}
		return Command.json.toJson(jsonResult);
	}
	
	public static void main(String[] args) {
//		MageBemaErpBridge magentoBridge = new MageBemaErpBridge();
//		String [] commandArgs = {"51", "{\"name\": \"Roupa de Frio Barata\",\"description\":\"XXXXX\",\"is_active\":1,\"include_in_menu\":0, \"available_sort_by\":[\"Posição\", \"Nome do produto\", \"Preço\"], \"default_sort_by\":\"Posição\"}"};
//		System.out.println(bridge.handleCommand("createCategory", commandArgs));
//		System.out.println(magentoBridge.handleCommand("listAllProducts", null));
	}

}
