package modulo_6_practica_14;

public abstract class PAS extends Personal {

	// ATRIBUTOS
	// atributos exclusibo de la clase PAS las horas extras se declara static el
	// valor para su uso
	protected static final double VALOR_HORA_EXTRA = 6;
	private double cantidadHorasExtras;

	// CONSTRUCTORES

	public PAS(String nombre, String dni, double cantidadHorasExtras, int cantidadSexenios) {
		super(nombre, dni, cantidadSexenios);
		this.cantidadHorasExtras = cantidadHorasExtras;
	}

	// GETTERS Y SETTERS

	public double getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}

	public void setCantidadHorasExtras(double cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}

	// METODOS

	// metodo para calcular las horas extras
	public double horasExtras() {
		return cantidadHorasExtras * VALOR_HORA_EXTRA;
	}

	// al momento de pagar la nomina este metodo reinicia las horas extras
	public void reinicioHorasExtras() {
		cantidadHorasExtras = 0;
	}

	// este metodo devuelve la categoria dependiendo la instancia del objeto en
	// cuestion
	@Override
	public String getCategoria() {
		if (this instanceof Administrativo)
			return "Administrativo";
		if (this instanceof Informatico)
			return "Inforamtico";
		return "PAS";
	}

	// utiliza el metodo de la clase padre y suma la cantidad de horas extras
	// se llama al procedimineto reiniciarHorasExtras() para dejar las horas extras
	// en 0
	// se toma que ya ser haria el pago de sueldo al momento de generar el sueldo.
	@Override
	public double generarSueldo() {
		double total = 0;
		total += calcularSalario() + horasExtras();
		return total;
	}

//realiza la nomina segun su instancia los datos que va a filtrar
	@Override
	public String getNomina() {
		StringBuilder builder = new StringBuilder();

		builder.append("Nombre: ");
		builder.append(getNombre());
		builder.append("\nCategoria: ");
		builder.append(getCategoria());

		if (this instanceof Administrativo) {
			builder.append("\nHoras por semana: ");
			builder.append(Administrativo.HORAS_SEMANA);
			builder.append("\nValor Hora: $");
			builder.append(Administrativo.VALOR_HORA);
		}
		if (this instanceof Informatico) {
			builder.append("\nHoras por semana: ");
			builder.append(Informatico.HORAS_SEMANA);
			builder.append("\nValor Hora: $");
			builder.append(Informatico.VALOR_HORA);
		}

		builder.append("\nHoras extras: ");
		builder.append(getCantidadHorasExtras());
		builder.append("\nValor horas extras: $");
		builder.append(VALOR_HORA_EXTRA);
		builder.append("\nSexenios reconocidos: ");
		builder.append(getCantidadSexenios());
		builder.append("\nValor sexenio: $");
		builder.append(IMPORTE_SEXENIOS);
		builder.append("\nTotal Sueldo: $");
		builder.append(generarSueldo());

		return builder.toString();

	}

	// devuelve los datos de nombre categoria y sueldo
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
	public void pagarSueldos() {
//se utiliza para reeiniciar horas extras
		reinicioHorasExtras();
	}

}
