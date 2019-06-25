package app;

/**
 * Excepcion para cuando no existe un integrante
 * @author francisco
 *
 */
public class IntegranteNoExisteException extends Exception {
	
	// Atributo
	private Integrante integrante;
	
	// Constructores
	public IntegranteNoExisteException() {
		super();
	}
	
	public IntegranteNoExisteException(Integrante integrante) {
		super();
		this.integrante = integrante;
	}
	
	@Override
	public String getMessage() {
		return integrante.getNombre() + " " + integrante.getApellido() + " no se encuentra en el plantel.";
		
	}
}
