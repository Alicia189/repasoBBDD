/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author Fernando
 *
 */
public class Direccion {

	
	
	private int  id_direccion;
	private String direccion;
	private String direccion2;
	private String distrito;
	private int id_ciudad;
	private String codigo_postal;
	private String telefono;
	
	public Direccion(){
		this.direccion = "";
		this.direccion2 = "";
		this.codigo_postal = "";
		this.telefono = "";
	}

	public Direccion(int id_direccion, String dirección, String dirección2, String distrito, int id_ciudad,
			String codigo_postal, String teléfono) {
		super();
		this.id_direccion = id_direccion;
		this.direccion = dirección;
		this.direccion2 = dirección2;
		this.distrito = distrito;
		this.id_ciudad = id_ciudad;
		this.codigo_postal = codigo_postal;
		this.telefono = teléfono;
	}

	public int getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getDirección() {
		return direccion;
	}

	public void setDirección(String dirección) {
		this.direccion = dirección;
	}

	public String getDirección2() {
		return direccion2;
	}

	public void setDirección2(String dirección2) {
		this.direccion2 = dirección2;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public int getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(int id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getTeléfono() {
		return telefono;
	}

	public void setTeléfono(String teléfono) {
		this.telefono = teléfono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_direccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return id_direccion == other.id_direccion;
	}

	@Override
	public String toString() {
		return "Direccion [id_direccion=" + id_direccion + ", direccion=" + direccion + ", direccion2=" + direccion2
				+ ", distrito=" + distrito + ", id_ciudad=" + id_ciudad + ", codigo_postal=" + codigo_postal
				+ ", telefono=" + telefono + "]";
	}
	
	

	
	
	

}
