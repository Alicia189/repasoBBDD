/**
 * 
 */
package modelo;

import java.sql.Date;

/**
 * @author Alamos
 *
 */
public class Cliente {
	private int idCliente;
	private int idAlmacen;
	private String nombre;
	private String apellidos;
	private String email;
	private int idDireccion;
	private int activo;
	private Date fechaCreacion;
	
	
	
	public Cliente() {
		
	}
	
	public Cliente(int idCliente, int idAlmacen, String nombre, String apellidos, String email, int idDireccion,
			int activo, Date fechaCreacion) {
		super();
		this.idCliente = idCliente;
		this.idAlmacen = idAlmacen;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.idDireccion = idDireccion;
		this.activo = activo;
		this.fechaCreacion = fechaCreacion;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", idAlmacen=" + idAlmacen + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", email=" + email + ", idDireccion=" + idDireccion + ", activo=" + activo
				+ ", fechaCreacion=" + fechaCreacion + "]";
	}
	
	
	
	

}
