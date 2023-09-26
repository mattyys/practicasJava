package ejerciciosVarios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AhorcadoGame {
	public static void main(String[] args) {
		String[] dictionary = { "perro", "gato", "casa", "salchicha", "tomate", "naranja", "java" };
		Scanner sc = new Scanner(System.in);

		// el programa piensa la palabra
		Random generator = new Random();
		int position = generator.nextInt(dictionary.length);
		String computerWord = dictionary[position];
		char[] controlWordArray = computerWord.toCharArray();
		// se crea un array de caracteres con la cantidad de elementos del string
		char[] computerArray = new char[computerWord.length()];
		// se completa cada elemento del array con guinnes '_'
		Arrays.fill(computerArray, '_');

		int tries = 5;
		int aciertos = 0;
		String userWord;
		// el programa inicia el juego
		System.out.println("Adivina la palabra, haz tu intento::");
		boolean userWin = false;
		while (tries > 0 && !userWin) {
			// el usuario introduce su intento(un caracter)
			System.out.println("\nTe quedan " + tries + " intentos");

			// se imprimen los huecos libres
			for (char character : computerArray) {
				System.out.print(character + " ");
			}
			System.out.println("Ingresa tu intento:: ");
			userWord = sc.nextLine();

			// se comprueba el caracter que forma parate de la cadena y si aparece varias
			// veces
			int characterPosition = computerWord.indexOf(userWord);

			// faltra verificar la salida aveces corta antes
			System.out.println("binary=> " + Arrays.binarySearch(computerArray, '_'));

			if (Arrays.binarySearch(computerArray, '_') == -1) {
				userWin = true;
			}
			if (characterPosition == -1) {
				// el caracter no esta en la palabra
				tries--;
			} else {
				// el caracter esta en la palabra
				for (int i = 0; i < controlWordArray.length; i++) {
					if (controlWordArray[i] == userWord.charAt(0)) {
						computerArray[i] = userWord.charAt(0);
						aciertos++;
					}
				}

			}

		}
		System.out.println("------HAS GANADO-------" + "\ncon " + aciertos + " aciertos");
		System.out.print("la palabra es:: ");
		for (char c : computerArray) {
			System.out.print(c);
		}
		// la cadena que el usuario haya adivinado
		sc.close();
	}

}
