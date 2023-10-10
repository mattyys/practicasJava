package modulo_6_14_universidad;

public class Informatico extends PAS {
	// ATRIBUTOS
	protected final static int HORAS_SEMANA = 40;
	protected final static int VALOR_HORA = 6;

	// CONSTRUCTORES
	public Informatico(String nombre, String dni, double cantHorasExtras, int cantidadSexenios) {
		super(nombre, dni, cantHorasExtras, cantidadSexenios);
		setHorasPorSemana(HORAS_SEMANA);
		setValorHora(VALOR_HORA);
	}

}
