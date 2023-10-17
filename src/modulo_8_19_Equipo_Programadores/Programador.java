package modulo_8_19_Equipo_Programadores;

public class Programador {

	final int MAX_CARACTERES = 20;

	private String nombre;
	private String apellido;

	// 1. metodo para validar los nombres menos de 20 caracteres y solo se permite
	// letras
	public Programador() {
		super();
	}

	public Programador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	private boolean checkLetras(String str) throws NumberInStringException {
		if (str == null) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			char caracter = str.charAt(i);
			if (!(caracter >= 'A' && caracter <= 'Z') && !(caracter >= 'a' && caracter <= 'z')) {
				throw new NumberInStringException("La informacion ingresada no debe contener numeros");
			}
		}
		return true;
	}

	private String checkLength(String str) throws MaxLengthStringException, NumberInStringException {
		if (str.length() < MAX_CARACTERES && checkLetras(str)) {
			return str;
		} else {
			throw new MaxLengthStringException("El dato ingresado no debe superar los 20 caracteres");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws MaxLengthStringException, NumberInStringException {
		this.nombre = checkLength(nombre);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws MaxLengthStringException, NumberInStringException {
		this.apellido = checkLength(apellido);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre = ");
		builder.append(nombre);
		builder.append(", Apellido = ");
		builder.append(apellido);
		return builder.toString();
	}

}
