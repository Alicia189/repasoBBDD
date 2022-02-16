package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.Pelicula;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MostrarPelicula extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarPelicula frame = new MostrarPelicula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MostrarPelicula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id Pelicula", "Titulo", "Descripcion", "A\u00F1o Lanzamiento", "Id Idioma", "Id Idioma Original", "Duracion Alquiler", "Rental Rate", "Duracion", "Remplacement Cost"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, Float.class, Integer.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(3).setPreferredWidth(96);
		table.getColumnModel().getColumn(9).setPreferredWidth(90);
		scrollPane.setViewportView(table);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnSalir, "cell 0 2,alignx right");
		
	}
		
		public void setListaPelicula(ArrayList<Pelicula> lista) {
			DefaultTableModel modelo = (DefaultTableModel) table.getModel();
			modelo.setRowCount(0);
			for (Pelicula pelicula : lista) {
				Object [] fila = {
						pelicula.getIdPelicula(), pelicula.getTitulo(), pelicula.getDescripcion(), pelicula.getAnyoLanzamiento(), pelicula.getIdIdioma(),
						pelicula.getIdIdiomaOriginal(), pelicula.getDuracionAlquiler(), pelicula.getRentalRate(), pelicula.getDuracion(), pelicula.getRempacementCost()
				};
				modelo.addRow(fila);
		
			}
		
		}
		
		/**
		 * @param controlador el controlador a establecer
		 */
		public void setControlador(Controlador controlador) {
			this.controlador = controlador;
		}
	
}
