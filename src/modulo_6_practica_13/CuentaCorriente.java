package modulo_6_practica_13;

/*
 * Cuenta corriente: posee un atributo de sobregiro, el cual se inicializa en
 * cero. Se redefinen los siguientes métodos: • Retirar: se retira dinero de la
 * cuenta actualizando su saldo. Se puede retirar dinero superior al saldo. El
 * dinero que se debe queda como sobregiro. •Ingresar: invoca al método
 * heredado. Si hay sobregiro, la cantidad consignada reduce el sobregiro.
 * •Extracto mensual: invoca al método heredado. •Un nuevo método imprimir que
 * muestra en pantalla el saldo de la cuenta, la comisión mensual, el número de
 * transacciones realizadas (suma de cantidad de consignaciones y retiros) y el
 * valor de sobregiro.
 */
public class CuentaCorriente extends CuentaBancaria {
	// ATRIBUTOS
	private float sobreGiro = 0;

	// GETTERS Y SETTERS
	public float getSobreGiro() {
		return sobreGiro;
	}

	public void setSobreGiro(float sobreGiro) {
		this.sobreGiro = sobreGiro;
	}

	// CONSTRUCTORES

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	// METODOS
	public void addSobreGiro(float importe) {
		sobreGiro += importe;
	}

	public void subtractSobreGiro(float importe) {
		sobreGiro -= importe;
	}

	@Override
	public void retiroDeCuenta(float retiro) {
		// compruebo si el saldo es menor al retiro asi aplica el uso del sobregiro
		if (getSaldo() < retiro) {
			addSobreGiro(retiro - getSaldo());
			super.retiroDeCuenta(getSaldo());
		} else {
			super.retiroDeCuenta(retiro);
		}
	}

	@Override
	public void ingresoACuenta(float ingreso) {
		// compruebo que el sobreGiro sea menor que el ingreso
		float dif = ingreso - getSobreGiro();
		float sobreG = getSobreGiro();
		if (ingreso < getSobreGiro()) {
			subtractSobreGiro(ingreso);
		} else {
			subtractSobreGiro(sobreG);
			super.ingresoACuenta(dif);
		}
	}

	@Override
	public String imprimirDatos() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente \n[Saldo Cuenta=");
		builder.append(getSaldo());
		builder.append("\nComision Mensual=");
		builder.append(COMISION_MENSUAL);
		builder.append("\nNumero de transacciones=");
		builder.append((getNumeroIngresos() + getNumeroRetiros()));
		builder.append("\nImporte Sobregiro=");
		builder.append(getSobreGiro());
		builder.append("]");
		return builder.toString();
	}

}
