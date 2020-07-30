package com.oybo.drive.motorsport.back.apirest.service;

import java.util.List;

import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsException;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;

public interface IVehiculoService {
	
	/**
	 * Metodo que obtiene los vehiculos de la BD
	 * @return lista de vehiculos
	 * @throws DriveMotorsportsException en caso de ocurrir una excepción
	 */
	List<VehiculoBean> getVehiculos() throws DriveMotorsportsException;

}
