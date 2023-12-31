package deberes;

public class Coche {

	private String marca;
	private String modelo;
	private String color;

	public Coche(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String imprimirDatos() {
		return new String("Coche :: \nMarca = " + marca + "\nModelo = " + modelo + "\nColor = " + color);
	}

}
