package br.com.mind.integrador.commands;

import br.com.mind.magento.ClientWithWSI.CustomerAddressEntityItem;
import br.com.mind.magento.ClientWithWSI.CustomerCustomerEntity;

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
