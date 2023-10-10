package modulo_5_11_poo_rectangulo;

public class Rectangulo {

	/*
	 * Atributos con las dimensiones de este rectángulo ( valores enteros ).
	 * Inicializa un nuevo rectángulo con los valores pasados por parámetro . Si se
	 * intenta dar valor negativo a alguna de las dimensiones , lo corrige al valor
	 * positivo usando Math.abs(int a).
	 * 
	 * @param base base . @param altura altura .
	 */
	private int base;
	private int altura;

	// CONSTRUCTORES
	// Inicializa un nuevo rectángulo con base 2 y altura 1.
	public Rectangulo() {
		super();
		this.base = 2;
		this.altura = 1;
	}

	// se utiliza en el contructor el metodo de la clase Math.abs para invertir un
	// numero negativo
	public Rectangulo(int base, int altura) {
		super();
		this.base = Math.abs(base);
		this.altura = Math.abs(altura);
	}

	// GETTERS Y SETTERS

	public int getBase() {
		return base;
	}

	// se utiliza en el contructor el metodo de la clase Math.abs para invertir un
	// numero negativo
	public void setBase(int base) {
		this.base = Math.abs(base);
	}

	public int getAltura() {
		return altura;
	}

	// se utiliza en el contructor el metodo de la clase Math.abs para invertir un
	// numero negativo
	public void setAltura(int altura) {
		this.altura = Math.abs(altura);
	}

	// METODOS

	// Indica si este rectángulo es un cuadrado . @return true si y solo si la base
	// y la altura son iguales .
	public boolean esCuadrado() {
		if (base == altura) {
			return true;
		} else {
			return false;
		}
	}

	// Calcula el área de este rectángulo . @return El área del rectángulo.
	public int area() {
		return base * altura;
	}

	// Calcula el perímetro de este rectángulo . @return perímetro del rectángulo.
	public int perimetro() {
		return (base + altura) * 2;
	}

	// Gira 90 grados este rectángulo intercambiado la base por la altura.
	// inicializo variables y guardo el valor de la altura y base para luego
	// cambiarlos
	public void gira() {
		int giraAltura = altura;
		int giraBase = base;
		this.base = giraAltura;
		this.altura = giraBase;
	}

	public static void main(String[] args) {
		Rectangulo figura1 = new Rectangulo();
		// se muestran valores del rectangulo y resultado de los metodos
		System.out.println("Altura:: " + figura1.getAltura());
		System.out.println("Base:: " + figura1.getBase());

		System.out.println("Es cuadrado:: " + figura1.esCuadrado());
		System.out.println("Perimetro:: " + figura1.perimetro() + " m");
		System.out.println("Area:: " + figura1.area() + " m²");

		// se aplica el metodo gira y se imprimen valores actualizados
		figura1.gira();
		System.out.println("despues de girar");
		System.out.println("Altura:: " + figura1.getAltura());
		System.out.println("Base:: " + figura1.getBase());

	}
}
