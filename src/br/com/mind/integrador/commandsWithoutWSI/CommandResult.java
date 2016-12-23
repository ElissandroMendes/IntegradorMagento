package br.com.mind.integrador.commandsWithoutWSI;

public class CommandResult {
	private String status;
	private String message;
	private Object data;
	private Object extraData;
	
	public CommandResult(String status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
		this.extraData = null;
	}

	public CommandResult(String status, String message, Object data, Object extraData) {
		this.status = status;
		this.message = message;
		this.data = data;
		this.extraData = extraData;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getExtraData() {
		return extraData;
	}

	public void setExtraData(Object extraData) {
		this.extraData = extraData;
	}
	
}
