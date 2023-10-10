package modulo_6_15_cartas;

import java.util.Collections;
import java.util.List;
//ordena por numero incremental y por palo

public class OrdNumIncPal extends AlgoritmoOrdenacion {

	/**
	 * Ordena por numero incremental y luego por palo de la carta.
	 *
	 * @param listaCartas lista de cartas
	 */
	@Override
	public void ordena(List<Carta> listaCartas) {

		Collections.sort(listaCartas, (c1, c2) -> c1.getPalo().compareToIgnoreCase(c2.getPalo()));
		Collections.sort(listaCartas, (c1, c2) -> comparadorCarta(c1, c2));

	}

	/**
	 * ComparadorCarta. Incremental.
	 *
	 * @param c1 primer carta a comparar
	 * @param c2 segunda carta a comparar
	 * @return devuelve un valor numerico (-1 si c1 es menor, 0 si son iguales y 1
	 *         si c1 es mayor
	 */
	public static int comparadorCarta(Carta c1, Carta c2) {
		// comparadaor de cartas usado en el algoritmo de ordenacion
		int result = 0;
		if (getValorCarta(c1.getNumero()) < getValorCarta(c2.getNumero()))
			result = -1;
		if (getValorCarta(c1.getNumero()) > getValorCarta(c2.getNumero()))
			result = 1;
		return result;

	}

}
