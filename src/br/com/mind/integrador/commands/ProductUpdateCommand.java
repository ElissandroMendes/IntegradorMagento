package br.com.mind.integrador.commands;

import br.com.mind.magento.ClientWithWSI.CatalogProductCreateEntity;

public class ProductUpdateCommand {
	public String sku;
	public String type;
	public String storeView;
	public CatalogProductCreateEntity productData;
//	public ProductCreateCommand[] children;

	public ProductUpdateCommand() {
		
	}


}

