package ejerciciosVarios;

import java.util.Scanner;

public class ConjeturaCollatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		// se hace el bucle para que se ingrese un numero mayor a 0 y no entre en un
		// bucle infinito
		do {
			System.out.print("Ingrese un numero para comprobar teoria de Collatz: ");
			num = Integer.parseInt(sc.nextLine());
		} while (num <= 0);

		sc.close();
		getCollatz(num);

	}

	static void getCollatz(int num) {
		int variable = num;
		String msj = "";
		while (variable != 1) {
			if (variable % 2 == 0) {
				msj = "::" + variable + " es par se divide entre 2 -> ";
				variable = variable / 2;
				System.out.println(msj + variable);
			} else {
				msj = "::" + variable + " es impar se multiplica por 3 y se suma 1 -> ";
				variable = (variable * 3) + 1;
				System.out.println(msj + variable);
			}
		}
		if (variable == 1) {
			System.out.println("Se cumple teoria de Collatz");
		}

	}

}
