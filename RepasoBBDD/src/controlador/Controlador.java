/**
 * 
 */
package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import conexion.FuncionesBD;
//import dao.AutorDAO;
//import dao.AutorLibroDAO;
//import dao.EditorialDAO;
import dao.EmpleadoDAO;
//import dao.LibroDAO;
//import modelo.Autor;
//import modelo.Editorial;
import modelo.Empleado;
//import modelo.Libro;
//import vista.AñadirAutor;
//import vista.AñadirEditorial;
//import vista.DialogoEditoriales;
//import vista.VentanaAutores;
//import vista.VentanaAñadirLibro;
//import vista.VentanaLibros;
//import vista.VentanaPpal;
import vistas.VentanaEmpleado;
import vistas.VentanaPpal;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	//private VentanaPpal ventanaPpal;
	private VentanaPpal ventanaPpal;
	private VentanaEmpleado ventanaEmpleado;

	
	// Objetos DAO o CRUD de la base de datos
	//private EditorialDAO editorialDAO;
	private EmpleadoDAO empleadoDAO;

	
	public Controlador() {
		// Creamos las ventanas de la aplicación
		ventanaPpal = new VentanaPpal();
		ventanaEmpleado = new VentanaEmpleado();

		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);
		ventanaEmpleado.setControlador(this);

		
		// Creamos los objetos DAO
		//editorialDAO = new EditorialDAO();
		empleadoDAO = new EmpleadoDAO();

	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}
	
	public void mostrarEmpleados() {
		ArrayList<Empleado> lista = empleadoDAO.obtenerEmpleado();
		ventanaEmpleado.setListaEmpleados(lista);;
		ventanaEmpleado.setVisible(true);
	}
	
	
}
