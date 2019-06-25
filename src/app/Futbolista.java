package app;

/**
 * Clase futbolista hereda de integrante e implementa IPrincipales
 * @author francisco
 *
 */
public class Futbolista extends Integrante implements IPrincipales {

	// Atributos
	private String numeroCamiseta;
	private String puesto;
	
	// Constructores
	public Futbolista() {
		super();
		setNumeroCamiseta("");
		setPuesto("");
	}
	
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param numeroCamiseta
	 * @param puesto
	 * @return instancia de Futbolista
	 */
	public Futbolista(String nombre,String apellido, int edad, String numeroCamiseta, String puesto) {
		super(nombre, apellido, edad);
		setNumeroCamiseta(numeroCamiseta);
		setPuesto(puesto);
	}
	
	// Getters & Setters
	public String getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(String numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public void jugarPartido() {
		System.out.println(getNombre() + " " + getApellido() + " esta jugando el partido.");
	}

	@Override
	public String toString() {
		return "Futbolista" + super.toString();
	}
}
