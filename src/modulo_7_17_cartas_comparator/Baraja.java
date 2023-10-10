package modulo_7_17_cartas_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

	public static final String[] numeros = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "SOTA", "CABALLO",
	        "REY" };
	public static final String[] palos = { "ESPADAS", "COPAS", "BASTOS", "OROS" };
	private List<Carta> cartas = new ArrayList<Carta>();

	// CONSTRUCTOR
	public Baraja() {
		for (String palo : palos) {
			for (String numero : numeros) {
				cartas.add(new Carta(numero, palo));
			}
		}
	}

	// METODOS
	public Carta getCarta(int posicion) {
		return (Carta) cartas.get(posicion);
	}

	public Mazo getMazo() {
		List<Carta> cartasAux = cartas;
		Collections.shuffle(cartasAux);
		Mazo mazo = new Mazo();
		for (Object carta : cartasAux) {
			mazo.anadirCarta((Carta) carta);
		}
		return mazo;
	}

	public void listarBarajas() {
		for (Carta carta : cartas) {
			System.out.println(carta.toString());
		}
	}

}
