package boletin2.Ejercicio4;

/**
 * Clase que almacena las pizzas pedidas en un restaurante con su código unico para cada pizza, tmaño, tipo y estado
 */
public class Pizza {
	enum Tamaño {
		MEDIANA, FAMILIAR
	}
	
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}
	
	enum Estado {
		PEDIDA, SERVIDA
	}
	/**
	 * Codigo de la pizza
	 */
	private int codigo;
	
	/**
	 * Tamaño de la pizza
	 */
	private Tamaño tamaño = Tamaño.MEDIANA;
	
	/**
	 * Tipo de la pizza
	 */
	private Tipo tipo = Tipo.MARGARITA;
	
	/**
	 * Estado de la pizza
	 */
	private Estado estado = Estado.PEDIDA;
	
	public Pizza(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Constructor con el código, tamaño y tipo de la pizza
	 * @param codigo codigo de la pizza
	 * @param tamaño tamaño de la pizza
	 * @param tipo tipo de la pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		this.codigo = codigo;
		comprobarTamaño(tamaño.toUpperCase());
		comprobarTipo(tipo.toUpperCase());
	}
	
	/**
	 * Getter para el código de la pizza
	 * @return código de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Getter para el tamaño de la pizza
	 * @return tamaño de la pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * Getter para el tipo de la pizza
	 * @return tipo de la pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Getter para el estado de la pizza
	 * @return Estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Setter para el estado de la pizza, solo se puede cambiar a servida
	 * @param estado que queremos ponerle a la pizza, solo funcionará si este estado es servida 
	 */
	public void setEstado(String estado) {
		if (estado.equalsIgnoreCase("servida")) {
			this.estado = Estado.SERVIDA;
		}
	}
	
	
	/**
	 * Método toString para pasar los atributos de la pizza
	 * @return cadena con los atributos de la pizza
	 */
	@Override
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}
	
	/**
	 * Método equals para comparar si dos pizzas son iguales
	 * @return true en caso de que sus códigos sean iguales, false en caso de que no lo sean
	 */
	@Override
	public boolean equals(Object obj) {
		Pizza other = (Pizza) obj;
		return codigo == other.codigo;
	}

	/**
	 * Método para comprobar que el tamaño pertenece a alguno de los tamaños posibles
	 * @param tamaño tamaño que queremos comprobar
	 */
	private void comprobarTamaño(String tamaño) {
		switch (tamaño) {
		case "MEDIANA", "FAMILIAR" -> this.tamaño = Tamaño.valueOf(tamaño);
		}
	}
	
	/**
	 * Método para comprobar que el tipo pertenece a alguno de los tipos posibles
	 * @param tipo tipo que queremos comprobar
	 */
	private void comprobarTipo(String tipo) {
		switch (tipo) {
		case "MARGARITA", "CUATRO_QUESOS", "FUNGHI" -> this.tipo = Tipo.valueOf(tipo);
		}
	}
	
}
