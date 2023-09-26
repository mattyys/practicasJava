package ejercicioUmlJAva;

public class Cliente {

	// ATRIBUTOS
	private String nombre;
	private String correo;
	private String telefono;
	private Producto producto;

	// CONSTRUCTORES
	public Cliente(String nombre, String correo, Producto producto) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.producto = producto;
	}

	// GETTER Y SETTERS
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
