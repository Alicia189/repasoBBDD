/**
 * 
 */
package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexion.FuncionesBD;
import dao.AutorDAO;
import dao.AutorLibroDAO;
import dao.EditorialDAO;
import dao.LibroDAO;
import modelo.Autor;
import modelo.Editorial;
import modelo.Libro;
import vista.A�adirAutor;
import vista.A�adirEditorial;
import vista.DialogoEditoriales;
import vista.VentanaAutores;
import vista.VentanaA�adirLibro;
import vista.VentanaLibros;
import vista.VentanaPpal;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	private VentanaPpal ventanaPpal;

	
	// Objetos DAO o CRUD de la base de datos
	private EditorialDAO editorialDAO;

	
	public Controlador() {
		// Creamos las ventanas de la aplicaci�n
		ventanaPpal = new VentanaPpal();

		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);

		
		// Creamos los objetos DAO
		editorialDAO = new EditorialDAO();

	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}
	
	
}
