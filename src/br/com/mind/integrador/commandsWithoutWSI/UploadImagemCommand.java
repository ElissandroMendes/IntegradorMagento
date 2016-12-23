package br.com.mind.integrador.commandsWithoutWSI;

import br.com.mind.magento.ClientWithoutWSI.CatalogProductAttributeMediaCreateEntity;

public class UploadImagemCommand {

	private String product;
	private CatalogProductAttributeMediaCreateEntity data;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public CatalogProductAttributeMediaCreateEntity getData() {
		return data;
	}

	public void setData(CatalogProductAttributeMediaCreateEntity data) {
		this.data = data;
	}

}
