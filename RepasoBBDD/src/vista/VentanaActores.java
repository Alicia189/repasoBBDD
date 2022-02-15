package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.Actor;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaActores extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTable tableActores;
	private JButton btnInsertar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaActores frame = new VentanaActores();
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
	public VentanaActores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		
		JLabel lblListaActores = new JLabel("Lista de Actores");
		lblListaActores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblListaActores, "cell 0 0");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 1,grow");
		
		tableActores = new JTable();
		tableActores.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tableActores.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id_Actor", "Nombre", "Apellidos"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tableActores);
		
		 btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnInsertar, "cell 0 2,alignx right");
	}
	public void setControlador(Controlador controlador) {
		this.controlador=controlador;
		
	}
	public void setListaActores(ArrayList<Actor> lista) {
		DefaultTableModel modelo = (DefaultTableModel) tableActores.getModel();
		modelo.setRowCount(0);
		for (Actor actor : lista) {
			Object [] fila = {
					actor.getIdActor(), actor.getNombre(), actor.getApellidos()
			};
			modelo.addRow(fila);
		}
		
	}

}
