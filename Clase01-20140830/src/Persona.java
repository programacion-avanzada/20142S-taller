public class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private char sexo;

	public Persona() {
		this("Juan", "Pérez", 12345678, 'M');
	}

	public Persona(String nombre, String apellido,
			int dni, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
	}

	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}
}
