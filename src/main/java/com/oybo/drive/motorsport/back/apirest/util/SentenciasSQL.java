package com.oybo.drive.motorsport.back.apirest.util;

public final class SentenciasSQL {
	
	public static final String QUERY_GET_VEHICULOS = "SELECT V.ID_VEHICULO AS ID, V.MODELO AS MODELO, V.ANIO AS ANIO, M.NOMBRE AS MARCA, V.KM AS KM, T.NOMBRE AS TRANSMISION, V.DESCRIPCION AS DESCRIPCION, V.IMAGEN AS IMAGEN FROM VEHICULO AS V INNER JOIN MARCA AS M ON(V.ID_MARCA = M.ID_MARCA) INNER JOIN TRANSMISION AS T ON(V.ID_TRANSMISION = T.ID_TRANSMISION)";

}
