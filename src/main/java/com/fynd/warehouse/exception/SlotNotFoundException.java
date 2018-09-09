package com.fynd.warehouse.exception;

public class SlotNotFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6508554663102567341L;

	public SlotNotFoundException(Throwable cause,String msg)
    {  
        super(msg,cause);  
    }
	
	public SlotNotFoundException(String msg)
    {  
        super(msg);  
    }
}