package app;

/**
 * Clase abstracta de la que heredan todos los integrantes del plantel
 * 
 * @author francisco
 *
 */
public abstract class Integrante {

	// Atributos
	private String nombre;
	private String apellido;
	private int edad;

	// Constructores
	/**
	 * 
	 */
	public Integrante() {
		super();
		this.nombre = "";
		this.apellido = "";
		setEdad(0);
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Integrante(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
	}

	// Getters & Setters
	// Asumo que no se cambian nombres ni apellidos
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void viajar() {
		System.out.println(getNombre() + " " + getApellido() + " esta viajando.");
	}

	public void concentrar() {
		System.out.println(getNombre() + " " + getApellido() + " esta concentrado.");
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
