package modulo_6_14_universidad;

public abstract class PDI extends Personal {

	// CONSTRUCTORES
	public PDI(String nombre, String dni) {
		super(nombre, dni);
	}

	public PDI(String nombre, String dni, int cantidadSexenios) {
		super(nombre, dni, cantidadSexenios);
	}

	// METODOS
	@Override
	public String getCategoria() {
		if (this instanceof Profesor)
			return "Profesor";
		if (this instanceof Investigador)
			return "Investigador";
		return "PDI";
	}

	@Override
	public String imprimirDatos() {
		StringBuilder builder = new StringBuilder();

		builder.append("\nNombre = ");
		builder.append(getNombre());
		builder.append("\nCategoria = ");
		builder.append(getCategoria());
		builder.append("\nSueldo = $ ");
		builder.append(generarSueldo());

		return builder.toString();
	}

	@Override
	public double generarSueldo() {
		return super.calcularSalario();
	}

	@Override
	public String getNomina() {
		StringBuilder builder = new StringBuilder();

		builder.append("Nombre: ");
		builder.append(getNombre());
		builder.append("\nCategoria: ");
		builder.append(getCategoria());

		if (this instanceof Profesor) {
			builder.append("\nHoras por semana: ");
			builder.append(Profesor.HORAS_SEMANA);
			builder.append("\nValor Hora: ");
			builder.append(Profesor.VALOR_HORA);
			builder.append("\nSexenios reconocidos: ");
			builder.append(getCantidadSexenios());
			builder.append("\nValor sexenio: $");
			builder.append(IMPORTE_SEXENIOS);
		}
		if (this instanceof Investigador) {
			builder.append("\nHoras por semana: ");
			builder.append(Investigador.HORAS_SEMANA);
			builder.append("\nValor Hora: ");
			builder.append(Investigador.VALOR_HORA);
		}

		builder.append("\nTotal Sueldo: $");
		builder.append(generarSueldo());

		return builder.toString();
	}

	@Override
	public void pagarSueldos() {
		// no hace nada, se usa para reiniciar horas extras en PAS
	}

}