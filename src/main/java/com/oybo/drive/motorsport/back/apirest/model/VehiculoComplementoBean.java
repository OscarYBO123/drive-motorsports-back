package com.oybo.drive.motorsport.back.apirest.model;

import java.io.Serializable;

public class VehiculoComplementoBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1526885170131651047L;
	
	private String transmision;
	private String descripcion;
	private byte[] imagen;
	
	public String getTransmision() {
		return transmision;
	}
	
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public byte[] getImagen() {
		return imagen;
	}
	
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
}
