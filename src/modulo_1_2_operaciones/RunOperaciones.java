package modulo_1_2_operaciones;

import java.util.Scanner;

public class RunOperaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		System.out.println("Ingrese numeros enteros");
		System.out.print("Ingrese numero 1/3: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese numero 2/3: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese numero 3/3: ");
		c = Integer.parseInt(sc.nextLine());

		System.out.print("Operacion 1 -> ");
		System.out.println(operacion1(a, b, c));

		System.out.print("Operacion 2 -> ");
		System.out.println(operacion2(a, b, c));

		System.out.print("Operacion 3 -> ");
		System.out.println(operacion3(a, b, c));

		System.out.print("Operacion 4 -> ");
		System.out.println(operacion4(a, b, c));

		System.out.println("Ingrese numeros decimales");
		System.out.print("Ingrese numero 1/3: ");
		double da = Double.parseDouble(sc.nextLine());
		System.out.print("Ingrese numero 2/3: ");
		double db = Double.parseDouble(sc.nextLine());
		System.out.print("Ingrese numero 3/3: ");
		double dc = Double.parseDouble(sc.nextLine());
		sc.close();

		System.out.print("Operacion 1 decimal -> ");
		System.out.println(operacion1(da, db, dc));

		System.out.print("Operacion 2 decimal -> ");
		System.out.println(operacion2(da, db, dc));

		System.out.print("Operacion 3 decimal -> ");
		System.out.println(operacion3(da, db, dc));

		System.out.print("Operacion 4 decimal -> ");
		System.out.println(operacion4(a, b, c));

	}

	public static int operacion1(int a, int b, int c) {
		return a * b / c;
	}

	public static int operacion2(int a, int b, int c) {
		return (a * c) % b;
	}

	public static int operacion3(int a, int b, int c) {
		return 2 * (a + c - b) / (b * c);

	}

	public static int operacion4(int a, int b, int c) {
		return ((a * c) + (b % a)) / a - c;
	}

	public static double operacion1(double a, double b, double c) {
		return a * b / c;
	}

	public static double operacion2(double a, double b, double c) {
		return (a * c) % b;
	}

	public static double operacion3(double a, double b, double c) {
		return 2 * (a + c - b) / (b * c);
	}

	public static double operacion4(double a, double b, double c) {
		return ((a * c) + (b % a)) / a - c;
	}

}
