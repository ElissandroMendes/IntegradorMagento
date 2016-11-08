package br.com.mind.integrador.commands;

public class ResultOK extends CommandResult {

	public ResultOK(Object data, String message) {
		super("OK", message, data);
	}

	public ResultOK(Object data) {
		super("OK", "OK", data);
	}

	public ResultOK(Object data, Object extraData) {
		super("OK", "OK", data, extraData);
	}
}
