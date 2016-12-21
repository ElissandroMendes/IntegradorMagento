package br.com.mind.integrador.commands;

import br.com.mind.magento.Client.CustomerAddressEntityCreate;

public class CustomerAddressCreateCommand {

	private String sessionId;
	private int customerId;
	private CustomerAddressEntityCreate[] addressdata; 
	
	public CustomerAddressCreateCommand() {
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public CustomerAddressEntityCreate[] getAddressdata() {
		return addressdata;
	}

	public void setAddressdata(CustomerAddressEntityCreate[] addressdata) {
		this.addressdata = addressdata;
	}

}
