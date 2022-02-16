/**
 * 
 */
package controlador;

import java.util.ArrayList;

import dao.ActorDAO;
import dao.AlmacenDAO;
import dao.AlquilerDAO;
import dao.CiudadDAO;
import dao.ClienteDAO;
import dao.DireccionDAO;
//import conexion.FuncionesBD;
//import dao.AutorDAO;
//import dao.AutorLibroDAO;
//import dao.EditorialDAO;
import dao.EmpleadoDAO;
import dao.IdiomaDAO;
import dao.PeliculaDAO;
import modelo.Actor;
import modelo.Almacen;
import modelo.Alquiler;
import modelo.Ciudad;
import modelo.Cliente;
import modelo.Direccion;
//import dao.LibroDAO;
//import modelo.Autor;
//import modelo.Editorial;
import modelo.Empleado;
import modelo.Idioma;
import modelo.Pelicula;
import vista.MostrarAlmacen;
import vista.MostrarPelicula;
import vista.VentanaActores;
import vista.VentanaEmpleado;
import vista.VentanaIdiomas;
import vista.VentanaMostrarAlquiler;
import vista.VentanaMostrarCiudad;
import vista.VentanaMostrarDireccion;
import vista.VentanaPpal;
import vista.VistaMostrarCliente;

/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema

	//private VentanaPpal ventanaPpal;
	private VentanaPpal ventanaPpal;
	private MostrarAlmacen mostrarAlmacen;
	private MostrarPelicula mostrarPelicula;
	private VentanaActores ventanaActores;
	private VentanaEmpleado ventanaEmpleado;
	private VentanaIdiomas ventanaIdiomas;
	private VentanaMostrarAlquiler ventanaMostrarAlquiler;
	private VentanaMostrarCiudad ventanaMostrarCiudad;
	private VentanaMostrarDireccion ventanaMostrarDireccion;
	private VistaMostrarCliente vistaMostrarCliente;

	
	// Objetos DAO o CRUD de la base de datos
	//private EditorialDAO editorialDAO;
	private ActorDAO actorDAO;
	private AlmacenDAO almacenDAO;
	private AlquilerDAO alquilerDAO;
	private CiudadDAO ciudadDAO;
	private ClienteDAO clienteDAO;
	private DireccionDAO direccionDAO;
	private EmpleadoDAO empleadoDAO;
	private PeliculaDAO peliculaDAO;
	private IdiomaDAO idiomaDAO;


	
	public Controlador() {
		// Creamos las ventanas de la aplicación

		ventanaPpal = new VentanaPpal();
		mostrarAlmacen = new MostrarAlmacen();
		mostrarPelicula = new MostrarPelicula();
		ventanaActores = new VentanaActores();
		ventanaEmpleado = new VentanaEmpleado();
		ventanaMostrarAlquiler = new VentanaMostrarAlquiler();
		ventanaMostrarCiudad = new VentanaMostrarCiudad();
		ventanaMostrarDireccion = new VentanaMostrarDireccion();
		vistaMostrarCliente = new VistaMostrarCliente();
		ventanaIdiomas = new VentanaIdiomas();
		
		// Dando acceso al controlador desde las vistas
		ventanaPpal.setControlador(this);
		mostrarAlmacen.setControlador(this);
		mostrarPelicula.setControlador(this);
		ventanaActores.setControlador(this);
		ventanaEmpleado.setControlador(this);
		ventanaMostrarAlquiler.setControlador(this);
		ventanaMostrarCiudad.setControlador(this);
		ventanaMostrarDireccion.setControlador(this);
		vistaMostrarCliente.setControlador(this);
		ventanaIdiomas.setControlador(this);

		
		// Creamos los objetos DAO
		//editorialDAO = new EditorialDAO();
		actorDAO = new ActorDAO();
		almacenDAO = new AlmacenDAO();
		alquilerDAO = new AlquilerDAO();
		ciudadDAO = new CiudadDAO();
		direccionDAO = new DireccionDAO();
		clienteDAO = new ClienteDAO();
		empleadoDAO = new EmpleadoDAO();
		peliculaDAO = new PeliculaDAO();
		idiomaDAO = new IdiomaDAO();

	}
	
	public void inciarPrograma() {
		ventanaPpal.setVisible(true);
	}

	
	
	public void mostrarAlmacen() {
		ArrayList<Almacen> lista = almacenDAO.obtenerAlmacen();
		mostrarAlmacen.setListaAlmacen(lista);
		mostrarAlmacen.setVisible(true);
	}
	
	public void mostrarPelicula() {
		ArrayList<Pelicula> lista = peliculaDAO.obtenerPelicula();
		mostrarPelicula.setListaPelicula(lista);
		mostrarPelicula.setVisible(true);
	}
	
	public void mostrarActores() {
		ArrayList<Actor> lista = actorDAO.obtenerActor();
		ventanaActores.setListaActores(lista);
		ventanaActores.setVisible(true);
	}
	
	public void mostrarEmpleados() {
		ArrayList<Empleado> lista = empleadoDAO.obtenerEmpleado();
		ventanaEmpleado.setListaEmpleados(lista);
		ventanaEmpleado.setVisible(true);
	}
	
	public void mostrarAlquiler() {
		ArrayList<Alquiler> lista = alquilerDAO.mostrarAlquiler();
		ventanaMostrarAlquiler.setListaAlquiler(lista);
		ventanaMostrarAlquiler.setVisible(true);
	}
	
	public void mostrarCiudad() {
		ArrayList<Ciudad> lista = ciudadDAO.obtenerCiudades();
		ventanaMostrarCiudad.setListaCidades(lista);
		ventanaMostrarCiudad.setVisible(true);
	}
	
	public void mostrarDireccion() {
		ArrayList<Direccion> lista = direccionDAO.obtenerDirecciones();
		ventanaMostrarDireccion.setListaDireccion(lista);
		ventanaMostrarDireccion.setVisible(true);
	}
	
	public void mostrarCliente() {
		ArrayList<Cliente> lista = clienteDAO.obtenerCliente();
		vistaMostrarCliente.setListaCliente(lista);
		vistaMostrarCliente.setVisible(true);
	}

	public void mostrarIdioma() {
		ArrayList<Idioma> lista = idiomaDAO.obtenerIdioma();
		ventanaIdiomas.setListaIdiomas(lista);;
		ventanaIdiomas.setVisible(true);
		
	}
	
	
	
}
