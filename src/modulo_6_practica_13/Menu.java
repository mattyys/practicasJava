package modulo_6_practica_13;

import java.util.Scanner;

public class Menu {
	// ATRIBUTOS
	private CuentaBancaria cajaAhorro;
	private CuentaBancaria cuentaCorriente;
	private Scanner entrada;
	private boolean exit = false;

	// CONSTRUCTOR
	public Menu() {
		entrada = new Scanner(System.in);
	}

	// LANZADOIR DEL MENU
	public void launch() {
		while (!exit) {
			showMenu();
		}

	}

	public void showMenu() {
		Scanner entrada = new Scanner(System.in);
		int choice;

		System.out.println("BIENVENISO A TU B@NCO");
		System.out.println("Ingresa tu opcion::");
		System.out.println("1-Caja de Ahorro.");
		System.out.println("2-Cuenta Corriente.");
		System.out.println("0-SALIR::");
		choice = Integer.parseInt(entrada.nextLine());

		switch (choice) {
			case 1:
				menuCajaAhorro();
				break;
			case 2:
				// menuCuentaCorriente();
				break;
			case 0:
				System.out.println("Gracias por utilizar nuestros servicios");
				exit = true;
		}

	}

	public void menuCajaAhorro() {

		float saldo = 0;
		float tasaAnual = 0;

		if (cajaAhorro == null) {
			System.out.println("Debe abrir una nueva cuenta");
			System.out.println("Recuerde... con saldo menor a 100 la cuenta queda inactiva");
			System.out.println("Ingrese un saldo Inicial");
			saldo = Float.parseFloat(entrada.nextLine());
		}

	}

	private void opcionesCuentas() {
		System.out.println("Ingrese una Opcion::");
		System.out.println("1.Igresar dinero a cuenta.");
		System.out.println("2.Retiro de dinero.");
		System.out.println("3.Calcular interes mensual.");
		System.out.println("4.Extracto mensual.");
		System.out.println("5.Imprimir datos cuenta.");

	}

	private void enterToContinue() {
		System.out.println("Presion ENTER para continuar . . .");
		entrada.nextLine();
	}

}
