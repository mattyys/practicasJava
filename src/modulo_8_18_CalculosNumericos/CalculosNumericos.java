/*
 * 
 */
package modulo_8_18_CalculosNumericos;

import java.util.Scanner;

public class CalculosNumericos {

	/**
	 * The main method Para la prueba de los metodos y los try y catch.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Double numero;
		boolean exit = true;

		do {
			try {
				System.out.print("Ingrese un numero para calcular el logaritmo neperiano: ");
				numero = Double.parseDouble(entrada.nextLine());
				System.out.println("Logaritmo Neperiano de " + numero + " es : " + calcularNeperiano(numero));

				System.out.print("Ingrese un numero para calcular Raiz Cuadrada: ");
				numero = Double.parseDouble(entrada.nextLine());
				System.out.println("Raiz Cuadrada de " + numero + " es : " + raizCuadrada(numero));
				System.out.println("Para continuar presione ENTER ....." + "\nPara salir presione S");
				String check = entrada.nextLine();
				if (check.equalsIgnoreCase("s")) {
					exit = false;
					System.out.println("Chauu!!");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Ingrese un numero::==> " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error generico:: " + e.getMessage());
			}

		} while (exit);
		entrada.close();

	}

	/**
	 * Calcular neperiano.
	 *
	 * @param numero Recibe un numero positivo para calcular el logaritmo neperiano
	 *               en caso de ser negativo lanza una excepcion
	 * @return El resultado del logaritmo Neperiano pasado por parametro
	 */
	public static double calcularNeperiano(double numero) {
		if (numero < 0)
			throw new ArithmeticException("El numero ingresado debe ser positivo");
		return Math.log(numero);
	}

	/**
	 * Raiz cuadrada.
	 *
	 * @param numero Recibe un numero para Calcular la Raiz Cuadrada en caso de ser
	 *               negativo lanza una excepcion
	 * @return La raiz cuadrada de el numero pasado por parametro
	 */
	public static double raizCuadrada(double numero) {
		if (numero < 0)
			throw new ArithmeticException("El numero ingresado debe ser positivo");
		return Math.sqrt(numero);
	}

}
