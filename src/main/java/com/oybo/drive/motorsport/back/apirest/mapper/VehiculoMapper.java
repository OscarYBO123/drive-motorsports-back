package com.oybo.drive.motorsport.back.apirest.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.oybo.drive.motorsport.back.apirest.model.VehiculoBean;

public class VehiculoMapper implements RowMapper<VehiculoBean>{

	@Override
	public VehiculoBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		VehiculoBean vehiculo = new VehiculoBean();
		vehiculo.setId_vehiculo(rs.getInt("ID_VEHICULO"));
		vehiculo.setModelo(rs.getString("MODELO"));
		vehiculo.setAnio(rs.getInt("ANIO"));
		vehiculo.setMarca(rs.getInt("ID_MARCA"));
		vehiculo.setKm(rs.getDouble("KM"));
		vehiculo.setTransmision(rs.getInt("ID_TRANSMISION"));
		vehiculo.setDescripcion(rs.getString("DESCRIPCION"));
		vehiculo.setImagen(rs.getBytes("IMAGEN"));
		return vehiculo;
	}

}
