package com.oybo.drive.motorsport.back.apirest.excepcion;

import com.oybo.drive.motorsport.back.apirest.util.ErrorEnum;

public class DriveMotorsportsDAOException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4471984490639382729L;

	private final ErrorEnum error;
	
	private final Throwable causa;
	
	public DriveMotorsportsDAOException(ErrorEnum error, Throwable causa) {
		super(error.getMensaje(), causa);
		this.error = error;
		this.causa = causa;
	}

	public ErrorEnum getError() {
		return error;
	}

	public Throwable getCausa() {
		return causa;
	}

}
