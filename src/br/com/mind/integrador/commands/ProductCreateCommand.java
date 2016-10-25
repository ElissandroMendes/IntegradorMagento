package br.com.mind.integrador.commands;

import br.com.mind.magento.client.CatalogProductCreateEntity;

public class ProductCreateCommand {
	public String type;
	public String set;
	public String sku;
	public String storeView;
	public CatalogProductCreateEntity productData;
	
	public ProductCreateCommand() {
		
	}
}
