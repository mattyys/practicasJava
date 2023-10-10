package modulo_6_15_cartas;

import java.util.Collections;
import java.util.List;

//ordena por palo y numero incremental
public class OrdPalNumInc extends AlgoritmoOrdenacion {

	@Override
	public void ordena(List<Carta> listaCartas) {
		// Algoritmo de ordenacion
		// busque informacion como podia hacer la ordenacion de List y encontre varias
		// soluciones, me gusto esta de utilizar funciones anonimas o lamdas
		// se que mas adelante se van a usar y ya quise ir probando, la funcion recibe 2
		// parametros y devuelve la accion que realiza con ellos

		// sort, recibe la lista y como segundo parametro la funcion lambda que
		// interactua con la lista y va devloviendo la comparacion de los elementos que
		// va iterando y sort los ordena
		// todo dependiendo de como se quiera que devuelva la funcion
		// comparadorCarta(incrementa o decremental)
		Collections.sort(listaCartas, (c1, c2) -> comparadorCarta(c1, c2));
		// en esta se aplica por string y devuelve el orden alfabetico, lo hace de
		// manera binaria a los string
		Collections.sort(listaCartas, (c1, c2) -> c1.getPalo().compareToIgnoreCase(c2.getPalo()));
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
		// incremental
		// comparador de cartas usadao en el algoritmo de ordenacion
		int result = 0;
		if (getValorCarta(c1.getNumero()) < getValorCarta(c2.getNumero()))
			result = -1;
		if (getValorCarta(c1.getNumero()) > getValorCarta(c2.getNumero()))
			result = 1;
		return result;
	}

}
