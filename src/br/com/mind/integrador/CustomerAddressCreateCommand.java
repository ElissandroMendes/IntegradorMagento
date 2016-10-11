package br.com.mind.integrador;

import br.com.mind.magento.client.CustomerAddressEntityCreate;

public class CustomerAddressCreateCommand {

	public String sessionId;
	public int customerId;
	CustomerAddressEntityCreate[] addressdata; 
	
	public CustomerAddressCreateCommand() {
	}

}
