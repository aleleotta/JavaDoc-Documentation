package clases;
/**
 * Counter class
 * @author aleleotta
 *
 */
public class Contador {
	/**
	 * Int counter
	 * @author aleleotta
	 */
	private int cont;

	// Constructor por defecto
	/**
	 * Constructor by default.
	 */
	public Contador() {
	}

	// Contructor con par�metros
	/**
	 * Constructor with parameter (cont)
	 * @param cont
	 */
	public Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	// Constructor copia
	/**
	 * Duplicate constructor counter
	 * @param c
	 */
	public Contador(final Contador c) {
		cont = c.cont;
	}

	// setter
	/**
	 * counter setter
	 * @param cont
	 */
	public void setContador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {

			this.cont = cont;
		}
	}
	// getter
	/**
	 * counter getter
	 * @return
	 */
	public int getContador() {
		return cont;
	}

	// M�todo incrementar
	/**
	 * Increment
	 */
	public void incrementar() {
		cont++;
	}

	// M�todo decrementar
	/**
	 * Decrement
	 */
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}

}
