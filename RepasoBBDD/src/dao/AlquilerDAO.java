/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBD;
import modelo.Alquiler;

/**
 * @author Jose
 *
 */
public class AlquilerDAO {
	
	//CONEXION CON LA BBDD
	private static ConexionBD conexion;
	
	public static ArrayList<Alquiler> mostrarAlquiler() {
		
		//CONEXION CON LA BBDD
		Connection con = conexion.getConexion();
		
		Statement consulta = null;
		ResultSet resultado = null;
		
		ArrayList<Alquiler> lista = new ArrayList<Alquiler>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from alquiler");
			
			//recorre todas las final que devuelve la consulta
			while(resultado.next()) {
				int idAlquiler = resultado.getInt("id_alquiler");
				Date fechaAlquiler = resultado.getDate("fecha_alquiler");
				int idInventario = resultado.getInt("id_inventario");
				int idCliente = resultado.getInt("id_cliente");
				Date fechaDevolucion = resultado.getDate("fecha_devolucion");
				int idEmpleado = resultado.getInt("id_empleado");
				
				
				Alquiler al = new Alquiler(idAlquiler, fechaAlquiler, idInventario, idCliente, fechaDevolucion, idEmpleado);
				lista.add(al);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta " + e.getMessage());
		} finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos " + e.getMessage());
			}
		}
		return lista;
		
	}

}
