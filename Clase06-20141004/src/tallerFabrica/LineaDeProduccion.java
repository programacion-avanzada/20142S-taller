package tallerFabrica;

import java.util.concurrent.Semaphore;

public class LineaDeProduccion {
	private static LineaDeProduccion linea = new LineaDeProduccion();
	private static final int MAXAUTOS = 4;
	private static final int MAXBICICLETAS = 16;
	private int cantidadAutos, cantidadBicicletas;
	private Semaphore semaforo = new Semaphore(1);

	private LineaDeProduccion() {
		cantidadAutos = 0;
		cantidadBicicletas = MAXBICICLETAS;
	}

	public static LineaDeProduccion getLinea() {
		return linea;
	}

	public boolean puedoPonerProducto(Producto producto) {
		if (producto.getNombre().equals("auto") && cantidadAutos < MAXAUTOS)
			return true;
		if (producto.getNombre().equals("bicicleta")
				&& cantidadBicicletas < MAXBICICLETAS)
			return true;
		return false;
	}

	public void ponerProducto(Producto producto) {
		if (producto.getNombre().equals("auto")) {
			cantidadAutos++;
			System.out.println(producto.getNombre() + " " + cantidadAutos);
			if (cantidadAutos >= MAXAUTOS)
				cantidadBicicletas = 0;
		} else if (producto.getNombre().equals("bicicleta")) {
			cantidadBicicletas++;
			System.out.println(producto.getNombre() + " " + cantidadBicicletas);
			if (cantidadBicicletas >= MAXBICICLETAS)
				cantidadAutos = 0;
		}
	}

	public void tomarLinea() throws Exception {
		semaforo.acquire();
	}

	public void liberarLinea() throws Exception {
		semaforo.release();
	}
}
