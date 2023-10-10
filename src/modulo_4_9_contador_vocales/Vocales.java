package modulo_4_9_contador_vocales;

import java.util.Scanner;

public class Vocales {

	public static int contarVocales(String texto) {
		// la funcion recibe una cadena de texto y se la convierte en un array de
		// caracteres convertido en minuscula para chequear todas las vocales menos las
		// acentuadas
		char[] textChar = texto.toLowerCase().toCharArray();
		// se inicializa el contador de vocales en 0
		int count = 0;
		// se utiliza un for each y por cada elemento comprueba si es una vocal, en caso
		// de true suma 1 al contador
		for (char x : textChar) {
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un texto para contar sus vocales:: ");
		String texto = sc.nextLine();
		sc.close();
		System.out.println("La cantidad de vocales es:: " + contarVocales(texto));
	}

}
