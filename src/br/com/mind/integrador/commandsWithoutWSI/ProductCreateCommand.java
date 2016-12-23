package br.com.mind.integrador.commandsWithoutWSI;

import br.com.mind.magento.ClientWithoutWSI.CatalogProductCreateEntity;

public class ProductCreateCommand {
	public String type;
	public String set;
	public String sku;
	public String storeView;
	public CatalogProductCreateEntity productData;
//	public ProductCreateCommand[] children;
	
	public ProductCreateCommand() {
		
	}
}
