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
import modelo.Cliente;


/**
 * @author Alamos
 *
 */
public class ClienteDAO {
	private ConexionBD conexion;
	
	public ClienteDAO() {
		this.conexion = new ConexionBD();
	}
	
	
    public ArrayList<Cliente> obtenerCliente() {
    	// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		Statement consulta = null;
		ResultSet resultado = null;
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from cliente");
			
			// Bucle para recorrer todas las filas que devuelve la consulta
			while(resultado.next()) {
				int idCliente = resultado.getInt("id_cliente");
				int idAlmacen = resultado.getInt("id_almacen");
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellidos");
				String email = resultado.getString("email");
				int idDireccion = resultado.getInt("id_direccion");
				int activo = resultado.getInt("activo");
				Date fechaCreacion = resultado.getDate("fecha_creacion");
				
				Cliente cliente = new Cliente(idCliente, idAlmacen, nombre, apellido, email,idDireccion, activo, fechaCreacion);
				lista.add(cliente);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta sobre libros: "+e.getMessage());
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
