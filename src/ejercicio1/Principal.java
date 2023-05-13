package ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private static DefaultListModel <Peliculas> listModel;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					listModel = new DefaultListModel<Peliculas>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
		public Principal() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 550, 400);
		setTitle("Programa");
		setLocationRelativeTo(null);	//configuro posición en pantalla
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		
		//llamo a la ventana "AGREGAR PELÍCULA" desde el menú AGREGAR.
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				AgregarPelicula panel = new AgregarPelicula();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		
		mnPeliculas.add(mntmAgregar);

		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				ListarPeliculas panel = new ListarPeliculas();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
		}
	});
		
		mnPeliculas.add(mntmListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}

}
