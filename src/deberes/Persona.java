package deberes;

public class Persona {

	private String nombre;
	private int edad;
	private Coche[] coches;
	public static final int MAX_COCHES = 4;
	private int numCoche = 0;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		coches = new Coche[MAX_COCHES];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCoches() {
		StringBuilder builder = new StringBuilder();
		for (Coche coche : coches) {
			if (coche != null) {
				builder.append(coche.imprimirDatos());
				builder.append("\n");
			}
		}
		return builder.toString();
	}

	public void setCoche(Coche coche) {
		if (numCoche < MAX_COCHES)
			this.coches[numCoche++] = coche;
	}

	public void imprimirDatos() {
		System.out.println("Nombre = " + nombre + "\nEdad = " + edad + "\n" + getCoches());

	}

}
