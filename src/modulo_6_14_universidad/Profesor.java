package modulo_6_14_universidad;

public class Profesor extends PDI {
	// ATRIBUTOS
	protected final static int HORAS_SEMANA = 37;
	protected final static double VALOR_HORA = 8;

	// CONSTRUCTORES

	public Profesor(String nombre, String dni, int cantSexenios) {
		super(nombre, dni, cantSexenios);
		setHorasPorSemana(HORAS_SEMANA);
		setValorHora(VALOR_HORA);
	}

}
