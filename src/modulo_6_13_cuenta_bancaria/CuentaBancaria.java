package modulo_6_13_cuenta_bancaria;

public abstract class CuentaBancaria {
	// ATRIBUTOS
	private float saldo;
	private int numeroIngresos = 0;
	private int numeroRetiros = 0;
	private float tasaAnual;
	public final static float COMISION_MENSUAL = 2.05f;

	// CONSTRUCTORES
	public CuentaBancaria(float saldo, float tasaAnual) {
		this.saldo = saldo;
		// se divide entre 100 para poder utilizar mejor el porcentaje
		this.tasaAnual = tasaAnual / 100;
	}

	// GETTERS Y SETTERS

	public float getSaldo() {
		return saldo;
	}

	public int getNumeroIngresos() {
		return numeroIngresos;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	// METODOS

	// addSaldo permite ir sumando los ingresos
	public void addSaldo(float importe) {
		this.saldo += importe;
	}

	// subtractSaldo permite ir restando los retiros
	public void subtractSaldo(float importe) {
		this.saldo -= importe;
	}

	// ingresa un monto a la cuenta y actualiza su saldo
	// aumenta el numero de movimientos de ingresos
	public void ingresoACuenta(float ingreso) {
		addSaldo(ingreso);
		numeroIngresos++;
	}

	// hace retiro a cuenta y actualiza saldo
	// actualiza numero retiros
	public void retiroDeCuenta(float retiro) {
		if (getSaldo() >= retiro) {
			subtractSaldo(retiro);
			numeroRetiros++;
		}
	}

	// Se calcula el interes mensual dividiendo la tasa anual entre 12
	// se hace la multiplicacion por el saldo si y se obtiene el importe del interes
	protected void calcularInteresMensual() {
		float interesMensual = getSaldo() * (getTasaAnual() / 12);
		// se agrega a la cuenta
		addSaldo(interesMensual);
	}

	// se chequea que la cuenta no este en 0
	// se retira la comision mensual
	// se calcula el interes mensaul llamando al metodo anterior
	public void extractoMensual() {
		if (getSaldo() > 0) {
			subtractSaldo(COMISION_MENSUAL);
			calcularInteresMensual();
		}
	}

	// esta funcion toma el valor de un float y devuelve solo 2 cifras despues de la
	// coma
	public static float dosDecimales(float monto) {
		return (Math.round(monto * 100f) / 100f);
	}

	// devuelve los valores de los atributos
	public String imprimirDatos() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		builder.append("\nSaldo Cuenta: ");
		builder.append(dosDecimales(getSaldo()));
		builder.append(" €");
		builder.append("\nNumero de Ingresos: ");
		builder.append(getNumeroIngresos());
		builder.append("\nNumero de Retiros: ");
		builder.append(getNumeroRetiros());
		builder.append("\nTasa Anual: ");
		float tasaAn = tasaAnual * 100;
		builder.append(tasaAn);
		builder.append(" %");
		builder.append("\nComision Mensual: ");
		builder.append(COMISION_MENSUAL);
		builder.append(" €");
		builder.append("\n]");
		return builder.toString();
	}

}
