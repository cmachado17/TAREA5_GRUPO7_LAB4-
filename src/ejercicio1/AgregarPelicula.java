package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AgregarPelicula extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JLabel lblId;
	private JLabel lblIDPelicula;
	private JLabel lblNombre;
	private JLabel lblGnero;
	private JComboBox<Categorias> cbGenero;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarPelicula frame = new AgregarPelicula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public AgregarPelicula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 550, 400);
		setLocationRelativeTo(null);	//configuro posición en pantalla
		setTitle("Programa");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblId = new JLabel("ID");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblId.setBounds(126, 90, 46, 14);
		contentPane.add(lblId);
		
		
		//CAMPO ID DE PELÍCULA
		lblIDPelicula = new JLabel("1");
		lblIDPelicula.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblIDPelicula.setBounds(248, 90, 46, 14);
		contentPane.add(lblIDPelicula);
		
		//CAMPO NOMBRE
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(126, 118, 46, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(248, 115, 140, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		
		//DESPLEGABLE GÉNERO
		lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGnero.setBounds(126, 148, 46, 14);
		contentPane.add(lblGnero);
		
		cbGenero = new JComboBox<Categorias>();
		cbGenero.setBounds(248, 146, 140, 20);
		contentPane.add(cbGenero);
		
		cbGenero.addItem(new Categorias("Terror"));
		cbGenero.addItem(new Categorias("Accion"));
		cbGenero.addItem(new Categorias("Suspenso"));
		cbGenero.addItem(new Categorias("Romantica"));
		
		
		//BOTÓN ACEPTAR
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(126, 195, 89, 23);
		contentPane.add(btnAceptar);
	}
}
