package modulo_7_17_cartas_comparator;

import java.util.Collections;
import java.util.List;

//ordena por palo y numero incremental
public class OrdPalNumInc extends AlgoritmoOrdenacion {

	@Override
	public void ordena(List<Carta> listaCartas) {
		Collections.sort(listaCartas);
	}

}
