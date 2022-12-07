package clases;
// Clase que define una fracción.
/**
 * Fraction class
 * @author aleleotta
 */
public class Fraccion {
	// Numerador
	/**
	 * Numerator
	 */
	private int num;

	// Denominador
	/**
	 * Denominator
	 */
	private int den;

	// Constructor por defecto
	/**
	 * Constructor by default.
	 */
	public Fraccion() { // debe generar el valor neutro que es 0/1
		num = 0;
		den = 1;

	}
	
	// Constructor con par�metros
	/**
	 * Constructor with parameters
	 * @param num
	 * @param den
	 */
	public Fraccion(int num, int den) {
		// debo evitar crear fracciones con 0 en el divisor
		this.num = num;
		if (den == 0) {
			den = 1;
		}
		this.den = den;
		// devuelvo la fracci�n simplificada
		simplificar();
	}

	// Constructor copia
	/**
	 * Duplicate constructor fraction
	 * @param f
	 */
	public Fraccion(final Fraccion f) {
		num = f.num;
		den = f.den;
	}

	// getters y setters
	/**
	 * numerator setter
	 * @param num
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * numerator getter
	 * @return
	 */
	public int getNum() {
		return num;

	}
	/**
	 * denumerator setter
	 * @param den
	 */
	public void setDen(int den) {
		this.den = den;
	}
	/**
	 * denumerator getter
	 * @return
	 */
	public int getDen() {
		return den;
	}
	/**
	 * MCD method
	 * @return
	 */
	// C�lculo del m�ximo com�n divisor por el algoritmo de Euclides
	private int mcd() {
		int u = Math.abs(num); // valor absoluto del numerador
		int v = Math.abs(den); // valor absoluto del denominador
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	/**
	 * Fraction simplification method
	 */
	// m�todo para simplificar fracciones
	public void simplificar() {
		int n = mcd();
		num = num / n;
		den = den / n;
	}

	// M�todo toString
	/**
	 * toString method
	 */
	public String toString() {
		String mensaje = num + "/" + den;
		return mensaje;

	}
	
	// suma de fracciones
	/**
	 * Fraction sum method
	 * @param f
	 * @return
	 */
	public Fraccion sumar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den + den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;

	}

	// Restar fracciones
	/**
	 * Fraction subtraction method
	 * @param f
	 * @return
	 */
	public Fraccion restar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den - den * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;

	}

//Multiplicar fracciones
	/**
	 * Fraction multiplication method
	 * @param f
	 * @return
	 */
	public Fraccion multiplicar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.num;
		aux.den = den * f.den;
		aux.simplificar();
		return aux;

	}

//Dividir fracciones
	/**
	 * Fraction division method
	 * @param f
	 * @return
	 */
	public Fraccion dividir(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.num = num * f.den;
		aux.den = den * f.num;
		aux.simplificar();
		return aux;
	}
}