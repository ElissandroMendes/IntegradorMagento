package br.com.mind.integrador.commands;

import br.com.mind.magento.client.CatalogProductCreateEntity;

public class ProductUpdateCommand {
	public String sku;
	public String type;
	public String storeView;
	public CatalogProductCreateEntity productData;

	public ProductUpdateCommand() {
		
	}


}

