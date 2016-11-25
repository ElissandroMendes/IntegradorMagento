package br.com.mind.integrador.commands;

public class ResultERROR extends CommandResult {

	public ResultERROR(String message) {
		super("ERROR", message, null);
	}

	public ResultERROR(String message, Object data) {
		super("ERROR", message, data);
	}
}
