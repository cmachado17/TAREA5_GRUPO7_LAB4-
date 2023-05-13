package ejercicio1;

import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;

public class ListarPeliculas extends JPanel{

	private static final long serialVersionUID = 1L;
	private JList<Peliculas> listPeliculas;
	private DefaultListModel<Peliculas> listModel;

	public ListarPeliculas() {
		DibujarPanel();
	}
	
	public void DibujarPanel() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{66, 12, 28, 44, 41, 0, 86, 6, 71, 0};
		gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		GridBagConstraints gbc_lblPeliculas = new GridBagConstraints();
		gbc_lblPeliculas.anchor = GridBagConstraints.WEST;
		gbc_lblPeliculas.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeliculas.gridx = 1;
		gbc_lblPeliculas.gridy = 8;
		add(lblPeliculas, gbc_lblPeliculas);
		lblPeliculas.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 10;
		gbc_scrollPane.gridheight = 10;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.anchor = GridBagConstraints.WEST;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 5;
		add(scrollPane, gbc_scrollPane);
		
		listPeliculas= new JList<Peliculas>();
		
		scrollPane.setViewportView(listPeliculas);
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
		listPeliculas.setModel(this.listModel);
	}


	

}
