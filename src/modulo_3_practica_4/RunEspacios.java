package modulo_3_practica_4;

import java.util.Scanner;

public class RunEspacios {

	public static void main(String[] args) throws java.io.IOException {
		// contador de espacios
		int count = 0;
		// variable que guarda el texto recibido
		String checkText;
		// variable para salir del bucle do
		boolean exit = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("El sistema contara los espacios ingresados. \nIngresando [ . ] sale del programa");

		do {
			System.out.println("Ingrese un texto: ");
			checkText = sc.nextLine();
			// se chequea el texto ingresado si es un caracter o una cadena de texto
			if (checkText.length() > 1) {
				// si es cadena de texto se convierte en array de carcteres para comprobar cada
				// caracter
				char[] caracteres = checkText.toCharArray();
				for (char a : caracteres) {
					if (a == ' ') {
						// si se encuentra un espacio se suma el contador
						count++;
					} else if (a == '.') {
						// si encuentra un punto sale del for y la variable exit en false para salir del
						// do
						exit = false;
						break;
					}
				}
			} else if (checkText.equals(" ")) {
				// si se ingresa un solo caracter se comprueba si es un espacio o un punto
				count++;
			} else if (checkText.equals(".")) {
				exit = false;
			}
		} while (exit);
		sc.close();
		System.out.println("Se contaron " + count + " espacios antes de ingresar el punto.");

	}

}
