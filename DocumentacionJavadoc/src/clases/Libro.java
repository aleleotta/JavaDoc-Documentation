package clases;
/**
 * Book class.
 * @author aleleotta
 */
public class Libro {
	/**
	 * Class that contains all functions.
	 * @author aleleotta
	 */
	private String titulo;
	
	private String autor;
	
	private int ejemplares;
	
	private int prestados;

	// constructor por defecto
	/**
	 * Constructor by default.
	 */
	public Libro() {
	}

	// constructor con par�metros
	/**
	 * Titulo: title.
	 * Autor: Author.
	 * Ejemplares: Copies.
	 * Prestados: Borrowed.
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;

	}

	// constructor copia
	/**
	 * Constructor copy.
	 * @param lib
	 */
	public Libro(final Libro lib) {
		titulo = lib.titulo;
		autor = lib.autor;
		ejemplares = lib.ejemplares;
		prestados = lib.prestados;

	}

	// getters y setters
	/**
	 * Title setter (Creates the following object).
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Title getter (Returns object to main or whatever other function this function is included into).
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Author setter (Creates the following object).
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Author getter (Returns object to main or whatever other function this function is included into).
	 * @return
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Copies setter (Creates the following object).
	 * @param ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	/**
	 * Copies getter (Returns object to main or whatever other function this function is included into).
	 * @return
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Borrowed setter (Creates the following object).
	 * @param prestados
	 */
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	/**
	 * Borrowed getter (Returns object to main or whatever other function this function is included into).
	 * @return
	 */
	public int getPrestados() {
		return prestados;
	}

	// m�todo toString
	/**
	 * toString Method
	 */
	public String toString() {
		String mensaje = "T�tulo: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + ejemplares + "\nPrestados: "
				+ prestados + "\n----------------\n";
		return mensaje;

	}

	// M�todo pr�stamo que incremente el atributo correspondiente cada vez que se
	// realice un pr�stamo del libro.
	// No se podr�n prestar libros de los que no queden ejemplares disponibles para
	// prestar.
	// Devuelve true si se ha podido realizar la operaci�n y false en caso
	// contrario.
	/**
	 * Every time that a borrow happens, the following variable will increment: prestados++. (If (prestamo == true))
	 * If no copies are available, the following variable will be false: prestados. Plus, prestados won't increment.
	 * @return
	 */
	public boolean prestamoLibro() {
		boolean prestamo = true;
		if (prestados < ejemplares) {
			prestados++;

		} else {
			prestamo = false;
		}
		return prestamo;
	}

	// M�todo devoluci�n que decremente el atributo correspondiente cuando se
	// produzca la devoluci�n de un libro
	// No se podr�n devolver libros que no se hayan prestado.
	// Devuelve true si se ha podido realizar la operaci�n y false en caso
	// contrario.

	/**
	 * If a book is returned, the following variable will decrement: prestados--. (If (prestados > 0))
	 * If there are currently no borrowed books then the following variable will be false: prestados.
	 * If prestados is false, prestados won't increment.
	 * @return
	 */
	public boolean devolucionLibro() {
		boolean devuelto = true;
		if (prestados > 0) {
			prestados--;
		} else {
			devuelto = false;
		}
		return devuelto;
	}
}
