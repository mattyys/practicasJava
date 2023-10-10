package modulo_6_13_cuenta_bancaria;
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
	// private boolean isActive;

	// CONSTRUCTORES
	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// isActive = cuentaActiva();
	}

	// METODOS
	// el metodo isActive chequea si la cuenta tiene un saldo mayor a 100 para
	// quedar activa
	public boolean isActive() {
		return getSaldo() > MONTO_CUENTA_INACTIVA;
	}

	// se sobreescribe metodo en el cual chequea si esta activa la cuenta y luego
	// llama al metodo de la superClase para realizar la operacion

	@Override
	public void ingresoACuenta(float ingreso) {
		if (isActive())
			super.ingresoACuenta(ingreso);
	}

	// se sobreescribe metodo en el cual chequea si esta activa la cuenta y luego
	// llama al metodo de la superClase para realizar la operacion

	@Override
	public void retiroDeCuenta(float retiro) {
		if (isActive()) {
			super.retiroDeCuenta(retiro);
		}
	}

	// El metodo verifique la cantidad de retiros, si es mayor a 4 se calcula la
	// diferencia
	// y se multiplica por la cantidad de la comision de retiros extras y devuelve
	// el valor total de la comision
	private float comisionRetiroExtra() {
		float totalComision = 0;
		if (getNumeroRetiros() > MINIMO_RETIRO) {
			totalComision = (getNumeroRetiros() - MINIMO_RETIRO) * COMISION_POR_RETIRO_EXTRA;
		}
		return totalComision;
	}

	@Override
	public void extractoMensual() {
		// se chequea que la cuenta este activa para realizar la transaccion
		if (isActive()) {
			subtractSaldo((COMISION_MENSUAL + comisionRetiroExtra()));
			calcularInteresMensual();
		}

	}

	@Override
	public String imprimirDatos() {
		// devulve los datos de saldo de la cuenta, comision y numeros totales de
		// transacciones
		int totalMovimientos = getNumeroIngresos() + getNumeroRetiros();
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaAhorro \n[\nSaldo Cuenta=");
		builder.append(dosDecimales(getSaldo()));
		builder.append(" €");
		builder.append("\nCuenta Activa=");
		builder.append(isActive());
		builder.append("\nComision Mensual=");
		builder.append(COMISION_MENSUAL);
		builder.append(" €");
		builder.append("\nNumero de transacciones realizadas=");
		builder.append(totalMovimientos);
		builder.append("\n]");
		return builder.toString();
	}

}
