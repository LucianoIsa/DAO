package com.educacionit.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public interface ConexionMySQL {

	default Connection getConexion() {
		Connection conexion = null;
		Properties propiedades = new Properties();

		try {
			propiedades.load(new FileInputStream(
					new File("src" + File.separator + "resources" + File.separator + "database.properties")));
			
			String URL = propiedades.getProperty("url") ;
			String USER = propiedades.getProperty("user") ;
			String PASS = propiedades.getProperty("pass") ;
			
			conexion = DriverManager.getConnection(URL, USER, PASS);
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;

	}

}
