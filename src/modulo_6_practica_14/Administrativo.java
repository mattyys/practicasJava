package modulo_6_practica_14;

public class Administrativo extends PAS {
	// ATRIBUTOS
	protected final static int HORAS_SEMANA = 37;
	protected final static double VALOR_HORA = 7.5;

	// CONSTRUCTORES

	public Administrativo(String nombre, String dni, int cantHorasExtras, int cantSexenios) {
		super(nombre, dni, cantHorasExtras, cantSexenios);
		setHorasPorSemana(HORAS_SEMANA);
		setValorHora(VALOR_HORA);

	}

}
