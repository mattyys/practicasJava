package modulo_4_practica_8;

import java.util.Arrays;

/*
 * Crear un programa que, dado un array de números enteros, determine cuales son
 * sus elementos que se encuentran duplicados. Por ejemplo: int [] arrayDePrueba
 * = {1, 2, 3, 3, 9, 8, 7, 4, 6, 7, 0, 4, 5};
 */

public class ElementosDuplicados {

	public static void main(String[] args) {
		// se delara el array de numero para encontrar sus duplicados
		int[] arrayDePrueba = { 1, 2, 3, 3, 9, 8, 7, 4, 6, 7, 0, 4, 5, 8, 8, 8 };

		// se inicializa una valriable de control con un valor distinto para la
		// verificacion de if y que luego guarde el elemento y lo chequee para
		// que no se repita su impresion por pantalla
		int verifica = arrayDePrueba[0] - 1;

		String mensaje = "Estan duplicados los elementos :: ";
		System.out.println(mensaje);
		// utilizo 2 for para recorrer, el segundo for recorre todo el array por cada
		// elemento que va reccorriendo el primer for
		for (int i = 0; i < arrayDePrueba.length; i++) {
			for (int j = i + 1; j < arrayDePrueba.length; j++) {
				// realizo la comparacion y la verificacion para que no imprima los numeros
				// repetidos
				if (arrayDePrueba[i] == arrayDePrueba[j] && verifica != arrayDePrueba[i]) {
					System.out.print(arrayDePrueba[j] + " ");
					verifica = arrayDePrueba[i];
				}
			}
		}

		/*----------------------------------------------*/

		// se ordena array para verificar, se utiliza la clase Arrays
		// al ordenar el array no me imprime los numeros que se repiten mas de 2 veces
		Arrays.sort(arrayDePrueba);
		// se inicializa una valriable de control con un valor distinto para la
		// verificacion de if y que luego guarde el elemento y lo chequee para
		// que no se repita su impresion por pantalla
		int control = arrayDePrueba[0] - 1;

		mensaje += "\n*----Array Ordenado----*";
		System.out.println("\n" + mensaje);
		// se inicializa la variable de iteracion en 1 para que recorra y compare a
		// partir de el segundo elemento
		for (int i = 1; i < arrayDePrueba.length; i++) {
			// chequeo que el segunbdo elemento sea igaul al primero y que la variable de
			// control sea distinta del segundo elemento
			if (arrayDePrueba[i] == arrayDePrueba[i - 1] && control != arrayDePrueba[i]) {
				System.out.print(arrayDePrueba[i] + " ");
				control = arrayDePrueba[i];
			}

		}

	}

}
