package modulo_7_17_cartas_comparator;

public class Carta implements Comparable<Carta> {
	// ATRIBUTOS
	private final String numero;
	private final String palo;

	// CONSTRUCTORES
	public Carta(String numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	// GETTERS Y SETTERS
	public String getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Carta other = (Carta) obj;
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		if (palo == null) {
			if (other.palo != null) {
				return false;
			}
		} else if (!palo.equals(other.palo)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return numero + " " + palo;
	}

	/**
	 * Compare to Compara las cartas por palo y luegop por numero incremental.
	 *
	 * @param carta recibe un objeto carta para comparar con el actual
	 * @return devuelve un valor negativo o positivo segun si es menor o mayor
	 */
	@Override
	public int compareTo(Carta carta) {
		if (this.palo.compareTo(carta.palo) == 0) {// si el palo es igual pasa a ordenar por numero
			return Integer.compare(AlgoritmoOrdenacion.getValorCarta(this.numero),
			        AlgoritmoOrdenacion.getValorCarta(carta.numero));

		} else {// primero ordena por palo
			return this.palo.compareTo(carta.palo);
		}
	}

}
