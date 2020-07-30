package com.oybo.drive.motorsport.back.apirest.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oybo.drive.motorsport.back.apirest.excepcion.DriveMotorsportsDAOException;
import com.oybo.drive.motorsport.back.apirest.mapper.VehiculoMapper;
import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;
import com.oybo.drive.motorsport.back.apirest.util.SentenciasSQL;

@Repository
public class VehiculoDAO implements IVehiculoDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VehiculoDAO.class);
	
	@Override
	public List<VehiculoBean> getVehiculos() throws DriveMotorsportsDAOException {
		LOGGER.debug("Entra a VehiculoDAO.getVehiculos");
		List<VehiculoBean> listVehiculos = new ArrayList<>();
		listVehiculos = jdbcTemplate.query(SentenciasSQL.QUERY_GET_VEHICULOS, new VehiculoMapper());
		LOGGER.debug("Sale de VehiculoDAO.getVehiculos");
		return listVehiculos;
	}

}
