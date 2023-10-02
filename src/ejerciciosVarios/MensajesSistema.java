package ejerciciosVarios;

public class MensajesSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean control = true;

		if (control) {
			System.out.println("Todo sin errores");
			System.exit(0);
		} else {
			System.err.println("Ha habido un error");
			System.exit(1);
		}
		System.out.println("Esto no se ejecuta!!");

	}

	/**
	 * por consola dentro de la carpeta
	 * 
	 * ejecutar comando java MensajesSistema.java > salida.txt 2> error.log
	 * 
	 * si es ok se guarda en salida.txt si hay error se guarda en error.log
	 * 
	 * para ver archivo ubuntu:: nano error.log o salida.txt windows:: notepad
	 * error.log o salida.txt
	 */
}
