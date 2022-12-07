package clases;
/**
 * Pizza class
 * @author aleleotta
 */
public class Pizza {
	/**
	 * int ordered
	 */
	private static int totalPedidas = 0;
	/**
	 * int served
	 */
	private static int totalServidas = 0;
	/**
	 * String size
	 */
	private String tamano;
	/**
	 * String type
	 */
	private String tipo;
	/**
	 * String status
	 */
	private String estado;
	/**
	 * Constructor with parameters type and size.
	 * @param tipo
	 * @param tamano
	 */
	public Pizza(String tipo, String tamano) {
		this.tipo = tipo;
		this.tamano = tamano;
		this.estado = "pedida";
		Pizza.totalPedidas++;
	}
	/**
	 * toString method
	 */
	public String toString() {
		return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
	}
	/**
	 * Orders total getter
	 * @return
	 */
	public static int getTotalPedidas() {
		return Pizza.totalPedidas;
	}
	/**
	 * Served total getter
	 * @return
	 */
	public static int getTotalServidas() {
		return Pizza.totalServidas;
	}

	/**
	 * Cambia el estado de la pizza de pedida a servida En caso de que la pizza se
	 * hubiera servido ya y se intenta servir de nuevo, se muestra el mensaje esa
	 * pizza ya se ha servido
	 */
	public void sirve() {
		if (this.estado.equals("pedida")) {
			this.estado = "servida";
			Pizza.totalServidas++;
		} else {
			System.out.println("esa pizza ya se ha servido");
		}
	}
}