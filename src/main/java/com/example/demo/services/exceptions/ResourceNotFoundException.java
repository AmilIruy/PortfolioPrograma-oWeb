package com.example.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Este usuario não foi localizado:" + id);
	}

}
