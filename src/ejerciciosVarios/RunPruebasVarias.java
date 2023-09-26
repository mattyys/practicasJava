package ejerciciosVarios;

public class RunPruebasVarias {

	public static void main(String[] args) {
		String[] arrayS = new String[3];
		char[] vocales = { 'h', 'o', 'l', 'a', 's' };
		String hola = new String(vocales);
		char[] casa = "hola cabezon".toLowerCase().toCharArray();
		for (int i = 0; i < casa.length; i++) {
			System.out.println(casa[i]);
		}
		int[] arrayI = new int[3];
		boolean[] arrayB = new boolean[3];
		arrayS[0] = "hola cabezon";
		arrayB[1] = true;
		arrayI[2] = 125;
		for (int i = 0; i < 3; i++) {
			System.out.println(arrayS[i]);
			System.out.println(arrayI[i]);
			System.out.println(arrayB[i]);

		}
		System.out.println(hola);

		// contar vocales sin acentuaion
		String texto = "La grán puta Madre hijos DE puTa CáCÁ";
		char[] textChar = texto.toLowerCase().toCharArray();
		int count = 0;
		for (char x : textChar) {
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				count++;
			}
		}
		System.out.println("cantidad de vocales:: " + count);
	}

}
