package br.com.mind.integrador;

public class ConnectionData {
	private String soapApiUser;
	private String soapApiPassword;
	private String soapApiEndpointUrl;
	
	public ConnectionData() {
		
	}

	public String getSoapApiUser() {
		return soapApiUser;
	}

	public void setSoapApiUser(String soapApiUser) {
		this.soapApiUser = soapApiUser;
	}

	public String getSoapApiPassword() {
		return soapApiPassword;
	}

	public void setSoapApiPassword(String soapApiPassword) {
		this.soapApiPassword = soapApiPassword;
	}

	public String getSoapApiEndpointUrl() {
		return soapApiEndpointUrl;
	}

	public void setSoapApiEndpointUrl(String soapApiEndpointUrl) {
		this.soapApiEndpointUrl = soapApiEndpointUrl;
	}
}
