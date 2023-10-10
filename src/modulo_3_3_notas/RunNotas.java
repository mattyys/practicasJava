package modulo_3_3_notas;

import java.util.Scanner;

public class RunNotas {

	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de Promedios de Notas");
		// se crean las variables que reciben la nota para cada materia
		double matematicas, fisica, quimica, lenguaje, historia, promedio;

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una nota [0 a 10]");
		System.out.print("Matemáticas: ");
		matematicas = Double.parseDouble(sc.nextLine());
		System.out.print("Física: ");
		fisica = Double.parseDouble(sc.nextLine());
		System.out.print("Química: ");
		quimica = Double.parseDouble(sc.nextLine());
		System.out.print("Lenguaje: ");
		lenguaje = Double.parseDouble(sc.nextLine());
		System.out.print("Historia: ");
		historia = Double.parseDouble(sc.nextLine());
		sc.close();

		promedio = (matematicas + fisica + quimica + lenguaje + historia) / 5;

		// comprobacion del promedio de notas
		if (promedio >= 0 && promedio <= 3) {
			System.out.println("Muy insuficiente: " + promedio);
		} else if (promedio > 3 && promedio <= 5) {
			System.out.println("Insuficiente: " + promedio);
		} else if (promedio > 5 && promedio <= 6) {
			System.out.println("Suficiente: " + promedio);
		} else if (promedio > 6 && promedio <= 7) {
			System.out.println("Bien: " + promedio);
		} else if (promedio > 7 && promedio <= 9) {
			System.out.println("Notable: " + promedio);
		} else if (promedio > 9 && promedio <= 10) {
			System.out.println("Sobresaliente: " + promedio);
		} else {
			System.out.println("Alguna nota ingresada esta fuera del rango de 0 a 10 :: " + promedio);
		}
	}

}
