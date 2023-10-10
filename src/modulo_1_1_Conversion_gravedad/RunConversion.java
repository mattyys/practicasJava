package modulo_1_1_Conversion_gravedad;

import java.util.Scanner;

public class RunConversion {

	public static void main(String[] args) {
		// se crea la constante para guardar la diferncia de la gravedad en la luna
		final double DIF_GRAVEDAD_LUNA = 0.17;

		// se crea la instancia sc de la clase Scaner para tomar datos por consola
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese peso a Convertir: ");
		// se crea variable peso que guarda los datos por consola para el calulo del
		// peso
		double peso = Double.parseDouble(sc.nextLine());
		sc.close();

		/*
		 * se crea variable que guarda el peso calculado en la luna se multiplica el
		 * peso ingresado por 0.17 guardado en la constante esto da el 17% del peso
		 * ingresado.
		 */
		double pesoEnLuna = peso * DIF_GRAVEDAD_LUNA;

		System.out.println(mensaje(peso, pesoEnLuna));

	}

	// se crea metodo mensaje el cual recibe como parametros el peso ingresado y el
	// peso calculado en la luna
	// devuelve el mensaje con los valores ingresados.
	public static String mensaje(double peso, double pesoEnLuna) {
		StringBuilder builder = new StringBuilder();
		builder.append("Un peso de ");
		builder.append(peso);
		builder.append(" kilos en la Tierra equivalen a ");
		builder.append(pesoEnLuna);
		builder.append(" kilos en la Luna");
		return builder.toString();
	}

}
