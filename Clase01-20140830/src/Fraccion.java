public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		if (denominador == 0) {
			// FIXME: por ahora salvamos el error. Deberían utilizarse excepciones
			this.denominador = 1;
		} else {
			this.denominador = denominador;
		}
	}

	public Fraccion() {
		// Por defecto, una fracción es cero enteros
		this(0, 1);
	}

	public Fraccion sumar(Fraccion otra) {
		int numeradorResultado = (this.numerador * otra.denominador) + (otra.numerador * this.denominador);
		int denominadorResultado = this.denominador * otra.denominador;
		return new Fraccion(numeradorResultado, denominadorResultado);
	}
	
	public Fraccion restar(Fraccion otra) {
		int numeradorResultado = (this.numerador * otra.denominador) - (otra.numerador * this.denominador);
		int denominadorResultado = this.denominador * otra.denominador;
		return new Fraccion(numeradorResultado, denominadorResultado);
	}

	public Fraccion multiplicar(Fraccion otra) {
		int numeradorResultado = this.numerador * otra.numerador;
		int denominadorResultado = this.denominador * otra.denominador;
		return new Fraccion(numeradorResultado, denominadorResultado);
	}
	
	public Fraccion dividir(Fraccion otra) {
		int numeradorResultado = this.numerador * otra.denominador;
		// FIXME: Por el momento salvamos el posible error. Deberíamos utilizar excepciones
		int denominadorResultado = 1;
		if (otra.numerador != 0) {
			denominadorResultado = this.denominador * otra.numerador;
		}
		return new Fraccion(numeradorResultado, denominadorResultado);
	}
}
