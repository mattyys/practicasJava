package ejerciciosVarios;

public class Deberes290923 {

	public static void main(String[] args) {
		// 1 - hacer una calculadora con menu - hecho en modulo de poo

		// 2 - calcular el factorial de un numero solicitado - hecho

		System.out.println(calcularFactorial(6));
		System.out.println(calcularFactorial2(6));

	}

	// recursividad
	public static long calcularFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;// el factorial del 0 y 1 es 1
		} else {
			// llamada recursiva de la misma funcion
			return n * calcularFactorial(n - 1);
		}
	}

	// factorial por for sin recursividada
	public static int calcularFactorial2(int n) {
		int total = 1;
		for (int i = 2; i <= n; i++) {
			total *= i;
		}
		return total;
	}

}
