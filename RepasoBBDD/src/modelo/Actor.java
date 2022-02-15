package modelo;

import java.util.Objects;

public class Actor {
	
	int idActor;
	String nombre;
	String apellidos;
	
	
	@Override
	public String toString() {
		return "Actor [idActor=" + idActor + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idActor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actor other = (Actor) obj;
		return idActor == other.idActor;
	}
	public int getIdActor() {
		return idActor;
	}
	public void setIdActor(int idActor) {
		this.idActor = idActor;
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
	public Actor() {
		super();
	}
	public Actor(int idActor, String nombre, String apellidos) {
		super();
		this.idActor = idActor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

}
