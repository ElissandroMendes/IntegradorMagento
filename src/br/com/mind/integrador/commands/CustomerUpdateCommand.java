package br.com.mind.integrador.commands;

import br.com.mind.magento.ClientWithWSI.CustomerCustomerEntityToCreate;

public class CustomerUpdateCommand {
	private int customer_id;
	private CustomerCustomerEntityToCreate customerData;
	
	public CustomerUpdateCommand() {
		
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public CustomerCustomerEntityToCreate getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerCustomerEntityToCreate customerData) {
		this.customerData = customerData;
	}

}
