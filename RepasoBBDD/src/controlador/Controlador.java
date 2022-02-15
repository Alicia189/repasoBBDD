/**
 * 
 */
package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dao.IdiomaDAO;
import vista.VentanaIdiomas;



/**
 * @author David
 *
 */
public class Controlador {

	// VEntanas del sistema
	private VentanaIdiomas ventanaidiomas;

	
	// Objetos DAO o CRUD de la base de datos
	private IdiomaDAO idiomaDAO;

	
	public Controlador() {
		// Creamos las ventanas de la aplicación
		ventanaidiomas = new VentanaIdiomas();

		
		// Dando acceso al controlador desde las vistas
		ventanaidiomas.setControlador(this);

		
		// Creamos los objetos DAO
		idiomaDAO = new IdiomaDAO();

	}
	
	public void inciarPrograma() {
		ventanaidiomas.setVisible(true);
	}

	
	
	
}
