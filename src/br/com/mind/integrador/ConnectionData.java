package br.com.mind.integrador;

public class ConnectionData {
	private String user;
	private String password;
	private String endpointUrl;
	
	public ConnectionData() {
		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEndpointUrl() {
		return endpointUrl;
	}

	public void setEndpointUrl(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}
	
	@Override
	public String toString() {
		return "ConnectionData [soapApiUser=" + user + ", soapApiPassword=" + password
				+ ", soapApiEndpointUrl=" + endpointUrl + "]";
	}

	
	
}
