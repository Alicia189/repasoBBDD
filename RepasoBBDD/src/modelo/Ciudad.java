/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author Alicia
 *
 */
public class Ciudad {
		private int id_ciudad ;
		private String nombre;
		private int id_pais;
		
		public Ciudad(int id_ciudad, String nombre, int id_pais) {
			super();
			this.id_ciudad = id_ciudad;
			this.nombre = nombre;
			this.id_pais = id_pais;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(id_ciudad);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Ciudad other = (Ciudad) obj;
			return id_ciudad == other.id_ciudad;
		}
		@Override
		public String toString() {
			return "ciudad [id_ciudad=" + id_ciudad + ", nombre=" + nombre + ", id_pais=" + id_pais + "]";
		}

		public int getId_ciudad() {
			return id_ciudad;
		}

		public void setId_ciudad(int id_ciudad) {
			this.id_ciudad = id_ciudad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getId_pais() {
			return id_pais;
		}

		public void setId_pais(int id_pais) {
			this.id_pais = id_pais;
		}

	
	
	
	
}
