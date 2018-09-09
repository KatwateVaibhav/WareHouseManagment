package com.fynd.warehouse.exception;

public class RackFullException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -9017301487247925269L;

	public RackFullException(Throwable cause,String msg)
    {  
        super(msg,cause);  
    }
	
	public RackFullException(String msg)
    {  
        super(msg);  
    }
}
