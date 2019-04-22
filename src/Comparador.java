import java.util.Comparator;

class Sortbyroll implements Comparator<Productos> {

		@Override
		public int compare(Productos o1, Productos o2) {

			return o1.precio - o2.precio;

	}
}

