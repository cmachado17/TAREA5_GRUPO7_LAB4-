package ejercicio1;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JTextField;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AgregarPelicula extends JPanel {


	private static final long serialVersionUID = 1L;
	private DefaultListModel<Peliculas> listModel;
	private JTextField textNombre;
	private JLabel lblId;
	private JLabel lblIDPelicula;
	private JLabel lblNombre;
	private JLabel lblGnero;
	private JComboBox<Categorias> cbGenero;
	private JButton btnAceptar;


	public AgregarPelicula() {
		DibujarPanel();
	}
	
	public void DibujarPanel() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{66, 12, 28, 44, 41, 0, 86, 6, 71, 0};
		gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
				
				lblId = new JLabel("ID");
				lblId.setBounds(66, 10, 12, 13);
				GridBagConstraints gbc_lblId = new GridBagConstraints();
				gbc_lblId.anchor = GridBagConstraints.WEST;
				gbc_lblId.insets = new Insets(0, 0, 5, 5);
				gbc_lblId.gridx = 2;
				gbc_lblId.gridy = 0;
				add(lblId, gbc_lblId);
				lblId.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		lblIDPelicula = new JLabel(Integer.toString(Peliculas.getProximoID()));
		lblIDPelicula.setBounds(302, 10, 6, 13);
		GridBagConstraints gbc_lblIDPelicula = new GridBagConstraints();
		gbc_lblIDPelicula.anchor = GridBagConstraints.WEST;
		gbc_lblIDPelicula.insets = new Insets(0, 0, 5, 5);
		gbc_lblIDPelicula.gridx = 4;
		gbc_lblIDPelicula.gridy = 0;
		add(lblIDPelicula, gbc_lblIDPelicula);
		lblIDPelicula.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(116, 9, 44, 14);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textNombre = new JTextField();
		textNombre.setBounds(211, 6, 86, 20);
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.anchor = GridBagConstraints.WEST;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.gridx = 4;
		gbc_textNombre.gridy = 1;
		add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setBounds(165, 9, 41, 14);
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.WEST;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 2;
		gbc_lblGnero.gridy = 2;
		add(lblGnero, gbc_lblGnero);
		lblGnero.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		cbGenero = new JComboBox<Categorias>();
		cbGenero.addItem(new Categorias("Seleccione un genero"));
		cbGenero.addItem(new Categorias("Terror"));
		cbGenero.addItem(new Categorias("Accion"));
		cbGenero.addItem(new Categorias("Suspenso"));
		cbGenero.addItem(new Categorias("Romantica"));
		cbGenero.setBounds(83, 6, 28, 20);
		GridBagConstraints gbc_cbGenero = new GridBagConstraints();
		gbc_cbGenero.anchor = GridBagConstraints.WEST;
		gbc_cbGenero.insets = new Insets(0, 0, 5, 5);
		gbc_cbGenero.gridx = 4;
		gbc_cbGenero.gridy = 2;
		add(cbGenero, gbc_cbGenero);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(165, 200, 71, 23);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((textNombre.getText() != null) && (!textNombre.getText().isEmpty()) && (((Categorias)cbGenero.getSelectedItem()).toString() != "Seleccione un genero"))  {
					Peliculas pelicula = new Peliculas();				
					pelicula.setNombre(textNombre.getText());
					pelicula.setCategoria( ((Categorias)cbGenero.getSelectedItem()));
					
					listModel.addElement(pelicula);
					
					listModel=ordenarLista(listModel);
					
					mostarListaOrdenada(listModel);
					
					textNombre.setText("");
					cbGenero.setSelectedIndex(0);
					lblIDPelicula.setText(Integer.toString(Peliculas.getProximoID()));

					}
				else {
					JOptionPane.showMessageDialog(null, "No se pudo agregar la pelicula, corrobore los campos");
				}
				
			}
		});
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 4;
		add(btnAceptar, gbc_btnAceptar);
		
	}
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}

	public DefaultListModel<Peliculas> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<Peliculas> listModel) {
		this.listModel = listModel;
	}
	
	
	private DefaultListModel<Peliculas> ordenarLista(DefaultListModel<Peliculas> listModel) {
		List <Peliculas> listaAOrdenar = new ArrayList<>();
		for (int i=0; i<listModel.size(); i++) {
			listaAOrdenar.add((Peliculas)listModel.get(i));
		}
		
		Collections.sort(listaAOrdenar);
		
		DefaultListModel<Peliculas> model = new DefaultListModel<>();
			 for(Peliculas val : listaAOrdenar) {
				 model.addElement(val);					 
			 }
				 
		return model;
	}
	
	void mostarListaOrdenada(DefaultListModel<Peliculas> listModel) {
		//List <Peliculas> mostrar = new ArrayList<>();
		for (int i=0; i<listModel.size(); i++) {
			System.out.println(listModel.get(i));
		}
		System.out.println("Fin de la lista");
	}
}


