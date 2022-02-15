package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBD;
import modelo.*;

public class DireccionDAO {

private ConexionBD conexion;
	
	public DireccionDAO() {
		this.conexion = new ConexionBD();
	}
	
	public ArrayList<Direccion> obtenerDirecciones(){
		Connection con = conexion.getConexion();
		Statement consulta = null;
		ResultSet resultado = null;
		ArrayList<Direccion> lista = new ArrayList<Direccion>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from direccion");
			
			while(resultado.next()) {
				
				int  id_direccion = resultado.getInt("id_direccion");
				String direccion = resultado.getString("direccion");
				String direccion2 = resultado.getString("direccion2");
				String distrito = resultado.getString("distrito");
				int id_ciudad = resultado.getInt("id_ciudad");
				String codigo_postal = resultado.getString("codigo_postal");
				String telefono = resultado.getString("telefono");
				

				
				Direccion d = new Direccion(id_direccion,direccion,direccion2,distrito,id_ciudad,codigo_postal,telefono);
				lista.add(d);
			}
		}
		catch(SQLException e) {
			System.out.println("Error al realizar la consulta: "+e.getMessage());
		}
		finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			}
			catch(SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			}
			catch(Exception e) {
				System.out.println("Error, ha ocurrido un problema"+e.getMessage());
			}
		}
		return lista;
	}
	
}
