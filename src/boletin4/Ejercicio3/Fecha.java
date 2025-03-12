package boletin4.Ejercicio3;

/**
 * Clase fecha que almacena una fecha con sus constructores y metodos para pasar
 * al dia siguiente, comprobar si el año es bisiesto y comprobar si la fecha es
 * correcta
 */
public class Fecha {
	/**
	 * Dia de la fecha
	 */
	private int dia = 1;
	/**
	 * Mes de la fecha
	 */
	private int mes = 1;
	/**
	 * Año de la fecha
	 */
	private int año = 1970;
	
	/**
	 * Constructor de la fecha con todos los atributos
	 * @param dia de la fecha
	 * @param mes de la fecha
	 * @param año de la fecha
	 */
	public Fecha(int dia, int mes, int año) {
		if (año > 0) {
			this.año = año;
		}
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}

		this.dia = dia;

		if (!this.fechaCorrecta()) {
			this.dia = 1;
		}

	}
	
	/**
	 * Getter para el día
	 * @return día de la fecha
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Getter para el mes
	 * @return mes de la fecha
	 */
	public int getMes() {
		return mes;
	}
	
	/**
	 * Getter para el año
	 * @return año de la fecha
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Metodo que comprueba si el año es bisiesto
	 * @return true si es bisiesto, false si no lo es
	 */
	public boolean esBisiesto() {
		return (this.año % 4 == 0 && this.año % 100 != 0) || this.año % 400 == 0;
	}
	
	/**
	 * Método que comprueba si la fecha es correcta
	 * @return true si lo es, false si no lo es
	 */
	public boolean fechaCorrecta() {
		boolean res = false;
		switch (this.mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (this.dia > 0 && this.dia <= 31) {
				res = true;
			}
		}

		case 4, 6, 9, 11 -> {
			if (this.dia > 0 && this.dia <= 30) {
				res = true;
			}
		}
		case 2 -> {
			if (this.esBisiesto()) {
				if (this.dia > 0 && this.dia <= 29) {
					res = true;
				} else {
					if (this.dia > 0 && this.dia <= 28) {
						res = true;
					}
				}
			}
		}
		}
		
		return res;
	}
	/**
	 * Método que avanz un día en la fecha
	 */
	public void diaSiguiente() {
		this.dia += 1;
		if (!this.fechaCorrecta()) {
			this.dia = 1;
			this.mes += 1;
			if (!this.fechaCorrecta()) {
				this.mes = 1;
				this.año += 1;
			}
		} 
	}
	
	/**
	 * Método que devuelve la fecha en forma de String del tipo dd-mm-yy
	 */
	@Override
		public String toString() {
			return this.dia + "-" + this.mes + "-" + this.año;
		}
}
