package br.com.mind.integrador.commands;

import br.com.mind.magento.client.CatalogProductAttributeMediaCreateEntity;

public class ProductImageUploadCommand {
	private String product;
	private CatalogProductAttributeMediaCreateEntity[] data;
	private String storeView;
	
	public ProductImageUploadCommand() {
	
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public CatalogProductAttributeMediaCreateEntity[] getData() {
		return data;
	}
	public void setData(CatalogProductAttributeMediaCreateEntity[] data) {
		this.data = data;
	}
	public String getStoreView() {
		return storeView;
	}
	public void setStoreView(String storeView) {
		this.storeView = storeView;
	}
}
