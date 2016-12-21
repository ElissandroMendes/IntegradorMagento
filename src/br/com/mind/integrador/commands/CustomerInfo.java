package br.com.mind.integrador.commands;

import br.com.mind.magento.Client.CustomerAddressEntityItem;
import br.com.mind.magento.Client.CustomerCustomerEntity;

public class CustomerInfo {
	private CustomerCustomerEntity customerData;
	private CustomerAddressEntityItem[] customerAddress;
	
	public CustomerInfo() {
		
	}
	
	public CustomerCustomerEntity getCustomerData() {
		return customerData;
	}
	
	public void setCustomerData(CustomerCustomerEntity customerData) {
		this.customerData = customerData;
	}
	
	public CustomerAddressEntityItem[] getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(CustomerAddressEntityItem[] customerAddress) {
		this.customerAddress = customerAddress;
	}

}
