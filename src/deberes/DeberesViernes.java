//hacer una clase persona y una clase coche
//que cada persona tenga un coche
package deberes;

public class DeberesViernes {
	public static void main(String[] args) {

		Persona matias = new Persona("Matias de tal", 30);
		Coche bmw = new Coche("BMW", "320 i", "Gris");
		Coche geely = new Coche("Geely", "Coolray", "Rojo");
		Coche renault = new Coche("Renault", "Clio", "Azul");

		matias.setCoche(bmw);
		matias.setCoche(geely);
		matias.setCoche(renault);
		matias.imprimirDatos();
	}

}
