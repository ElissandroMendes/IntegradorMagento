package br.com.mind.integrador.commands;

import br.com.mind.magento.Client.CatalogProductAttributeOptionEntityToAdd;

public class AttributeAddOptionCommand {
	private String attribute;
    private CatalogProductAttributeOptionEntityToAdd data;

    public AttributeAddOptionCommand() {
    	
    }
    
	public CatalogProductAttributeOptionEntityToAdd getData() {
		return data;
	}

	public void setData(CatalogProductAttributeOptionEntityToAdd data) {
		this.data = data;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}
