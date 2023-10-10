package modulo_6_14_universidad;

public class Universidad {

	// se imprime nomina de todo el personal
	public static void imprimirNominas(Personal[] listaPersonal) {
		System.out.println("NOMINA PERSONAL DE LA NIVERSIDAD");
		for (int i = 0; i < listaPersonal.length; i++) {
			System.out.println("----------------------");
			System.out.println(listaPersonal[i].getNomina());
			System.out.println("----------------------");
		}
	}

	// metodo que devuelve el presupuesto total y realiza el reinicio de las horas
	// extras
	public static double obtenerPresupuestoTotal(Personal[] listaPersonal) {
		double totalAPagar = 0;
		for (int i = 0; i < listaPersonal.length; i++) {
			totalAPagar += listaPersonal[i].generarSueldo();
			listaPersonal[i].pagarSueldos();
		}

		return totalAPagar;

	}

}
