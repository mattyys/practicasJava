package modulo_7_17_cartas_comparator;

import java.util.List;

public abstract class AlgoritmoOrdenacion {

	/**
	 * Ordena una lista de cartas pasada por parametro
	 * 
	 * @param listaCartas Lista de cartas que queda ordenada al final del algoritmo
	 */
	public abstract void ordena(List<Carta> listaCartas);

	/**
	 * Gets obtiene el valor numerico de la Carta que se pasa.
	 *
	 * @param Recibe un String con el valor de la Carta
	 * @return El valor numerico de la Carta
	 */
	public static int getValorCarta(String numero) {
		int valor = 0;
		switch (numero) {
			case "AS":
				valor = 1;
				break;
			case "DOS":
				valor = 2;
				break;
			case "TRES":
				valor = 3;
				break;
			case "CUATRO":
				valor = 4;
				break;
			case "CINCO":
				valor = 5;
				break;
			case "SEIS":
				valor = 6;
				break;
			case "SIETE":
				valor = 7;
				break;
			case "SOTA":
				valor = 10;
				break;
			case "CABALLO":
				valor = 11;
				break;
			case "REY":
				valor = 12;
				break;
		}
		return valor;
	}

}
