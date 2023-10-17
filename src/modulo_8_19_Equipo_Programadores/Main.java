package modulo_8_19_Equipo_Programadores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EquipoProgramadores equipoP1 = new EquipoProgramadores();
		boolean exit = false;
		Scanner entrada = new Scanner(System.in);

		do {
			try {
				System.out.print("Ingrese Nombre del Equipo: ");
				String nombreEquipo = entrada.nextLine();
				equipoP1.setNombreEquipo(nombreEquipo);
				System.out.print("Ingrese Universidad: ");
				String nombreUniversidad = entrada.nextLine();
				equipoP1.setUniversidad(nombreUniversidad);
				System.out.print("Ingrese un Lenguaje de programacion: ");
				String lenguaje = entrada.nextLine();
				equipoP1.setLenguaje(lenguaje);

				equipoP1.addProgramador(menuProgramador());

				System.out.println("Para salir presione S");
				String check = entrada.next();
				if (check.equalsIgnoreCase("s")) {
					exit = true;
				}

			} catch (MinimoIntegreantesNoAlcanzadoException e) {
				System.out.println(e.getMessage());
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}

		} while (!exit);
		System.out.println(equipoP1.imprimirDatosEquipo());

	}

	public static Programador menuProgramador() {

		Programador programador = new Programador();
		Scanner entrada = new Scanner(System.in);
		boolean exit = false;
		do {
			try {
				System.out.println("Ingrese nombre Programador: ");
				String nombre = entrada.nextLine();
				programador.setNombre(nombre);
				System.out.println("Ingrese apellido Programador: ");
				String apellido = entrada.nextLine();
				programador.setApellido(apellido);
				System.out.println("Se agrego correctamente - Para salir presione S");
				String check = entrada.next();
				if (check.equalsIgnoreCase("s")) {
					exit = true;
				}
			} catch (MaxLengthStringException e) {
				System.out.println(e.getMessage());
			} catch (NumberInStringException e) {
				System.out.println(e.getMessage());
			}

		} while (!exit);
		// entrada.close();

		return programador;

	}

}
