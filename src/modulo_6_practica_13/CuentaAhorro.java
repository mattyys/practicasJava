package modulo_6_practica_13;
/*
 * Cuenta de ahorros: posee un atributo para determinar si la cuenta de ahorros
 * está activa (tipo boolean). Si el saldo es menor a 100€, la cuenta está
 * inactiva, en caso contrario se considera activa. Los siguientes métodos se
 * redefinen: 1.Ingresar: se puede ingresar dinero si la cuenta está activa.
 * Debe invocar al método heredado. 2.Retirar: es posible retirar dinero si la
 * cuenta está activa. Debe invocar al método heredado. 3.Extracto mensual: si
 * el número de retiros es mayor que 4, por cada retiro adicional, se cobra 1.5€
 * como comisión mensual. Al generar el extracto, se determina si la cuenta está
 * activa o no con el saldo. 4. Un nuevo método imprimir que muestra en pantalla
 * el saldo de la cuenta, la comisión mensual y el número de transacciones
 * realizadas (suma de cantidad de consignaciones y retiros).
 */

public class CuentaAhorro extends CuentaBancaria {

	// ATRIBUTOS
	private final int MONTO_CUENTA_INACTIVA = 100;
	private final int MINIMO_RETIRO = 4;
	private final float COMISION_POR_RETIRO_EXTRA = 1.5f;
	// private boolean isActive = false;

	// CONSTRUCTORES
	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// isActive = cuentaActiva();
	}

	// METODOS
	public boolean cuentaActiva() {
		return getSaldo() > MONTO_CUENTA_INACTIVA;
	}

	@Override
	public void ingresoACuenta(float ingreso) {
		if (cuentaActiva())
			super.ingresoACuenta(ingreso);
	}

	@Override
	public void retiroDeCuenta(float retiro) {
		if (cuentaActiva()) {
			super.retiroDeCuenta(retiro);
		}
	}

	// El metodo verifique la cantidad de retiros pasados de 4 y devuelve
	// el total de la comision por retiro mayores a 4
	private float comisionRetiroExtra() {
		float totalComision = 0;
		if (getNumeroRetiros() > MINIMO_RETIRO) {
			totalComision = (getNumeroRetiros() - MINIMO_RETIRO) * COMISION_POR_RETIRO_EXTRA;
		}
		return totalComision;
	}

	@Override
	public void extractoMensual() {
		if (cuentaActiva()) {
			subtractSaldo((COMISION_MENSUAL + comisionRetiroExtra()));
			calcularInteresMensual();
		}

	}

	@Override
	public String imprimirDatos() {
		int totalMovimientos = getNumeroIngresos() + getNumeroRetiros();
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaAhorro [Saldo Cuenta=");
		builder.append(getSaldo());
		builder.append("\nComision Mensual=");
		builder.append(COMISION_MENSUAL);
		builder.append("\nNumero de transacciones realizadas=");
		builder.append(totalMovimientos);
		builder.append("\n]");
		return builder.toString();
	}

}
