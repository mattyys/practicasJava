package modulo_4_7_calcular_cupones;

import java.util.Scanner;

public class CandyCalculator {
	// creo las constantes con los valores para las barras de caramelo y los chicles
	static final int CUPONES_BARRA_CARAMELO = 10;
	static final int CUPONES_CHICLES = 3;

	// funcion que devuelve un array con la cantidad de cupones
	public static int[] candyCalculator(int numCupones) {
		// se crea el array de 3 elementos que gurada la cantidad de cupones
		int[] detalleCupones = new int[3];
		// se crea una variable totalCupones para trabajar con ella y que guarde los
		// cupones que van quedando
		int totalCupones = numCupones;

		// en la primer posicion se guarda la cantidad de cupones delas barras de
		// caramelos se divide el total de cupones entre el valor de los cupones de
		// caramelo
		detalleCupones[0] = totalCupones / CUPONES_BARRA_CARAMELO;

		// se obtiene el resto de la division y se asigna a la variable total cupones
		totalCupones = totalCupones % CUPONES_BARRA_CARAMELO;

		// mismo procedimiento se divide la cantidad de cupones restante entre el valor
		// de los cupones de chicles
		detalleCupones[1] = totalCupones / CUPONES_CHICLES;

		// se obriene el resto de la division anterior y se asigna a la ultima posicion
		// que guarda el total de cupones no utilizados.
		detalleCupones[2] = totalCupones % CUPONES_CHICLES;

		return detalleCupones;
	}

	public static void main(String[] args) {
		// se llama a la funcin para probarla, se utiliza la clase scanner para obtenet
		// valores por consola
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese numero de cupones ganados:");
		int totCupones = Integer.parseInt(sc.nextLine());
		sc.close();
		// se crea un array de cupones que recibe el array que devuelve la funcion
		int[] cupones = candyCalculator(totCupones);
		// como son solo 3 posiciones se imprime de a una mostrando su contenido.
		System.out.println("Cupones totales :: " + totCupones);
		System.out.println("Total cupones para barra de caramelos :: " + cupones[0]);
		System.out.println("Total cupones para chicles :: " + cupones[1]);
		System.out.println("Total cupones restantes :: " + cupones[2]);
	}

}
