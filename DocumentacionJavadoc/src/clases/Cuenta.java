package clases;
/**
 * Account class
 * @author aleleotta
 *
 */
public class Cuenta {
	/**
	 * String name
	 */
	private String nombre;
	/**
	 * String accountNumber
	 */
	private String numeroCuenta;
	/**
	 * double interest
	 */
	private double interes;
	/**
	 * Double balance
	 */
	private double saldo;

	// Constructor por defecto
	/**
	 * Constructor by default
	 */
	public Cuenta() {
	}

	// Constructor con par�metros
	/**
	 * Constructor with parameters
	 * @param nombre
	 * @param numero_cuenta
	 * @param interes
	 * @param saldo
	 */
	public Cuenta(String nombre, String numero_cuenta, double interes, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numero_cuenta;
		this.interes = interes;
		this.saldo = saldo;

	}
	
	// Constructor copia
	/**
	 * Duplicate constructor Account
	 * @param c
	 */
	public Cuenta(final Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		interes = c.interes;
		saldo = c.saldo;
	}

	// get y set
	/**
	 * name setter
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * name getter
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * account number setter
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * account number getter
	 * @return
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * interest setter
	 * @param interes
	 */
	public void setInteres(double interes) {
		this.interes = interes;

	}
	/**
	 * interest getter
	 * @return
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * balance setter
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * balance getter
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	// M�todo ingreso
	/**
	 * Income method
	 * @param cantidad
	 * @return
	 */
	public boolean ingreso(double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
			return true;
		} else {
			return false;
		}
	}

	// M�todo reintegro
	/**
	 * Expense method
	 * @param cantidad
	 * @return
	 */
	public boolean reintegro(double cantidad) {
		if (saldo >= cantidad) {
			saldo = saldo - cantidad;
			return true;
		} else {
			return false;

		}
	}

	// M�todo transferencia
	/**
	 * Transference method
	 * @param c
	 * @param cantidad
	 * @return
	 */
	public boolean transferencia(Cuenta c, double cantidad) {
		boolean correcto = true;
		if (cantidad < 0 || saldo < cantidad) {
			correcto = false;
		} else {
			reintegro(cantidad);
			c.ingreso(cantidad);

		}
		return correcto;
	}
}