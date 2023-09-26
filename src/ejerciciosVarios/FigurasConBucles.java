package ejerciciosVarios;

public class FigurasConBucles {

	public static void main(String[] args) {

		dibujarRombo(5);
		dibujarTriangulo(5);
		dibujarCuadrado(5);

	}

	public static void dibujarTriangulo(int cantidad) {
		for (int i = 1; i <= cantidad; i++) {
			// System.out.println("* * * * *");
			for (int j = 1; j <= cantidad - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void dibujarCuadrado(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			for (int j = 0; j < cantidad; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void dibujarRombo(int cantidad) {
		for (int i = 1; i <= cantidad; i++) {
			// System.out.println("* * * * *");
			for (int j = 1; j <= cantidad - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = cantidad - 1; i >= 1; i--) {
			// System.out.println("* * * * *");
			for (int j = 1; j <= cantidad - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
