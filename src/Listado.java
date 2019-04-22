import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Listado {
	public static void main(String[] args) {
		
		ArrayList<Productos> listaProductos = new ArrayList<Productos>();

		listaProductos.add(new Productos("Coca-cola", 2.0, 40));
		listaProductos.add(new Productos("Manaos", 3.0, 25));
		listaProductos.add(new Productos("Sprite", 1.5, 5));
		listaProductos.add(new Productos("Shampoo", 2.0, 10));
	
		Comparator c = Collections.reverseOrder(new Sortbyroll());
		
		Collections.sort(listaProductos, c);

		System.out.println("Producto más caro: " + listaProductos.get(0));
		
		Integer variable = listaProductos.size() - 1;
		System.out.println("Producto más barato: " + listaProductos.get(variable));
		
	}
}
