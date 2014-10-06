package tallerFabrica;

public class Fabrica<E extends Producto> extends Thread {
	private E producto;
	private LineaDeProduccion linea = LineaDeProduccion.getLinea();

	public Fabrica(E producto) {
		this.producto = producto;
	}

	public void run() {
		while (true) {
			try {
				linea.tomarLinea(); // Bloquea con semaforo la linea

				if (linea.puedoPonerProducto(producto))
					linea.ponerProducto(producto);

				linea.liberarLinea(); // Libera el semaforo
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Fabrica<Auto>(new Auto()).start();
		new Fabrica<Bicicleta>(new Bicicleta()).start();
	}

}
