package modulo_6_14_universidad;

public class Main {

	public static void main(String[] args) {
		Personal admin1 = new Administrativo("Pedro Gonzalez", "3332511", 12, 1);
		Personal admin2 = new Administrativo("Fulano Perez", "4452511", 15, 2);
		Personal info1 = new Informatico("Maria Ana Fagundez", "de558844", 1, 0);
		Personal info2 = new Informatico("Juan Sero", "AA5DDD4", 9, 1);
		Personal profe1 = new Profesor("Victor Pereira", "4411115", 3);
		Personal profe2 = new Profesor("Jessica Florida", "aa444881", 1);
		Personal inves1 = new Investigador("Antonella Suarez", "555556");
		Personal inves2 = new Investigador("Andres Frutas", "ff99588");

		Personal[] listadoPersonal = { admin1, admin2, info1, info2, profe1, profe2, inves1, inves2 };

		// LISTA LA NOMINA DE LA UNIVERSIDAD
		Universidad.imprimirNominas(listadoPersonal);
		// IMPRIME EL TOTAL DEL PRESUPUESTO
		System.out.println("Presupuesto total:: $" + Universidad.obtenerPresupuestoTotal(listadoPersonal));

		// VUELVO A IMPRIMIR LAS NOMINAS PARA CHEQUEAR QUE SE HAYA REINICIADO LAS HORAS
		// EXTRAS
		Universidad.imprimirNominas(listadoPersonal);
		System.out.println("Presupuesto total:: $" + Universidad.obtenerPresupuestoTotal(listadoPersonal));

	}

}
