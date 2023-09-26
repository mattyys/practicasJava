package ejercicioUmlJAva;

public class RunMain {

	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[10];
		clientes[0] = new Cliente("Juan", "juan@mail.com", null);
		clientes[1] = new Cliente("Maria", "maria@mail.com", null);
		Empresa empresa = new Empresa(clientes);

		empresa.getProductos()[0] = new Producto("Gratis", 0);
		empresa.getProductos()[1] = new Producto("familiar", 15);
		empresa.getProductos()[2] = new Producto("premiun", 10);

		System.out.println(empresa.getProductos()[1]);

	}

}
