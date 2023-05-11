package ejercicio1;

public class Categorias {
	
	private String nombre;
	
	
	public Categorias() {
		this.nombre = "Sin nombre";
	}
	
	public Categorias(String nombre ) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	

}
