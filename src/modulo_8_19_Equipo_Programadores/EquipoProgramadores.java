
package modulo_8_19_Equipo_Programadores;

public class EquipoProgramadores {

	final int MAX_INTEGRANTES = 3;
	final int MIN_INTEGRANTES = 2;

	private String nombreEquipo;
	private String universidad;

	private Programador[] programadores;// para devolver el tamanio del equipo se devuelve la cantidad de integrantes
	private String lenguaje;

	private int count = 0;

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

	public void addProgramador() throws MinimoIntegreantesNoAlcanzadoException {

		// cambiandop menu de programador para para controlar las cantidades ingresadas

		if (count == MAX_INTEGRANTES - 1) {
			throw new IndexOutOfBoundsException("Se llego al limite por equipo :: 3 integrantes");
		} else {
			Programador programador = new Programador();
			for (int i = count; i < programadores.length; i++) {

			}
			programadores[count] = programador;
			// isMinComplete(count);
			count++;
		}
	}

	private boolean isMinComplete() throws MinimoIntegreantesNoAlcanzadoException {
		if (count < MIN_INTEGRANTES - 1) {
			throw new MinimoIntegreantesNoAlcanzadoException(
			        "Ingrese un nuevo Programador para Completar el minimo requerido");
		}
		return true;

	}

	public String imprimirDatosEquipo() {
		StringBuilder builder = new StringBuilder();
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
				builder.append(programador);
			}
		}
		return builder.toString();
	}

}
