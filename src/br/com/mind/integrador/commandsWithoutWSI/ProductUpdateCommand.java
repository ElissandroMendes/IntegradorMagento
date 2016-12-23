package br.com.mind.integrador.commandsWithoutWSI;

import br.com.mind.magento.ClientWithoutWSI.CatalogProductCreateEntity;

public class ProductUpdateCommand {
	public String sku;
	public String type;
	public String storeView;
	public CatalogProductCreateEntity productData;
//	public ProductCreateCommand[] children;

	public ProductUpdateCommand() {
		
	}


}

