package br.com.mind.integrador.commandsWithoutWSI;

import br.com.mind.magento.ClientWithoutWSI.CustomerAddressEntityItem;
import br.com.mind.magento.ClientWithoutWSI.CustomerCustomerEntity;

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
