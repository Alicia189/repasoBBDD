package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import modelo.Alquiler;
import modelo.Idioma;
import net.miginfocom.swing.MigLayout;

public class VentanaMostrarAlquiler extends JFrame {

	private JPanel contentPane;
	private JTable tablaListado;
	private JButton btnCerrar;
	private Controlador controlador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMostrarAlquiler frame = new VentanaMostrarAlquiler();
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
	public VentanaMostrarAlquiler() {
		setBounds(100, 100, 767, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow][]"));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 0,grow");
		
		tablaListado = new JTable();
		tablaListado.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Alquiler", "Fecha Alquiler", "ID Inventario", "ID Cliente", "Fecha Devolucion", "ID Empleado"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Integer.class, Integer.class, Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tablaListado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(tablaListado);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnCerrar, "cell 0 1");
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setListaAlquiler(ArrayList<Alquiler> lista) {
		DefaultTableModel modelo = (DefaultTableModel) tablaListado.getModel();
		modelo.setRowCount(0);
		for (Alquiler alquiler : lista) {
			Object [] fila = {
					alquiler.getIdAlquiler(), alquiler.getFechaAlquiler(), alquiler.getIdInventario(),
					alquiler.getIdCliente(), alquiler.getFechaDevolucion(), alquiler.getIdEmpleado()
			};
			modelo.addRow(fila);
		}
	}
	
	
}
