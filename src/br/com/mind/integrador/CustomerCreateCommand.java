package br.com.mind.integrador;
import br.com.mind.magento.client.CustomerCustomerEntityToCreate;

public class CustomerCreateCommand {

	public String sessionId;
	public CustomerCustomerEntityToCreate customerData; 
	
	public CustomerCreateCommand() {
	}
}
