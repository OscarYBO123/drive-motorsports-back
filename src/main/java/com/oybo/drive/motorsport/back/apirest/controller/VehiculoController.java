package com.oybo.drive.motorsport.back.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsException;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;
import com.oybo.drive.motorsport.back.apirest.service.IVehiculoService;


//lleva la anotacion de Restcontroller para indicar que es un controller.
@RestController
//lleva esta anotación para identificar de donde partira la URL
@RequestMapping("/api")
public class VehiculoController {
	
	/*Se hace referencia del service
	 SIEMPRE PONER @AUTOWIRED*/
	@Autowired
	private IVehiculoService vehiculoService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VehiculoController.class);
	
	@GetMapping(value="/vehiculos")
	public List<VehiculoBean> getVehiculos() throws DriveMotorsportsException{
		LOGGER.info("Entra a VehiculoController.getVehiculos");
		List<VehiculoBean> vehiculos = new ArrayList<>();
		try {
			vehiculos = vehiculoService.getVehiculos();
		} catch (DriveMotorsportsException e) {
			throw new DriveMotorsportsException(e.getError(), e);
		}
		LOGGER.info("Sale VehiculoController.getVehiculos");
		return vehiculos;
	}
	
}
