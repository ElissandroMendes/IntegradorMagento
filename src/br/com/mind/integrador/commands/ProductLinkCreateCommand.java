package br.com.mind.integrador.commands;

public class ProductLinkCreateCommand {
	private String product;
	private String[] linkedTo;
	
	public ProductLinkCreateCommand() {
		
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String[] getLinkTo() {
		return linkedTo;
	}
	public void setLinkTo(String[] linkedTo) {
		this.linkedTo = linkedTo;
	}
}
