package br.com.mind.integrador.core;

public class MageAPIException extends Exception {

	public MageAPIException() {
	}

	public MageAPIException(String message) {
		super(message);
	}

	public MageAPIException(Throwable cause) {
		super(cause);
	}

	public MageAPIException(String message, Throwable cause) {
		super(message, cause);
	}

	public MageAPIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
