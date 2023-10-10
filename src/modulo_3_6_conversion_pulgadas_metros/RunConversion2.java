package modulo_3_6_conversion_pulgadas_metros;

public class RunConversion2 {
	// se inicializan las constantes pra realizar las converciones
	static final double PULGADA_POR_METRO = 39.37;
	static final double METROS_POR_PULGADA = 1 / PULGADA_POR_METRO;

	public static void main(String[] args) {
		// se crea la variable para guardar los metros por pulgadas
		double metrosPorPulgadas;
		// se hace un for para imprimir por pantalla hasta la pulgada 144
		// cada 12 pulgadas se imprime un salto de linea
		for (int i = 1; i <= 144; i++) {
			metrosPorPulgadas = i * METROS_POR_PULGADA;
			System.out.println(i + " Pulgada/s son " + metrosPorPulgadas + " metros");
			if ((i % 12) == 0) {
				System.out.println();
			}
		}

	}
}