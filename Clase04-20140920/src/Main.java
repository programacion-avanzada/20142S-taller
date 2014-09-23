
public class Main {

	public static void main(String[] args) {
		Coro coro = new Coro();
		
		//Prueba metodo agrega baritono
		coro.agregarBaritono(new Perro());
		System.out.println("Canto de un baritono:");
		coro.cantenBaritonos();
		
		System.out.println("----------------------");
		//Prueba metodo agrega tenor
		coro.agregarTenor(new Persona());
		System.out.println("Canto de un tenor:");
		coro.cantenTenores();
		
		//Agrego varios tenores:
		coro.agregarTenor(new Persona());
		coro.agregarTenor(new Loro());
		coro.agregarTenor(new Loro());
		coro.agregarTenor(new Perro());

		//Agrego varios baritonos
		coro.agregarBaritono(new Perro());
		coro.agregarBaritono(new Loro());
		coro.agregarBaritono(new Loro());
		coro.agregarBaritono(new Persona());

		//Canten Todos
		System.out.println("----------------------");
		System.out.println("Tenores: ");
		coro.cantenTenores();
		System.out.println();
		System.out.println("Baritonos ");
		coro.cantenBaritonos();
		
	}

}
