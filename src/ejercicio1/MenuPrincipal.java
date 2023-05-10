package ejercicio1;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private static DefaultListModel <Peliculas> listModel;


	
	public MenuPrincipal() {
		
		listModel = new DefaultListModel <Peliculas> ();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 550, 400);
		setTitle("Programa");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPeliculas.add(mntmListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(estado);
	}
}
