/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author David
 *
 */
public class Pelicula {
	
	private int idPelicula;
	private String titulo;
	private String descripcion;
	private int anyoLanzamiento;
	private int idIdioma;
	private int idIdiomaOriginal;
	private int duracionAlquiler;
	private float rentalRate;
	private int duracion;
	private float rempacementCost;
	
	
	
	
	
	public Pelicula() {

	}

	public Pelicula(int idPelicula, String titulo, String descripcion, int anyoLanzamiento, int idIdioma,
			int idIdiomaOriginal, int duracionAlquiler, float rentalRate, int duracion, float rempacementCost) {
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.anyoLanzamiento = anyoLanzamiento;
		this.idIdioma = idIdioma;
		this.idIdiomaOriginal = idIdiomaOriginal;
		this.duracionAlquiler = duracionAlquiler;
		this.rentalRate = rentalRate;
		this.duracion = duracion;
		this.rempacementCost = rempacementCost;
	}

	/**
	 * @return el idPelicula
	 */
	public int getIdPelicula() {
		return idPelicula;
	}

	/**
	 * @param idPelicula el idPelicula a establecer
	 */
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return el descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion el descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return el anyoLanzamiento
	 */
	public int getAnyoLanzamiento() {
		return anyoLanzamiento;
	}

	/**
	 * @param anyoLanzamiento el anyoLanzamiento a establecer
	 */
	public void setAnyoLanzamiento(int anyoLanzamiento) {
		this.anyoLanzamiento = anyoLanzamiento;
	}

	/**
	 * @return el idIdioma
	 */
	public int getIdIdioma() {
		return idIdioma;
	}

	/**
	 * @param idIdioma el idIdioma a establecer
	 */
	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	/**
	 * @return el idIdiomaOriginal
	 */
	public int getIdIdiomaOriginal() {
		return idIdiomaOriginal;
	}

	/**
	 * @param idIdiomaOriginal el idIdiomaOriginal a establecer
	 */
	public void setIdIdiomaOriginal(int idIdiomaOriginal) {
		this.idIdiomaOriginal = idIdiomaOriginal;
	}

	/**
	 * @return el duracionAlquiler
	 */
	public int getDuracionAlquiler() {
		return duracionAlquiler;
	}

	/**
	 * @param duracionAlquiler el duracionAlquiler a establecer
	 */
	public void setDuracionAlquiler(int duracionAlquiler) {
		this.duracionAlquiler = duracionAlquiler;
	}

	/**
	 * @return el rentalRate
	 */
	public float getRentalRate() {
		return rentalRate;
	}

	/**
	 * @param rentalRate el rentalRate a establecer
	 */
	public void setRentalRate(float rentalRate) {
		this.rentalRate = rentalRate;
	}

	/**
	 * @return el duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion el duracion a establecer
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return el rempacementCost
	 */
	public float getRempacementCost() {
		return rempacementCost;
	}

	/**
	 * @param rempacementCost el rempacementCost a establecer
	 */
	public void setRempacementCost(float rempacementCost) {
		this.rempacementCost = rempacementCost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPelicula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return idPelicula == other.idPelicula;
	}

	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", titulo=" + titulo + ", descripcion=" + descripcion
				+ ", anyoLanzamiento=" + anyoLanzamiento + ", idIdioma=" + idIdioma + ", idIdiomaOriginal="
				+ idIdiomaOriginal + ", duracionAlquiler=" + duracionAlquiler + ", rentalRate=" + rentalRate
				+ ", duracion=" + duracion + ", rempacementCost=" + rempacementCost + "]";
	}
	
	

}
