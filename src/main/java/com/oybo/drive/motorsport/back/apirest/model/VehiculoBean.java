package com.oybo.drive.motorsport.back.apirest.model;

public class VehiculoBean extends VehiculoComplementoBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2166166048228980557L;
	
	private int id_vehiculo;
	private String modelo;
	private int anio;
	private String marca;
	private Double km;	
	
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Double getKm() {
		return km;
	}
	
	public void setKm(Double km) {
		this.km = km;
	}
	
}
