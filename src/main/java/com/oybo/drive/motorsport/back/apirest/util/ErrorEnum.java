package com.oybo.drive.motorsport.back.apirest.util;

public enum ErrorEnum {

	ERROR_GENERICO("Error 000", "Error Generico"),
	ERROR_BD("Error 001", "Error de Base de Datos");
	
	private String codigo;
	
	private String mensaje;
	
	ErrorEnum(String codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
