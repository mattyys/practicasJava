package ejerciciosVarios;

public class OrdenacionPrueba {

	public static void main(String[] args) {
		int arreglo[] = { 7, 4, 2, 6, 1125, 85, 95, 665, 1, 0, 9, 10, 6658, 45, 1254, 1225, 12358, 541, 87443, 6514, 65,
		        88, 89, 90, 105, 100, 102, 106, 104, 103, 99 };

		for (int k = 0; k < arreglo.length; k++) {
			System.out.print(arreglo[k] + " ");
		}

		ordenarV1(arreglo);

	}

	public static void ordenarV1(int[] arreglo) {
		int size = arreglo.length, posFinal = arreglo.length - 1;
		int aux;
		int posMin;
		int posMax;
		long t1 = System.currentTimeMillis();

		for (int i = 0; i < size / 2; i++) {
			posMin = i;
			posMax = i;

			for (int j = i; j <= posFinal; j++) {
				if (arreglo[j] > arreglo[posMax])
					posMax = j;
				if (arreglo[j] < arreglo[posMin])
					posMin = j;

			}

			aux = arreglo[posMin];
			arreglo[posMin] = arreglo[i];
			arreglo[i] = aux;

			if (posMax == i)
				posMax = posMin;

			aux = arreglo[posFinal];
			arreglo[posFinal] = arreglo[posMax];
			arreglo[posMax] = aux;
			posFinal--;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo estimado" + (t2 - t1));

		for (int k = 0; k < size; k++) {
			System.out.print(arreglo[k] + " ");
		}

	}

	public static void bySortInsertion(int[] arrayInt) {
		int size = arrayInt.length;
		int aux;
		long t1 = System.currentTimeMillis();
		for (int i = 1; i < size; i++) {
			aux = arrayInt[i];

			for (int j = i - 1; j >= 0 && arrayInt[j] > aux; j--) {
				arrayInt[j + 1] = arrayInt[j];
				arrayInt[j] = aux;

			}
			// System.out.println();
			// for (int v:arrayInt) System.out.print(v);
		}

		long t2 = System.currentTimeMillis();
		for (int v : arrayInt)
			System.out.print(v);
		System.out.println("\ntiempo sortInsertion: " + (t2 - t1) + " ms");

	}

	public static void bySortSelection(int[] arrayInt) {
		int size = arrayInt.length;
		int aux;
		int posMin;
		long t1 = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			posMin = i;
			for (int j = i + 1; j < size; j++) {
				if (arrayInt[posMin] > arrayInt[j])
					posMin = j;
			}
			aux = arrayInt[i];
			arrayInt[i] = arrayInt[posMin];
			arrayInt[posMin] = aux;
			// System.out.println();
			// for (int v:arrayInt) System.out.print(v);
		}

		long t2 = System.currentTimeMillis();
		for (int v : arrayInt)
			System.out.print(v);
		System.out.println("tiempo sortSelection: " + (t2 - t1) + " ms");
		// System.out.println("array final");

	}

	public static void byBubbleSortM(int[] arrayInt) {
		int size = arrayInt.length;
		int aux, rounds = 0;
		boolean ordenado = false;
		long t1 = System.currentTimeMillis();
		while (!ordenado) {

			ordenado = true;
			for (int i = 0; i < size - 1 - rounds; i++) {
				if (arrayInt[i] > arrayInt[i + 1]) {// si el valor de la izquierda es mayor entra

					aux = arrayInt[i + 1];// se pasa el siguiente valor a aux para comparar
					arrayInt[i + 1] = arrayInt[i];// se cambia el valor dede la izquierda a la derecha
					arrayInt[i] = aux; // se pasa el valor que estaba en la derecha a la izquierda

					ordenado = false;
				}

			}
			rounds++;
			// System.out.println();
			// for (int i : arrayInt) System.out.print(i);

		}
		System.out.println();

		long t2 = System.currentTimeMillis();
		for (int i : arrayInt)
			System.out.print(i);
		System.out.println("tiempo bubbleSort: " + (t2 - t1) + " ms");
	}

}
