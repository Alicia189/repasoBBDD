package modelo;

import java.util.Objects;

public class idioma {
	private int id_idioma;
	private String nombre;
	
	public idioma(int id_idioma, String nombre) {
		super();
		this.id_idioma=id_idioma;
		this.nombre=nombre;
	}

	public int getId_idioma() {
		return id_idioma;
	}

	public void setId_idioma(int id_idioma) {
		this.id_idioma = id_idioma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_idioma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		idioma other = (idioma) obj;
		return id_idioma == other.id_idioma;
	}

	@Override
	public String toString() {
		return "idioma [id_idioma=" + id_idioma + ", nombre=" + nombre + "]";
	}
	

}
