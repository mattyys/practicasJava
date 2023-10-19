package modulo_8_19_Equipo_Programadores;

public class Programador {

	final int MAX_CARACTERES = 20;

	private String nombre;
	private String apellido;

	// 1. metodo para validar los nombres menos de 20 caracteres y solo se permite
	// letras

	// CONSTRUCTORES
	public Programador() {
		super();
	}

	/**
	 * Instantiates a new programador.
	 *
	 * @param nombre   the nombre
	 * @param apellido the apellido
	 */
	public Programador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
	 * is Only Letters.
	 * <p>
	 * Permite verificar si la cadena recibida como parametro contiene solo texto
	 * sin numeros
	 * </p>
	 *
	 * @param str the str
	 * @return true, if successful
	 * @throws NumberInStringException the number in string exception
	 */
	private boolean isOnlyLetters(String str) throws NumberInStringException {
		if (str == null) {
			return false;
		}

		if (str.matches(".*[0-9].*"))
			throw new NumberInStringException("La informacion ingresada no debe contener numeros");

		return true;

	}

	/**
	 * Check length and number.
	 * <p>
	 * Permite verificar el texto recibido como parametro que no supere la longitud
	 * e 20 caracteres y hace un llamado al metodo isOnlyLetters
	 * </p>
	 *
	 * @param str the str
	 * @return true, if successful
	 * @throws MaxLengthStringException the max length string exception
	 * @throws NumberInStringException  the number in string exception
	 */
	public boolean checkLengthAndNumber(String str) throws MaxLengthStringException, NumberInStringException {
		if (str.length() < MAX_CARACTERES && isOnlyLetters(str)) {
			return true;
		} else {
			throw new MaxLengthStringException("El dato ingresado no debe superar los 20 caracteres");
		}
	}

	// GETERS Y SETTERS
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
