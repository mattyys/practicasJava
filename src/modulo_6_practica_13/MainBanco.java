package modulo_6_practica_13;

/*
 * Realizar un método main que implemente un objeto Cuenta de ahorros y llame a
 * los métodos correspondientes
 */
public class MainBanco {

	public static void main(String[] args) {
		pruebaCuentaAhorro();
		pruebaCuentaCorriente();
	}

	public static void pruebaCuentaAhorro() {
		CuentaBancaria cuentaAhorro = new CuentaAhorro(1000F, 12f);

		cuentaAhorro.ingresoACuenta(1000f);
		cuentaAhorro.retiroDeCuenta(150f);
		System.out.println(cuentaAhorro.imprimirDatos());
		cuentaAhorro.retiroDeCuenta(150f);
		System.out.println(cuentaAhorro.imprimirDatos());
		cuentaAhorro.ingresoACuenta(800f);
		cuentaAhorro.retiroDeCuenta(120f);
		cuentaAhorro.ingresoACuenta(100f);
		cuentaAhorro.retiroDeCuenta(250f);
		cuentaAhorro.retiroDeCuenta(100f);
		cuentaAhorro.retiroDeCuenta(300f);
		cuentaAhorro.calcularInteresMensual();
		System.out.println(cuentaAhorro.imprimirDatos());
		cuentaAhorro.extractoMensual();
		System.out.println(cuentaAhorro.imprimirDatos());
		cuentaAhorro.retiroDeCuenta(1800f);
		System.out.println(cuentaAhorro.imprimirDatos());
		cuentaAhorro.retiroDeCuenta(180f);
		System.out.println(cuentaAhorro.imprimirDatos());
		cuentaAhorro.ingresoACuenta(150f);
		System.out.println(cuentaAhorro.imprimirDatos());
	}

	public static void pruebaCuentaCorriente() {
		CuentaBancaria cuentaCorriente = new CuentaCorriente(1500, 12f);

		cuentaCorriente.ingresoACuenta(500f);
		cuentaCorriente.retiroDeCuenta(800f);
		System.out.println(cuentaCorriente.imprimirDatos());
		cuentaCorriente.retiroDeCuenta(1500);
		System.out.println(cuentaCorriente.imprimirDatos());
		cuentaCorriente.ingresoACuenta(350f);
		System.out.println(cuentaCorriente.imprimirDatos());
		cuentaCorriente.extractoMensual();
		System.out.println(cuentaCorriente.imprimirDatos());

	}

}
