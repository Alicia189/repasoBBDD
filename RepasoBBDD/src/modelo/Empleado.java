/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author Usuario
 *
 */
public class Empleado {
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private int idDireccion;
	private String email;
	private int idAlmacen;
	private int activo;
	private String username;
	private String password;
	
	
	
	public Empleado() {
		this.nombre = "";
		this.apellidos = "";
		this.email = "";
		this.username = "";
		this.password = "";
	}
	public Empleado(int idEmpleado, String nombre, String apellidos, int idDireccion, String email, int idAlmacen,
			int activo, String username, String password) {
		
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.idDireccion = idDireccion;
		this.email = email;
		this.idAlmacen = idAlmacen;
		this.activo = activo;
		this.username = username;
		this.password = password;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAlmacen, idDireccion, idEmpleado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idAlmacen == other.idAlmacen && idDireccion == other.idDireccion && idEmpleado == other.idEmpleado;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", idDireccion=" + idDireccion + ", email=" + email + ", idAlmacen=" + idAlmacen + ", activo="
				+ activo + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
}
