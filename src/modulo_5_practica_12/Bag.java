package modulo_5_practica_12;

import java.util.Random;

public class Bag {
	// ATRIBUTOS
	private Object[] coleccionObjetos;
	private int index;

	// CONSTRUCTORES
	public Bag() {
		super();
		this.coleccionObjetos = new Object[20];
	}

	// añade un elemento a la bolsa
	public boolean add(Object e) {
		// si el tamaño de la coleccion es igual al indicie es porque esta comleto el
		// array
		if (index == coleccionObjetos.length) {
			return false;
		} else {
			// agrega el objeto y suma 1 al indice
			coleccionObjetos[index] = e;
			index++;
			return true;
		}
	}

	// elimina todos los elementos de la bolsa
	// se asigna null a cada posicion agregada en la coleccion y se reinicia el
	// index
	public void clear() {
		for (int i = 0; i < index; i++) {
			coleccionObjetos[i] = null;
		}
		index = 0;
	}

	// comprueba si un objeto determinado esta en la bolsa
	// por cada elemento agregado se comprueba que este el objeto ingresado
	// returna true si lo encuentra y corta el for con break;
	public boolean contains(Object e) {
		boolean result = false;
		for (int i = 0; i < index; i++) {
			if (coleccionObjetos[i].equals(e)) {
				result = true;
				break;
			} else {
				result = false;
			}
		}
		return result;
	}

	// indica si la bolsa esta vacia o no
	// utilizo un contador y compruebo cada posicion del array y verifico si es null
	// en caso de ser null es que no hay objetos y si la suma del contador es la
	// misma que la de los elementos es porque esta vacia la bolsa o sin elementos
	// agregados
	public boolean isEmpty() {
		int contador = 0;
		for (Object obj : coleccionObjetos) {
			if (obj == null) {
				contador++;
			}
		}
		if (contador == coleccionObjetos.length) {
			return true;
		} else {
			return false;
		}

	}

	// devuelve el numero de elementos de la bolsa
	// la variable index es la que va guardando la posicion y cantidad de elemntos
	// gregados, se retorna la variable index que guarda la cantidad de elementos
	// agregados
	public int size() {
		return index;
	}

	/**
	 * Extrae un elemento de la bolsa. Todos, independientemente de como se hayan
	 * introducido tienen la misma probabilidad de salir. Ayuda: Usa la clase
	 * java.util.Random y su metodo nextInt para obtener un entero aleatorio
	 */
	// se utiliza el index y no la propiedad length de la coleccion para que no
	// devuelva una posicion vacia.
	public Object extract() {
		Random random = new Random();
		int posicion = random.nextInt(index);
		Object obj = coleccionObjetos[posicion];
		eliminar(posicion);
		return obj;
	}

	// elimina el elemento por la posicion pasada, se hizo private para utilizarlo
	// en el metodo extract para eliminar el elemnto de la bolsa
	// a partir de la posicion se recorre el array y se van cambiando los elementos
	// y se actualiza el indice
	private void eliminar(int posicion) {
		for (int i = posicion; i < coleccionObjetos.length - 1; i++) {
			coleccionObjetos[i] = coleccionObjetos[i + 1];
		}
		index--;
	}

	// hice la funcion para mostrar los elemntos de la bolsa, me sirvio para
	// verificar los elemntos agregados y eliminados
	public String mostrarElementos() {
		int numero = 0;
		StringBuilder builder = new StringBuilder();
		builder.append("Elementos de la Bolsa");
		for (int i = 0; i < index; i++) {
			numero = i + 1;
			builder.append("\nElemento:: ");
			builder.append(numero);
			builder.append(". => ");
			builder.append(coleccionObjetos[i]);
		}

		return builder.toString();
	}
}