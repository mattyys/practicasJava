package ejerciciosVarios;

import java.util.Scanner;

public class RunCantDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		int numero = sc.nextInt();
		sc.close();

		System.out.println("Cantidad de digitos: " + (numero + "").length());

	}

}
