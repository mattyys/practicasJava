package modulo_6_14_universidad;

public abstract class Personal {

	// ATRIBUTOS

	// se crean atributos constantes para los calculos y static para utilizarlos sin
	// instanciar
	protected static final int SEMANAS_POR_MES = 4;
	protected static final double IMPORTE_SEXENIOS = 100;
	protected static final int SEXENIOS_PERMITIDOS = 6;

	private String nombre;
	private String dni;
	private String categoria;
	private int horasPorSemana;
	private double valorHora;
	private int cantidadSexenios;

	// CONSTRUCTORES
	// Se crean varios contructores para el uso de los atributos segun correspondan
	// las clases hijas
	public Personal(String nombre, String dni, int horasPorSemana, int cantidadSexenios) {
		this.nombre = nombre;
		this.dni = dni;
		this.horasPorSemana = horasPorSemana;
		this.cantidadSexenios = cantidadSexenios;
	}

	public Personal(String nombre, String dni, int horasPorSemana, double valorHora) {
		this.nombre = nombre;
		this.dni = dni;
		this.horasPorSemana = horasPorSemana;
		this.valorHora = valorHora;

	}

	public Personal(String nombre, String dni, int cantidadSexenios) {
		this.nombre = nombre;
		this.dni = dni;
		this.cantidadSexenios = cantidadSexenios;
	}

	public Personal(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getHorasPorSemana() {
		return horasPorSemana;
	}

	public void setHorasPorSemana(int horasPorSemana) {
		this.horasPorSemana = horasPorSemana;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getCantidadSexenios() {
		return cantidadSexenios;
	}

	public void setCantidadSexenios(int cantidadSexenios) {
		if (cantidadSexenios <= SEXENIOS_PERMITIDOS && cantidadSexenios > 0)
			this.cantidadSexenios = cantidadSexenios;
	}

	private double sexenios() {
		return cantidadSexenios * IMPORTE_SEXENIOS;
	}

	// METODOS

	// calcula el salario de manera general, valor de la hora x las horas semanales
	// y el resultado por la cantidad de semanas al mes
	// luego se le agregan los sexenios en caso de tener.
	public double calcularSalario() {
		double total = 0;
		total = (horasPorSemana * valorHora) * SEMANAS_POR_MES;
		total += sexenios();
		return total;
	}

	// imprime por defecto todos los datos de la clase persona
	public String imprimirDatos() {
		StringBuilder builder = new StringBuilder();

		builder.append("Personal \n[ \nDNI=");
		builder.append(dni);
		builder.append("\nNombre=");
		builder.append(nombre);
		builder.append("\nCategoria=");
		builder.append(categoria);
		builder.append("\nSueldo=");
		builder.append(calcularSalario());
		builder.append("\n]");

		return builder.toString();
	}

	// hice estos metodos abstractos para que se implementaran segun la clase
	public abstract String getCategoria();

	public abstract double generarSueldo();

	public abstract String getNomina();

	// aplica para reiniciar horas extras en PAS pero devuelve el sueldo para pagar
	public abstract void pagarSueldos();

}
