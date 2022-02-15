/**
 * 
 */
package modelo;

import java.sql.Date;
import java.util.Objects;

/**
 * @author Jose
 *
 */
public class Alquiler {
	
	private int idAlquiler;
	private Date fechaAlquiler;
	private int idInventario;
	private int idCliente;
	private Date fechaDevolucion;
	private int idEmpleado;
	
	public Alquiler() {
		
	}
	
	public Alquiler(int idAlquiler, Date fechaAlquiler, int idInventario, int idCliente, Date fechaDevolucion,
			int idEmpleado) {
		this.idAlquiler = idAlquiler;
		this.fechaAlquiler = fechaAlquiler;
		this.idInventario = idInventario;
		this.idCliente = idCliente;
		this.fechaDevolucion = fechaDevolucion;
		this.idEmpleado = idEmpleado;
	}


	public int getIdAlquiler() {
		return idAlquiler;
	}
	public void setIdAlquiler(int idAlquiler) {
		this.idAlquiler = idAlquiler;
	}
	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}
	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public int getIdInventario() {
		return idInventario;
	}
	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlquiler);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return idAlquiler == other.idAlquiler;
	}

	@Override
	public String toString() {
		return "Alquiler [idAlquiler=" + idAlquiler + ", fechaAlquiler=" + fechaAlquiler + ", idInventario="
				+ idInventario + ", idCliente=" + idCliente + ", fechaDevolucion=" + fechaDevolucion + ", idEmpleado="
				+ idEmpleado + "]";
	}


}
