package clases;

public class Contador {
	private int cont;

	// Constructor por defecto

	public Contador() {
	}

	// Contructor con par�metros

	public Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}

	// Constructor copia

	public Contador(final Contador c) {
		cont = c.cont;
	}

	// geter
	public void setContador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		} else {

			this.cont = cont;
		}
	}
	// setter

	public int getContador() {
		return cont;
	}

	// M�todo incrementar
	public void incrementar() {
		cont++;
	}

	// M�todo decrementar
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}

}
