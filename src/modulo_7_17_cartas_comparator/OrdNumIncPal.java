package modulo_7_17_cartas_comparator;

import java.util.Collections;
import java.util.Comparator;
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

		Collections.sort(listaCartas, numeroPalo);
	}

	/**
	 * Funcion Ordena Por numero incremetal y luego por Palo
	 * 
	 * @param Recibe por parametros 2 objetos carta y los compara funcion anonima
	 *               asociada a la interfaz comparator
	 */
	Comparator<Carta> numeroPalo = (c1, c2) -> {

		// chequea que NO sean iguales las cartas para comparar su valor e ir ordenando
		// si los numeros son iguales ordena por palo
		if (AlgoritmoOrdenacion.getValorCarta(c1.getNumero()) != AlgoritmoOrdenacion.getValorCarta(c2.getNumero())) {
			return AlgoritmoOrdenacion.getValorCarta(c1.getNumero())
			        - AlgoritmoOrdenacion.getValorCarta(c2.getNumero());
		} else {
			// luego de ordenar por numero chequa el palo y lo ordena alfabeticamente.
			return c1.compareTo(c2);
		}
	};

}
