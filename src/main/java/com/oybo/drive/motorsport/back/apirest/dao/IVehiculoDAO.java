package com.oybo.drive.motorsport.back.apirest.dao;

import java.util.List;

import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsDAOException;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;

public interface IVehiculoDAO {

	/**
	 * Metodo que obtiene los vehiculos registrados en bd
	 * @return Lista de vehiculos
	 * @throws DriveMotorsportsDAOException en caso de ocurrir una excepción
	 */
	List<VehiculoBean> getVehiculos() throws DriveMotorsportsDAOException;
}
