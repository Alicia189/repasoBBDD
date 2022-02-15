/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.ConexionBD;
import modelo.Empleado;

/**
 * @author Usuario
 *
 */
public class EmpleadoDAO {
	
	
private ConexionBD conexion;
	
    public EmpleadoDAO() {
        this.conexion = new ConexionBD();
    }
    
    public ArrayList<Empleado> obtenerEmpleado() {
    	// Obtenemos una conexion a la base de datos.
		Connection con = conexion.getConexion();
		Statement consulta = null;
		ResultSet resultado = null;
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		try {
			consulta = con.createStatement();
			resultado = consulta.executeQuery("select * from empleado");
			
			// Bucle para recorrer todas las filas que devuelve la consulta
			while(resultado.next()) {

				int idEmpleado = resultado.getInt("id_empleado");
				String nombre = resultado.getString("nombre");
				String apellidos = resultado.getString("apellidos");
				int idDireccion = resultado.getInt("id_direccion");
				String email = resultado.getString("email");
				int idAlmacen = resultado.getInt("id_almacen");
				int activo = resultado.getInt("activo");
				String username = resultado.getString("username");
				String password = resultado.getString("password");
				
				Empleado e = new Empleado(idEmpleado, nombre, apellidos, idDireccion, email, idAlmacen, activo, username, password);
				lista.add(e);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta sobre empleados: "+e.getMessage());
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
