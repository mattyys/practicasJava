
package modulo_8_19_Equipo_Programadores;

public class EquipoProgramadores {

	public final int MAX_INTEGRANTES = 3;
	public final int MIN_INTEGRANTES = 2;

	private String nombreEquipo;
	private String universidad;

	private Programador[] programadores;// para devolver el tamanio del equipo se devuelve la cantidad de integrantes
	private String lenguaje;

	private int count = 0;

	// CONSTUCTORES
	public EquipoProgramadores() {
		super();
		programadores = new Programador[MAX_INTEGRANTES];
	}

	public EquipoProgramadores(String nombreEquipo, String universidad, String lenguaje) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.universidad = universidad;
		this.lenguaje = lenguaje;
		programadores = new Programador[MAX_INTEGRANTES];
	}

	// 1. metodo para determinar si el qeuipo esta lleno

	// 2. metodo para aniadir programadores, si esta lleno se lanza una excepcion

	// GETTERS Y SETTERS
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	/**
	 * Adds the programador.
	 * <p>
	 * Agrega el programador recibidop por parametro, cheuqea que no se supere el
	 * limite permitido Si lo supera lanza la excepcion
	 * </p>
	 *
	 * @param programador the programador
	 */
	public void addProgramador(Programador programador) {

		if (count == MAX_INTEGRANTES)
			throw new IndexOutOfBoundsException("Se llego al limite por equipo :: 3 integrantes");
		else
			programadores[count++] = programador;

	}

	/**
	 * Checks if is min complete.
	 * <p>
	 * Chequea si se llego al minimo de integrantes en el equipo
	 * </p>
	 *
	 * @return true, if is min complete
	 */
	public boolean isMinComplete() {
		if (count < MIN_INTEGRANTES) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * Imprimir datos equipo.
	 * <p>
	 * Devuelve toda la informacion del equipo creado
	 * </p>
	 *
	 * @return the string
	 */
	public String imprimirDatosEquipo() {
		StringBuilder builder = new StringBuilder();
		int num = 1;
		builder.append("Nombre Equipo = ");
		builder.append(nombreEquipo);
		builder.append("\nUniversidad = ");
		builder.append(universidad);
		builder.append("\nLenguaje = ");
		builder.append(lenguaje);
		builder.append("\nProgramadores::");
		for (Programador programador : programadores) {
			if (programador != null) {
				builder.append("\n");
				builder.append(num++);
				builder.append(".- ");
				builder.append(programador);
			}
		}
		return builder.toString();
	}

}
