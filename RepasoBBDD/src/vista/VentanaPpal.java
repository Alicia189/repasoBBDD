package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import net.miginfocom.swing.MigLayout;

public class VentanaPpal extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	/**
	 * Create the frame.
	 */
	public VentanaPpal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[][][][][][][][][]"));
		
		JButton btnNewButton = new JButton("Mostrar Almac\u00E9n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarAlmacen();
			}
		});
		contentPane.add(btnNewButton, "flowy,cell 0 0,growx");
		
		JButton btnNewButton_1 = new JButton("Mostrar Pel\u00EDcula");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarPelicula();
			}
		});
		contentPane.add(btnNewButton_1, "cell 0 1,growx");
		
		JButton btnNewButton_2 = new JButton("Mostrar Actores");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarActores();
			}
		});
		contentPane.add(btnNewButton_2, "cell 0 2,growx");
		
		JButton btnMostrarEmpleados = new JButton("Mostrar Empleados");
		btnMostrarEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarEmpleados();
			}
		});
		contentPane.add(btnMostrarEmpleados, "cell 0 3,growx");
		
		JButton btnNewButton_3 = new JButton("MostrarIdioma");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarIdioma();
			}
		});
		contentPane.add(btnNewButton_3, "cell 0 4,growx");
		
		JButton btnNewButton_4 = new JButton("Mostrar Alquiler");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarAlquiler();
			}
		});
		contentPane.add(btnNewButton_4, "cell 0 5,growx");
		
		JButton btnNewButton_5 = new JButton("Mostrar Ciudad");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarCiudad();
			}
		});
		contentPane.add(btnNewButton_5, "cell 0 6,growx");
		
		JButton btnNewButton_6 = new JButton("Mostrar Direccion");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarDireccion();
			}
		});
		contentPane.add(btnNewButton_6, "cell 0 7,growx");
		
		JButton btnNewButton_7 = new JButton("MostrarCliente");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.mostrarCliente();
			}
		});
		contentPane.add(btnNewButton_7, "cell 0 8,growx");
	}
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
		
	}
	
}
