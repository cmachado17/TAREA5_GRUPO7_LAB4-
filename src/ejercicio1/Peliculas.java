package ejercicio1;

public class Peliculas {
	
	private int id;
	private String nombre;
	private Categorias categoria;
	
	private static int cont = 0;
	
	public Peliculas() {
		cont++;
		
		this.id = cont;
		this.nombre = "Sin nombre";
		this.setCategoria(new Categorias());
	}
	
	
	public Peliculas(String nombre, Categorias categoria) {
		cont++;
		
		this.id = cont;
		this.nombre = nombre;
		this.setCategoria(categoria);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Categorias getCategoria() {
		return categoria;
	}


	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
