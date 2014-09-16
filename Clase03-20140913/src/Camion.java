
public class Camion extends Transporte {

	private static final int VIAJES_MAXIMOS = 10;
	private static final int CARGA_MAXIMA = 1000;

	private double carga = 0;
	private int cantidadViajes = 0;
	
	@Override
	public boolean cargar(Paquete paquete) {
		if (paquete.getPeso() < CARGA_MAXIMA) {
			this.carga  += paquete.getPeso();
			return true;
		}
		return false;
	}

	@Override
	public boolean hayQueReparar() {
		return this.cantidadViajes  > VIAJES_MAXIMOS;
	}

	public void realizarViaje() {
		this.cantidadViajes ++;
	}

	public double getCarga() {
		return this.carga;
	}

	public int getCantidadViajes() {
		return this.cantidadViajes;
	}
}
