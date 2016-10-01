package br.com.mind.integrador;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.rmi.RemoteException;

import com.google.gson.Gson;

import br.com.inteq.engine.enginelet.Enginelet;
import br.com.mind.magento.client.CatalogCategoryEntityCreate;
import br.com.mind.magento.client.CatalogProductEntity;

public class MageBemaErpBridge extends Enginelet {
	{
		this.json = new Gson();
	}
	
	public Gson json;
	
	private String StackTraceToString(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();				
	}
	
	@Override
	public String handleCommand(String command, String[] commandArgs) {
		String result = ""; 
		System.out.println("Processando: " + command);
		System.out.println("   comando: " + command);
		if(commandArgs != null) {
			for (String string : commandArgs) {
				System.out.println("   params: " + string);
			}
		}
		
		MageAPI magento = new MageAPI();
		
		if (command.equals("createCategory")) {

			try {
				int parentId = Integer.parseInt(commandArgs[0]);
				String jsonData = commandArgs[1];
				
				CatalogCategoryEntityCreate categoryData = json.fromJson(jsonData, CatalogCategoryEntityCreate.class);
				
				result = magento.createCategory(parentId, categoryData);
			} catch (Exception e) {
				result = StackTraceToString(e);
			}
		} else if (command.equals("listAllProducts")) {
			try {
				CatalogProductEntity[] products = magento.listAllProducts();
				result = json.toJson(products);
			} catch (RemoteException e) {
				result = StackTraceToString(e);			
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		MageBemaErpBridge magentoBridge = new MageBemaErpBridge();
		
//		String [] commandArgs = {"51", "{\"name\": \"Roupa de Frio Barata\",\"description\":\"XXXXX\",\"is_active\":1,\"include_in_menu\":0, \"available_sort_by\":[\"Posição\", \"Nome do produto\", \"Preço\"], \"default_sort_by\":\"Posição\"}"};
//		System.out.println(bridge.handleCommand("createCategory", commandArgs));

		System.out.println(magentoBridge.handleCommand("listAllProducts", null));
		
		
	}

}
