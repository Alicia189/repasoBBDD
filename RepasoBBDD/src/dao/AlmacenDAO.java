
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
import modelo.Almacen;


/**
 * @author MJotaCabezas
 * 
 *  Clase que implementa un CRUD de la base batos (Create, Read,
 *         update y delete)
 */

public class AlmacenDAO {
	private ConexionBD conexion;

	public AlmacenDAO() {
		this.conexion = new ConexionBD();
	}

	public ArrayList<Almacen> obtenerAlmacen() {
		
// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		Statement consulta = null;
		ResultSet resultado = null;
		ArrayList<Almacen> lista = new ArrayList<Almacen>();
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from almacén");
			
// Bucle para recorrer todas las filas que devuelve la consulta
			while (resultado.next()) {
				int idAlmacen = resultado.getInt("idAlmacen");
				int idEmpleadoJefe = resultado.getInt("idEmpleadoJefe");
				int idDireccion = resultado.getInt("idDireccion");
				
				Almacen al = new Almacen(idAlmacen, idEmpleadoJefe, idDireccion);
				lista.add(al);
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta: " + e.getMessage());
		} finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: " + e.getMessage());
			} catch (Exception e) {
			}
		}
		return lista;
	}

}
	
	
	/*
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: " + e.getMessage());
			} catch (Exception e) {
			}
		}
		return resultado;
	}

	public int actualizarAutor(Autor autor) {
		
// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		int resultado = 0;
		try {
			consulta = con.prepareStatement("UPDATE autores \r\n" + "SET `nombre` = ?, `apellidos` = ?\r\n"
					+ "WHERE `idAutor` = ?;");
			consulta.setString(1, autor.getNombre());
			consulta.setString(2, autor.getApellidos());
			consulta.setInt(3, autor.getIdAutor());
			resultado = consulta.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al realizar la actualizacion: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: " + e.getMessage());
			} catch (Exception e) {
			}
		}
		return resultado;
	}

	public int eliminarAutor(Autor autor) {
		
// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		PreparedStatement consulta = null;
		int resultado = 0;
		try {
			consulta = con.prepareStatement("DELETE FROM `biblioteca`.`autores`\r\n" + "WHERE idAutor = ?");
			consulta.setInt(1, autor.getIdAutor());
			resultado = consulta.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al realizar la actualizacion: " + e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: " + e.getMessage());
			} catch (Exception e) {
			}
		}
		return resultado;
	}
}
*/