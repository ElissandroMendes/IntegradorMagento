package br.com.mind.integrador.commandsWithoutWSI;

import br.com.mind.magento.ClientWithoutWSI.CustomerCustomerEntityToCreate;

public class CustomerUpdateCommand {
	private int customer_id;
	private int rewardpoints;
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

	public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

}
