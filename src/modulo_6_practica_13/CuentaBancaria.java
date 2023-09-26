package modulo_6_practica_13;

public class CuentaBancaria {
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
	public void addSaldo(float importe) {
		this.saldo += importe;
	}

	public void subtractSaldo(float importe) {
		this.saldo -= importe;
	}

	public void ingresoACuenta(float ingreso) {
		// ingresa un monto a la cuenta y actualiza su saldo
		// aumenta el numero de ingresos
		addSaldo(ingreso);
		numeroIngresos++;
	}

	// hice el metodo boolean para que devuelva si se hizo o no la operacion
	public void retiroDeCuenta(float retiro) {
		// hace retiro a cuenta y actualiza saldo
		// actualiza numero retiros
		if (getSaldo() >= retiro) {
			subtractSaldo(retiro);
			numeroRetiros++;
		}
	}

	protected void calcularInteresMensual() {
		// Se calcula el interes mensual dividiendo la tasa anual entre 12
		// se hace la multiplicacion por el saldo si se obtiene el importe del interes
		float interesMensual = getSaldo() * (getTasaAnual() / 12);
		// se agrega a la cuenta
		addSaldo(interesMensual);
	}

	public void extractoMensual() {
		// se resta la comison mensual calculando el interes
		// se utiliza el metododo calcularInteresMensual()
		if (getSaldo() > 0) {
			subtractSaldo(COMISION_MENSUAL);
			calcularInteresMensual();
		}
	}

	public String imprimirDatos() {
		// devuelve los valores de los atributos
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		builder.append("\nSaldo Cuenta: ");
		builder.append(getSaldo());
		builder.append("\nNumero de Ingresos: ");
		builder.append(getNumeroIngresos());
		builder.append("\nNumero de Retiros: ");
		builder.append(getNumeroRetiros());
		builder.append("\nTasa Anual: ");
		float tasaAn = tasaAnual * 100;
		builder.append(tasaAn);
		builder.append(" %");
		builder.append("\nComision Mensuial: ");
		builder.append(COMISION_MENSUAL);
		builder.append("\n]");
		return builder.toString();
	}

}
