package modulo_7_17_cartas_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mazo {

	List<Carta> cartas;
	private AlgoritmoOrdenacion algoritmo;

	// CONSTRUCTORES
	public Mazo() {
		cartas = new ArrayList<>();
	}

	// METODOS
	public void setAlgoritmo(AlgoritmoOrdenacion algoritmo) {
		algoritmo.ordena(cartas);
	}

	public void ordena() {
		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Elije una opcion::");
			System.out
			        .println("1.Ordena el mazo por PALO y luego por numero incremental \nOrden Natural => Comparable.");
			System.out.println(
			        "2.Ordena el mazo por Numero incremantal y luego por palo \nOrden modificado => Comparator");
			System.out.println("0.Salir::");
			int choice = Math.abs(Integer.parseInt(entrada.nextLine()));
			switch (choice) {
				case 0:
					salir = true;
					break;
				case 1:
				case 2:
					optionMenu(choice);
					break;
				default:
					System.out.println("Presione ENTER para contiuar....");
					entrada.nextLine();

			}
		} while (!salir);
		entrada.close();
	}

	/**
	 * Devuelve la carta de una posicion dada
	 * 
	 * @param posicion La posicion de la carta
	 * @return La carta de dicha posicion
	 * @exception IllegalArgumentException si la posicion no es valida en la lista
	 */
	public Carta getCarta(int posicion) {
		return (Carta) cartas.get(posicion);
	}

	/**
	 * Aniade una carta en el mazo en la posicion dada. Las cartas que estan despues
	 * de la posicion dada avanzan a una posicion
	 * 
	 * @param posicion Posicion a aniadir
	 * @param carta    Carta a aniadir
	 * @exception IllegalArgumentException si la posicion no es valida en la lista
	 */
	public void insertarCarta(int posicion, Carta carta) {
		List<Carta> aux = new ArrayList<>();

		// extraemos las cartas desde la posicion dada a un array auxiliar
		for (int i = cartas.size() - 1; i >= posicion; i--) {
			aux.add((Carta) cartas.remove(i));
		}

		// Agregamos la carta pasada por parametro
		cartas.add(carta);

		// se vuelve a agregar las cartas extraidas
		for (int i = aux.size() - 1; i >= 0; i--) {
			cartas.add(aux.get(i));
		}
	}

	/**
	 * Extrae la carta de la posición dada, las demás cartas se corren una posición
	 *
	 * @param posicion Posición de extracción
	 * @return Carta que estaba en dicha posición
	 * @exception IllegalArgumentException si la posición no es válida en la lista
	 */
	public Carta extraerCarta(int posicion) {
		return (Carta) cartas.remove(posicion);
	}

	/**
	 * Devuelve la carta de la cima del mazo
	 *
	 * @return La carta en la cima del mazo
	 */
	public Carta extraerCarta() {
		return (Carta) cartas.remove(cartas.size() - 1);
	}

	/**
	 * Añade una carta al final del mazo
	 *
	 * @param carta Carta a añadir
	 */
	public void anadirCarta(Carta carta) {
		cartas.add(carta);
	}

	/**
	 * Devuelve el número de cartas del mazo
	 *
	 * @return número de cartas
	 */
	public int numCartas() {
		return cartas.size();
	}

	public void barajar() {
		Collections.shuffle(cartas);
	}

	@Override
	public String toString() {
		return "" + cartas;
	}

	/**
	 * Option menu Muestra el Menu de opciones para seleccionar el algoritmo de
	 * Ordenacion.
	 *
	 * @param choice Recibe la opcion selecionada
	 */
	private void optionMenu(int choice) {
		switch (choice) {
			case 1:
				algoritmo = new OrdPalNumInc();
				setAlgoritmo(algoritmo);
				System.out.println("1.Orden Natural => Comparable.");
				System.out.println("-----------------------------------");
				for (int i = 0; i < numCartas(); i++) {
					System.out.println(getCarta(i));
				}
				System.out.println("-----------------------------------");
				break;
			case 2:
				algoritmo = new OrdNumIncPal();
				setAlgoritmo(algoritmo);
				System.out.println("2.Orden modificado => Comparator.");
				System.out.println("-----------------------------------");
				for (int i = 0; i < numCartas(); i++) {
					System.out.println(getCarta(i));
				}
				System.out.println("-----------------------------------");
				break;
		}
	}

}
