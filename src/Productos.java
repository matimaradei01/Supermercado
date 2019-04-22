
public class Productos {

	private String marca;
	private double litros = 0.0d;
	Integer precio;

	public Productos(String marca, double litros, Integer precio) {

		this.marca = marca;
		this.litros = litros;
		this.precio = precio;

	}

	@Override
	public String toString() {
		return "Marca: " + marca + "";
	}
}


