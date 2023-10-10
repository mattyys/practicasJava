package modulo_3_5_numero_armstrong;

import java.util.Scanner;

public class RunAmstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero entero:: ");
		String numeroIngresado = sc.nextLine();

		// la variable suma guarda la suma de las potencias calculadas
		int suma = 0;
		// guarda la cantidad de cifras
		int cantidadCifras = numeroIngresado.length();
		// se convierte el string en un array de caracteres pasra trabajar
		// individualmente
		char[] caracteres = numeroIngresado.toCharArray();
		for (char e : caracteres) {
			// se utiliza la clase Character para obtener el valor int
			suma += Math.pow(Character.getNumericValue(e), cantidadCifras);
		}
		// hago casting de el numero ingresado para comprobar con el resultado
		int num = Integer.parseInt(numeroIngresado);
		if (num == suma) {
			System.out.println("EL numero ingresado es Armstrong :: " + numeroIngresado);
		} else {
			System.out.println("El numero NO es Armstrong :: " + numeroIngresado);
		}

		// *********************************************************////
		System.out.println("/**************************************************/");
		System.out.print("Ingrese otro numero:: ");
		int numero = Integer.parseInt(sc.nextLine());
		// variable que guarda la suma
		int suma2 = 0;
		// variable temporal que guarda la descomposicion del numero
		int numeroTemporal = numero;
		// se guarda la cantidad de digitos
		int cantDigitos = (int) Math.log10(numero) + 1;
		// variable que guarda el ultimo digito
		int ultimoDigito = 0;
		// se utiliza un bucle while para ir descomponiendo el numero y haciendo los
		// calculos
		while (numeroTemporal > 0) {
			// con el resto se obtiene el ultimo numero
			ultimoDigito = numeroTemporal % 10;
			// se hace la potencia de el ultimo digito elevado a la cantidad de cifras y se
			// guarda en suma2
			suma2 += Math.pow(ultimoDigito, cantDigitos);
			// al dividir entre 10 se puede obtener meiante el odulo en la segunda vuelta el
			// resto que seria la cifra siguiente de derecha a izquierda
			numeroTemporal /= 10;
		}
		if (numero == suma2) {
			System.out.println("El numero es Armstrong:: " + numero);
		} else {
			System.out.println("El numero NO es Armstrong:: " + numero + " != " + suma);
		}
		sc.close();
	}

}
