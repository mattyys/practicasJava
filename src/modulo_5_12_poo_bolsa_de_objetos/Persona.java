package modulo_5_12_poo_bolsa_de_objetos;

public class Persona {

	// ATRIBUTOS
	private String nombre;
	private String apellido;
	private String numeroDocumento;
	private int anioNacimiento;

	// CONSTRUCTORES
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, String documento, int anioNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDocumento = documento;
		this.anioNacimiento = anioNacimiento;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	// el método getInfoPersona devuelve todos los datos del objeto instanciado
	public String printInfoPersona() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre: ");
		builder.append(nombre);
		builder.append(", Apellido: ");
		builder.append(apellido);
		builder.append(", Documento de Identidad: ");
		builder.append(numeroDocumento);
		builder.append(" ,Año Nacimiento: ");
		builder.append(anioNacimiento);
		return builder.toString();
	}

	@Override
	public String toString() {
		return printInfoPersona();
	}

	// se modifica hashCode y equals para poder comparar si contiene el objeto en la
	// coleccion
//	@Override
//	public int hashCode() {
//		return Objects.hash(anioNacimiento, apellido, nombre, numeroDocumento);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Persona other = (Persona) obj;
//		return numeroDocumento.equals(other.getNumeroDocumento());
//	}

}
