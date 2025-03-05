package boletin4.Ejercicio3;

/**
 * Clase fecha que almacena una fecha con sus constructores y metodos para pasar
 * al dia siguiente, comprobar si el año es bisiesto y comprobar si la fecha es
 * correcta
 */
public class Fecha {
	private int dia = 1;
	private int mes = 1;
	private int año = 1970;

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

	public boolean esBisiesto() {
		return (this.año % 4 == 0 && this.año % 100 != 0) || this.año % 400 == 0;
	}

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
	
	@Override
		public String toString() {
			return this.dia + "-" + this.mes + "-" + this.año;
		}
}
