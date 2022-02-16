/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBD;
import modelo.Ciudad;

/**
 * @author David
 * Clase que implementa un CRUD de la base batos
 * (Create, Read, update y delete)
 */
public class CiudadDAO {

	private ConexionBD conexion;
	
    public CiudadDAO() {
        this.conexion = new ConexionBD();
        
    }

    public ArrayList<Ciudad> obtenerCiudades() {
    	// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		Statement consulta = null;
		ResultSet resultado = null;
		ArrayList<Ciudad> lista = new ArrayList<Ciudad>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from ciudad");
			
			
			while(resultado.next()) {
				int id_ciudad = resultado.getInt("id_ciudad");
				String nombre = resultado.getString("nombre");
				int id_pais = resultado.getInt("id_pais");
				
				Ciudad c = new Ciudad(id_ciudad, nombre,id_pais);
				lista.add(c);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta de la ciudad: "+e.getMessage());
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
/*

    public Autor obtenerAutor(int idAutor) {
   
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		ResultSet resultado = null;
		Autor a=null;
		
		try {
			consulta = con.prepareStatement("select * from autor"
					+ "where idAutor = ?");
			consulta.setInt(1, idAutor);
			resultado=consulta.executeQuery();
			
			
			if (resultado.next()) {
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellido");
				
				a = new Autor(idAutor, nombre,apellido);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta: "+e.getMessage());
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
		return a;
    }


    public int insertarAutro(Autor autor) {
    	// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		int resultado=0;
		
		try {
			consulta = con.prepareStatement("INSERT INTO editoriales (nombre,apellido)"
					+ " VALUES (?,?) ");
			
			consulta.setString(1, autor.getNombre());
			consulta.setString(2, autor.getApellidos());
			resultado=consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta: "+e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;
    }

    public int actualizarAutor(Autor autor) {
    	// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		int resultado=0;
		
		try {
			consulta = con.prepareStatement("UPDATE `biblioteca`.`autor`\r\n"
					+ "SET `nombre` = ?, `apellido` = ?\r\n"
					+ "WHERE `idAutor` = ?;");
			
			consulta.setString(1, autor.getNombre());
			consulta.setString(2, autor.getApellidos());
			consulta.setInt(3,autor.getIdAutor());
			resultado=consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar la actualizacion de autores: "+e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;
    }


    public int eliminarEditorial(Editorial editorial) {
    	// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		int resultado=0;
		
		try {
			consulta = con.prepareStatement("DELETE FROM `biblioteca`.`editoriales`\r\n"
					+ "WHERE codEditorial = ?");
			
			consulta.setInt(1, editorial.getCodEditorial());
			resultado=consulta.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar la actualizacion: "+e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;
    }
*/
}
