package ejercicioUmlJAva;

public class Empresa {
	private Cliente[] clientes;
	private Producto[] productos;
	int cantProd;

	public Empresa(Cliente[] clientes) {
		super();
		this.clientes = clientes;
		productos = new Producto[10];
	}

	public Producto[] getProductos() {
		return productos;
	}

	public double gananciasTotales() {
		double suma = 0;
		int pos = 0;
		while (clientes[pos] != null) {
			suma += clientes[pos++].getProducto().getPrecio();
		}

		return suma;
	}

	public boolean addCliente(Cliente cliente) {
		return true;
	}

	public void removeSuscripcion(Cliente cliente) {
		cliente.setProducto(productos[0]);
	}
}
