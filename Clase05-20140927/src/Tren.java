import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Tren<E extends Entregable> {

	List<E> entregables = new LinkedList<E>();
	List<Destino> recorrido;

	public Tren(List<Destino> recorrido) {
		this.recorrido = recorrido;
	}

	public List<E> getEntregables() {
		return entregables;
	}

	public void agregar(E entregable) {
		if (recorrido.contains(entregable.getDestino())) {
			this.entregables.add(entregable);
		} else {
			throw new RuntimeException("No se puede entregar a "
					+ entregable.getDestino());
		}
	}

	public List<E> priorizarEntregables() {

		Collections.sort(this.entregables, new Comparator<E>() {
			public int compare(E o1, E o2) {
				return o1.getDestino().compareTo(o2.getDestino());
			}
		});
		
		return this.entregables;

	}
}
