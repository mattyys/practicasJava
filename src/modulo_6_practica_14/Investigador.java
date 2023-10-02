package modulo_6_practica_14;

public class Investigador extends PDI {

	// ATRIBUTOS
	protected final static int HORAS_SEMANA = 35;
	protected final static double VALOR_HORA = 7;

	// CONSTRUCTORES
	public Investigador(String nombre, String dni) {
		super(nombre, dni);
		setHorasPorSemana(HORAS_SEMANA);
		setValorHora(VALOR_HORA);
	}

}
