package modulo_5_12_poo_bolsa_de_objetos;

public class Main {

	// Se utiliza la clase Persona de una Practica anterior para ingresar objeto
	// junto con algunos textos y numeros

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", "Perez", "123456789", 1995);
		Persona persona2 = new Persona("Maria", "Gonzalez", "123498745", 1990);
		Persona persona3 = new Persona("Pedro", "Rodriguez", "888456559", 1988);
		Persona persona4 = new Persona("Lucia", "Medndez", "7774586989", 2000);
		Persona persona5 = new Persona("Milagros", "Garcia", "723555989", 1980);
		Bag bag = new Bag();

		System.out.println("Esta vacia la bolsa? " + bag.isEmpty());

		bag.add("prueba");
		bag.add("perro");
		bag.add(persona2);
		bag.add("cosas");
		bag.add(persona1);
		bag.add("herramientas");
		System.out.println("se agrega elemento?: " + bag.add(persona4));
		bag.add(persona3);
		bag.add(1234);
		bag.add(5555);
		System.out.println(bag.mostrarElementos());

		System.out.println("Esta vacia la bolsa? " + bag.isEmpty());
		System.out.println("cantidad de elementos " + bag.size());
		System.out.println("Contiene elemento " + bag.contains(persona5));
		System.out.println("Objeto RANDOM:: " + bag.extract());
		System.out.println("cantidad de elementos " + bag.size());
		System.out.println(bag.mostrarElementos());

		// Se vacia Bags
		bag.clear();

		// se comprueba que este vacia
		System.out.println("Esta vacia la bolsa? " + bag.isEmpty());
		System.out.println("cantidad de elementos " + bag.size());

		System.out.println(bag.mostrarElementos());

	}

}
