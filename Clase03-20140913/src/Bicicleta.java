
public class Bicicleta extends Transporte {
	
	private static final int VOLUMEN_MAXIMO = 100;
	private static final int KILOMETROS_MAXIMOS = 100;

	private double carga = 0;
	private int kilometrosRecorridos = 0;
	
	@Override
	public boolean cargar(Paquete paquete) {
		if (paquete.getVolumen() < VOLUMEN_MAXIMO) {
			this.carga  += paquete.getPeso();
			return true;
		}
		return false;
	}

	@Override
	public boolean hayQueReparar() {
		return this.kilometrosRecorridos > KILOMETROS_MAXIMOS;
	}

	public void recorrer(int kilometros) {
		this.kilometrosRecorridos += kilometros;
	}

	public double getCarga() {
		return this.carga;
	}

	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}
}
