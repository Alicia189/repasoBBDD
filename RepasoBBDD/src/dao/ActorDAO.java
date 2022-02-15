package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

import conexion.ConexionBD;
import modelo.Actor;

public class ActorDAO {
	private ConexionBD conexion;
	
	  public ActorDAO() {
	        this.conexion = new ConexionBD();
	  }	        
	            public ArrayList<Actor> obtenerActor() {
	        	// Obtenemos una conexion a la base de datos.
	    		Connection con = conexion.getConexion();
	    		java.sql.Statement consulta = null;
	    		ResultSet resultado = null;
	    		ArrayList<Actor> lista = new ArrayList<Actor>();
	    		try {
	    			consulta = con.createStatement();
	    			resultado = consulta.executeQuery("select * from actores");
	    			
	    			// Bucle para recorrer todas las filas que devuelve la consulta
	    			while(resultado.next()) {
	    				int idActor= resultado.getInt("idActor");
	    				String nombre = resultado.getString("nombre");
	    				String ape = resultado.getString("apellidos");
	    				
	    				Actor ac= new Actor(idActor, nombre,ape);
	    				lista.add(ac);
	    			}
	    			
	    		} catch (SQLException e) {
	    			System.out.println("Error al realizar la consulta sobre actores: "+e.getMessage());
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
	            
	    		public Actor obtenerActor(int idActor) {
	    	    	// Obtenemos una conexion a la base de datos.
	    			Connection con = conexion.getConexion();
	    			PreparedStatement consulta = null;
	    			ResultSet resultado = null;
	    			Actor ac=null;
	    			
	    			try {
	    				consulta = con.prepareStatement("select * from actor"
	    						+ " where idActor = ?");
	    				consulta.setInt(1, idActor);
	    				resultado=consulta.executeQuery();
	    				
	    				// Bucle para recorrer todas las filas que devuelve la consulta
	    				if (resultado.next()) {
	    					String nombre = resultado.getString("nombre");
	    					String ape = resultado.getString("apellidos");
	    					
	    					ac = new Actor(idActor, nombre,ape);
	    				}
	    				
	    			} catch (SQLException e) {
	    				System.out.println("Error al realizar la consulta sobre actores: "
	    			         +e.getMessage());
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
	    			return ac;
	    	    }        
	    		
	    		public int insertarActor(Actor actor) {
	    	    	// Obtenemos una conexion a la base de datos.
	    			Connection con = conexion.getConexion();
	    			PreparedStatement consulta = null;
	    			int resultado=0;
	    			
	    			try {
	    				consulta = con.prepareStatement("INSERT INTO actor (nombre,apellidos)"
	    						+ " VALUES (?,?) ");
	    				
	    				consulta.setString(1, actor.getNombre());
	    				consulta.setString(2, actor.getApellidos());
	    				resultado=consulta.executeUpdate();

	    			} catch (SQLException e) {
	    				System.out.println("Error al realizar la inserción del actor: "
	    			        +e.getMessage());
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

	    		public int eliminarActor(Actor actor) {
	    	    	// Obtenemos una conexion a la base de datos.
	    			Connection con = conexion.getConexion();
	    			PreparedStatement consulta = null;
	    			int resultado=0;
	    			
	    			try {
	    				consulta = con.prepareStatement("DELETE FROM `sakila_es`.`actor`\r\n"
	    						+ "WHERE idActor = ?");
	    				
	    				consulta.setInt(1, actor.getIdActor());
	    				resultado=consulta.executeUpdate();

	    			} catch (SQLException e) {
	    				System.out.println("Error al realizar el borrado de Actor: "+e.getMessage());
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


}
