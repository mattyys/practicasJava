package modulo_5_practica_10;
/*
 * Se requiere un programa que modele el concepto de una persona. Una persona
 * posee nombre, apellido, número de documento de identidad y año de nacimiento.
 * La clase debe tener un constructor que inicialice los valores de sus
 * respectivos atributos. La clase debe incluir los siguientes métodos:
 * 1.Definir un método que imprima por pantalla los valores de los atributos del
 * objeto. 2.En el método main se deben crear dos personas y mostrar los valores
 * de sus atributos por pantalla
 */

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

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", "Peréz", "123456789", 1990);
		Persona persona2 = new Persona("Maria", "de Peréz", "1122334455", 1992);

		System.out.println(persona1.printInfoPersona());
		System.out.println(persona2.printInfoPersona());
	}

}
