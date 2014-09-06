import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this(0, 0);
	}

	public double distanciaAlOrigen() {
//		return sqrt(pow(this.x, 2) + pow(this.y, 2));
		return distanciaHasta(new Punto());
	}

	public double distanciaHasta(Punto otro) {
		return sqrt(pow(this.x - otro.x, 2) + pow(this.y - otro.y, 2));
	}
	
	public void desplazar(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) { return false; }
		if (this == o) { return true; }
		if (this.getClass() != o.getClass()) { return false; }
		Punto otro = (Punto) o;
		if (this.x == otro.x && this.y == otro.y) { return true; }
		return false;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	@Override
	public Punto clone() {
		return new Punto(this.x, this.y);
	}
}
