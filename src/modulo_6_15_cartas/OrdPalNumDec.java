package modulo_6_15_cartas;

import java.util.Collections;
import java.util.List;

/**
 * The Class OrdPalNumDec.
 * 
 * @apiNote Ordena por palo y nuemero de carta
 */
//ordena por palo y umero decremental
public class OrdPalNumDec extends AlgoritmoOrdenacion {

	/**
	 * Ordena.
	 *
	 * @param listaCartas the lista cartas
	 */
	@Override
	public void ordena(List<Carta> listaCartas) {
		Collections.sort(listaCartas, (c1, c2) -> comparadorCarta(c1, c2));
		Collections.sort(listaCartas, (c1, c2) -> c1.getPalo().compareToIgnoreCase(c2.getPalo()));

	}

	/**
	 * Comparador carta. Decreciente.
	 *
	 * @param c1 primer carta a comparar
	 * @param c2 segunda carta a comparar
	 * @return devuelve un valor numerico (1 si c1 es menor, 0 si son iguales y -1
	 *         si c1 es mayor
	 */
	public static int comparadorCarta(Carta c1, Carta c2) {
		// DECREMENTAL
		// comparadaor de cartas usado en el algoritmo de ordenacion
		int result = 0;
		if (getValorCarta(c1.getNumero()) < getValorCarta(c2.getNumero()))
			result = 1;
		if (getValorCarta(c1.getNumero()) > getValorCarta(c2.getNumero()))
			result = -1;
		return result;
	}

}
