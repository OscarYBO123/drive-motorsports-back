package com.oybo.drive.motorsport.back.apirest.dao;

import java.util.List;

import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsDAOException;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;

public interface IVehiculoDAO {

	List<VehiculoBean> getVehiculos() throws DriveMotorsportsDAOException;
}
