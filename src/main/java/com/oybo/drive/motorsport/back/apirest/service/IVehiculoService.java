package com.oybo.drive.motorsport.back.apirest.service;

import java.util.List;

import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsException;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;

public interface IVehiculoService {
	
	List<VehiculoBean> getVehiculos() throws DriveMotorsportsException;

}
