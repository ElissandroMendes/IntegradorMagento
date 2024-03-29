package br.com.mind.integrador.commands;

import br.com.mind.magento.client.CustomerCustomerEntityToCreate;

public class CustomerCreateCommand {

	private int customer_address_id;
	private int rewardpoints;
	private CustomerCustomerEntityToCreate customerData; 
	
	public CustomerCreateCommand() {
	}

	public int getCustomer_address_id() {
		return customer_address_id;
	}

	public void setCustomer_address_id(int customer_address_id) {
		this.customer_address_id = customer_address_id;
	}

	public CustomerCustomerEntityToCreate getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerCustomerEntityToCreate customerData) {
		this.customerData = customerData;
	}

	public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}
}
