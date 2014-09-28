public class Destino implements Comparable<Destino> {

	private String nombre;
	private double distancia;

	public Destino(String nombre, double distancia) {
		this.nombre = nombre;
		this.distancia = distancia;
	}

	public String getNombre() {
		return nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public String toString() {
		return this.nombre;
	}

	public int compareTo(Destino otroDestino) {
		return (int) (this.distancia - otroDestino.distancia);
	}

}
