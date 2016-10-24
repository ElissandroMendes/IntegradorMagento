package br.com.mind.integrador;

public class CommandResult {
	public String status;
	public String message;
	public Object data;
	
	public CommandResult(String message) {
		this.status = "ERROR";
		this.message = message;
		this.data = null;
	}

	public CommandResult(Object data) {
		this.status = "OK";
		this.message = "";
		this.data = data;
	}
	
	
}
