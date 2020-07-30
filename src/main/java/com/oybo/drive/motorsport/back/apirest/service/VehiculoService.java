package com.oybo.drive.motorsport.back.apirest.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oybo.drive.motorsport.back.apirest.dao.IVehiculoDAO;
import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsDAOException;
import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsException;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;

@Service
public class VehiculoService implements IVehiculoService{
	
	@Autowired
	private IVehiculoDAO vehiculoDAO;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VehiculoService.class);

	@Override
	public List<VehiculoBean> getVehiculos() throws DriveMotorsportsException {
		LOGGER.debug("Entra a VehiculoService.getVehiculos");
		List<VehiculoBean> listVehiculos = new ArrayList<>();
		try {
			listVehiculos = vehiculoDAO.getVehiculos();
		} catch (DriveMotorsportsDAOException e) {
			throw new DriveMotorsportsException(e.getError(), e);
		}
		LOGGER.debug("Sale de VehiculoService.getVehiculos");
		return listVehiculos;
	}

}
