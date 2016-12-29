package br.com.mind.integrador.commandsWithoutWSI;

import br.com.mind.magento.ClientWithoutWSI.CustomerAddressEntityCreate;

public class CustomerAddressUpdateCommand {
	private int customer_address_id;
	private int rewardpoints;
	private CustomerAddressEntityCreate addressdata; 
	
	public CustomerAddressUpdateCommand() {
		
	}

	public int getAddressId() {
		return customer_address_id;
	}

	public void setAddressId(int addressId) {
		this.customer_address_id = addressId;
	}

	public CustomerAddressEntityCreate getAddressdata() {
		return addressdata;
	}

	public void setAddressdata(CustomerAddressEntityCreate addressdata) {
		this.addressdata = addressdata;
	}

	public int getRewardpoints() {
		return rewardpoints;
	}

	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}
}
