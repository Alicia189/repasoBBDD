package modelo;

import java.util.Objects;

public class Almacen {
	
	private int idAlmacen;
	private int idEmpleadoJefe;
	private int idDireccion;
	public int getIdAlmacen() {
		
		
	
		
	return idAlmacen;
	}
	public Almacen() {
		super();
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdEmpleadoJefe() {
		return idEmpleadoJefe;
	}
	public void setIdEmpleadoJefe(int idEmpleadoJefe) {
		this.idEmpleadoJefe = idEmpleadoJefe;
	}
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	public Almacen(int idAlmacen, int idEmpleadoJefe, int idDireccion) {
		super();
		this.idAlmacen = idAlmacen;
		this.idEmpleadoJefe = idEmpleadoJefe;
		this.idDireccion = idDireccion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAlmacen, idDireccion, idEmpleadoJefe);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Almacen other = (Almacen) obj;
		return idAlmacen == other.idAlmacen && idDireccion == other.idDireccion
				&& idEmpleadoJefe == other.idEmpleadoJefe;
	}
	@Override
	public String toString() {
		return "Almacen [idAlmacen=" + idAlmacen + ", idEmpleadoJefe=" + idEmpleadoJefe + ", idDireccion=" + idDireccion
				+ "]";
	}


}
