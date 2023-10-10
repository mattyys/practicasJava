package modulo_7_17_cartas_comparator;

public class Main {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		Mazo mazo = baraja.getMazo();
		System.out.println("MAZO abarajado");
		System.out.println("-----------------------");
		for (int i = 0; i < mazo.numCartas(); i++) {
			System.out.println(mazo.getCarta(i));
		}
		mazo.ordena();
	}

}
