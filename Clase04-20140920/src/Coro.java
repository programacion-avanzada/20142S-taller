import java.util.LinkedList;
import java.util.List;

public class Coro {

	private List<Cantante> baritonos = new LinkedList<Cantante>();
	private List<Cantante> tenores = new LinkedList<Cantante>();
	
	public void agregarBaritono(Cantante cantante) {
		this.baritonos.add(cantante);
	}
	
	public void agregarTenor(Cantante cantante) {
		this.tenores.add(cantante);
	}

	public void cantenBaritonos() {
		for (Cantante cadaUno : this.baritonos) {
			// TODO: este System.out debería quitarse de aquí
			System.out.println(cadaUno.cantar());
		}
	}

	public void cantenTenores() {
		for (Cantante cadaUno : this.tenores) {
			// TODO: este System.out debería quitarse de aquí
			System.out.println(cadaUno.cantar());
		}
	}
	
}
