package com.example.exception;

public class ProdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ProdException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ProdException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ProdException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

