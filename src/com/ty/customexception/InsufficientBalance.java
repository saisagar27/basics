package com.ty.customexception;

public class InsufficientBalance extends Exception{
	
	public InsufficientBalance(String message) {
		super(message);
	}

}