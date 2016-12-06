package br.com.mind.integrador.commands;

import br.com.mind.magento.client.CustomerCustomerEntity;
import br.com.mind.magento.client.SalesOrderEntity;

public class SalesOrderInfo {
	private String order_id;
	private String created_at;
	private String updated_at;
	private String status;
	private String increment_id;
	private String tax_amount;
	private String shipping_amount;
	private String discount_amount;
	private String subtotal;
	private String grand_total;
	private String remote_ip;
	
	private CustomerCustomerEntity customer;
    private br.com.mind.magento.client.SalesOrderAddressEntity shipping_address;
    private br.com.mind.magento.client.SalesOrderAddressEntity billing_address;
	private br.com.mind.magento.client.SalesOrderItemEntity[] items;
    private br.com.mind.magento.client.SalesOrderPaymentEntity payment;

	
	public SalesOrderInfo() {
		
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIncrement_id() {
		return increment_id;
	}

	public void setIncrement_id(String increment_id) {
		this.increment_id = increment_id;
	}

	public String getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(String tax_amount) {
		this.tax_amount = tax_amount;
	}

	public String getShipping_amount() {
		return shipping_amount;
	}

	public void setShipping_amount(String shipping_amount) {
		this.shipping_amount = shipping_amount;
	}

	public String getDiscount_amount() {
		return discount_amount;
	}

	public void setDiscount_amount(String discount_amount) {
		this.discount_amount = discount_amount;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getGrand_total() {
		return grand_total;
	}

	public void setGrand_total(String grand_total) {
		this.grand_total = grand_total;
	}

	public CustomerCustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerCustomerEntity customer) {
		this.customer = customer;
	}

	public br.com.mind.magento.client.SalesOrderItemEntity[] getItems() {
		return items;
	}

	public void setItems(br.com.mind.magento.client.SalesOrderItemEntity[] items) {
		this.items = items;
	}

	public br.com.mind.magento.client.SalesOrderAddressEntity getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(br.com.mind.magento.client.SalesOrderAddressEntity shipping_address) {
		this.shipping_address = shipping_address;
	}

	public br.com.mind.magento.client.SalesOrderAddressEntity getBilling_address() {
		return billing_address;
	}

	public void setBilling_address(br.com.mind.magento.client.SalesOrderAddressEntity billing_address) {
		this.billing_address = billing_address;
	}

	public br.com.mind.magento.client.SalesOrderPaymentEntity getPayment() {
		return payment;
	}

	public void setPayment(br.com.mind.magento.client.SalesOrderPaymentEntity payment) {
		this.payment = payment;
	}

	public String getRemote_ip() {
		return remote_ip;
	}

	public void setRemote_ip(String remote_ip) {
		this.remote_ip = remote_ip;
	}
	
}
