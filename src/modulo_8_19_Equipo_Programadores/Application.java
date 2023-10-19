package modulo_8_19_Equipo_Programadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	Scanner entrada;

	public Application() {
		super();
		entrada = new Scanner(System.in);
	}

	/**
	 * Run app.
	 * 
	 * <pre>
	 * Encargada de ejecutar el menu de quipos de
	 * programadores invocando los demas metodos
	 * para ingresar los datos correspondientes
	 * </pre>
	 */
	public void runApp() {
		boolean exit = false;

		EquipoProgramadores equipoProg = menuEquipo();

		do {
			try {

				if (!equipoProg.isMinComplete()) {
					System.out.println("Ingrese un programador - Minimo 2 integrantes:");
					equipoProg.addProgramador(menuProgramador());
				} else {
					System.out.println("Desea ingresar otro integrante?: ");
					System.out.println("1. Igresar");
					System.out.println("2. Listar Equipo");
					int option = Integer.parseInt(entrada.nextLine());
					switch (option) {
						case 1:
							equipoProg.addProgramador(menuProgramador());
							break;
						case 2:
							System.out.println(equipoProg.imprimirDatosEquipo());
							exit = true;
					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Ingrese un numero " + e.getMessage());
			} catch (MaxLengthStringException e) {
				System.out.println(e.getMessage());
			} catch (NumberInStringException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("Ingrese una opcion valida: " + e.getMessage());
			}

		} while (!exit);
		entrada.close();
	}

	/**
	 * Menu equipo.
	 * 
	 * <pre>
	 * Se abre menu para el ingreso de datosa del equipo de
	 * Programadores
	 * </pre>
	 * 
	 * @return the equipo programadores
	 * @throws IsBlankFieldException the Is blak field exception si se pasa un campo
	 *                               vacio como dato
	 * @throws Exception             the exception captura alguna excepcion no
	 *                               contemplada
	 */
	private EquipoProgramadores menuEquipo() {
		boolean exit = false;
		String nombre, nombUniv, lenguaje;
		EquipoProgramadores equipo = new EquipoProgramadores();

		do {
			try {
				System.out.print("Ingrese nombre del Equipo: ");
				nombre = entrada.nextLine();
				System.out.print("Ingrese mombre Universidad: ");
				nombUniv = entrada.nextLine();
				System.out.print("Ingrese Lenguaje programacion: ");
				lenguaje = entrada.nextLine();

				if (nombre.isBlank() || nombUniv.isBlank() || lenguaje.isBlank())// se chequea que no hayan campos
				                                                                 // vacios
					throw new IsBlankFieldException("Se ingreso un campo vacio");
				else {
					equipo.setNombreEquipo(nombre.trim());
					equipo.setUniversidad(nombUniv.trim());
					equipo.setLenguaje(lenguaje.trim());
					exit = true;
				}
			} catch (IsBlankFieldException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!exit);

		return equipo;

	}

	/**
	 * Menu programador.
	 * 
	 * <pre>
	 * Se abre un menu para el ingreso de los datos del
	 * porogramador y devuelve el objeto creado
	 * </pre>
	 * 
	 * @return Un Objeto programador
	 * @throws MaxLengthStringException the max length string exception maximo 20
	 *                                  caracteres
	 * @throws NumberInStringException  the number in string exception no puede
	 *                                  contener numeros
	 */
	Programador menuProgramador() throws MaxLengthStringException, NumberInStringException {
		Programador programador = new Programador();
		boolean exit = false;

		do {
			try {
				System.out.print("Ingrese nombre Programador: ");
				String nombre = entrada.nextLine();
				System.out.print("Ingrese apellido Programador: ");
				String apellido = entrada.nextLine();

				if (programador.checkLengthAndNumber(nombre) && programador.checkLengthAndNumber(apellido)
				        && !nombre.isBlank() && !apellido.isBlank()) {// se chequea que no contenga numeros ni que
				                                                      // este en blanco
					programador.setNombre(nombre.trim());
					programador.setApellido(apellido.trim());
				} else
					throw new IsBlankFieldException("Se ingreso un campo vacio");

				if (programador.getNombre() != null && programador.getApellido() != null)
					exit = true;

			} catch (IsBlankFieldException e) {
				System.out.println(e.getMessage());
			} catch (MaxLengthStringException e) {
				System.out.println(e.getMessage());
			} catch (NumberInStringException e) {
				System.out.println(e.getMessage());
			}
		} while (!exit);

		return programador;

	}

}
