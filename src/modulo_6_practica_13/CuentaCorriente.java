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
	// suma los sobregiros
	public void addSobreGiro(float importe) {
		sobreGiro += importe;
	}

	// va restando los ingresos de los sobregiros
	public void subtractSobreGiro(float importe) {
		sobreGiro -= importe;
	}

	// Se sobreecribe metodo para agregar la funcionalidad de que si se extrae mas
	// del monto del saldo
	// se suma al sobregiro, tambien se chequea que este activa la cuenta
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
	// se sobreecribir el metodo ingresoACuenta para chequear si existe un sobre
	// giro
	// si hay sobregiro se chequea que si el ingreso es mayor o menor y ahi realiza
	// acciones
	// si el ingreso es menor o igual sobregiro se descuenta el total al sobregiro
	// si es mayor se descuenta el total de sobregiro y lo que queda se suma ala
	// cuenta

	@Override
	public void ingresoACuenta(float ingreso) {
		// compruebo que el sobreGiro sea menor que el ingreso
		float dif = ingreso - getSobreGiro();
		float sobreG = getSobreGiro();
		if (ingreso <= getSobreGiro()) {
			subtractSobreGiro(ingreso);
		} else {
			subtractSobreGiro(sobreG);
			super.ingresoACuenta(dif);
		}
	}

	// se sobreescrube el metodo imprimirDatos para devolver los datos solicitados
	// para la cuenta corriente
	@Override
	public String imprimirDatos() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente \n[\nSaldo Cuenta=");
		builder.append(dosDecimales(getSaldo()));
		builder.append(" €");
		builder.append("\nComision Mensual=");
		builder.append(COMISION_MENSUAL);
		builder.append(" €");
		builder.append("\nNumero de transacciones=");
		builder.append((getNumeroIngresos() + getNumeroRetiros()));
		builder.append("\nImporte Sobregiro=");
		builder.append(dosDecimales(getSobreGiro()));
		builder.append(" €");
		builder.append("\n]");
		return builder.toString();
	}

}
