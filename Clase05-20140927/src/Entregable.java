public class Entregable {

	private Destino destino;
	private double peso;

	public Entregable(Destino destino, double peso) {
		this.destino = destino;
		this.peso = peso;
	}

	public Destino getDestino() {
		return destino;
	}
	
	public double getPeso() {
		return peso;
	}
}
