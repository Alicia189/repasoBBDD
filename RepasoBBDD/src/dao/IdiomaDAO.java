package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBD;
import modelo.idioma;


public class IdiomaDAO {
	
	private ConexionBD conexion;
	
	public IdiomaDAO() {
		this.conexion= new ConexionBD();
	}
	 public ArrayList<idioma> obtenerIdioma() {
	    	// Obtenemos una conexion a la base de datos.
			Connection con = conexion.getConexion();
			Statement consulta = null;
			ResultSet resultado = null;
			ArrayList<idioma> lista = new ArrayList<idioma>();
			
			try {
				consulta = con.createStatement();
				resultado = consulta.executeQuery("select * from idioma");
				
				// Bucle para recorrer todas las filas que devuelve la consulta
				while(resultado.next()) {
					int id_idioma = resultado.getInt("id_idioma");
					String nombre = resultado.getString("nombre");
					
					idioma i = new idioma(id_idioma,nombre);
					lista.add(i);
				}
				
			} catch (SQLException e) {
				System.out.println("Error al realizar la consulta sobre idiomas: "+e.getMessage());
			} finally {
				try {
					resultado.close();
					consulta.close();
					conexion.desconectar();
				} catch (SQLException e) {
					System.out.println("Error al liberar recursos: "+e.getMessage());
				} catch (Exception e) {
					
				}
			}
			return lista;
	    }

}
