package ejerciciosVarios;

import java.util.Scanner;

public class RunIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int peso;
		double altura, imc;

		System.out.print("Ingrese su peso: ");
		peso = Integer.parseInt(sc.nextLine());

		System.out.print("Ingrese su altura: ");
		altura = Double.parseDouble(sc.nextLine());
		sc.close();

		imc = peso / (Math.pow(altura, 2));

		System.out.println("Indice de Masa Corporal es = " + imc);
	}

}
