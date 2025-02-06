package boletin1.Ejercicio3;

/**
 * Clase Rectangulo en la que vamos a almacenar rectángulos con los atributos
 * x1,x2,y1,y2 que representan dos esquinas de este.
 */
public class Rectangulo {
	/**
	 * Coordenada x1
	 */
	private int x1 = 0;
	/**
	 * Coordenada y1
	 */
	private int y1 = 0;
	/**
	 * Coordenada x2
	 */
	private int x2 = 1;
	/**
	 * Coordenada y2
	 */
	private int y2 = 1;

	/**
	 * Constructor de la clase Rectangulo con todas las variables
	 * 
	 * @param x1 Coordenada x de la esquina inferior izquierda
	 * @param y1 Coordenada y de la esquina inferior izquierda
	 * @param x2 Coordenada x de la esquina superior derecha
	 * @param y2 Coordenada y de la esquina superior derecha
	 */
	Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Get para la coordenada x de la esquina inferior izquierda
	 * 
	 * @return coordenada x de la esquina inferior izquierda
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Cambia el valor de la coordenada de la esquina inferior izquierda
	 * 
	 * @param x1 Coordenada x que queremos poner en la esquina inferior izquierda
	 */
	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}
	/**
	 * Get para la coordenada y de la esquina inferior izquierda
	 * 
	 * @return coordenada y de la esquina inferior izquierda
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * Cambia el valor de la coordenada y de la esquina inferior izquierda
	 * 
	 * @param y1 Coordenada y que queremos poner en la esquina inferior izquierda
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}
	/**
	 * Cambia el valor de la coordenada x de la esquina superior derecha
	 * 
	 * @param x2 Coordenada x de la esquina superior derecha
	 */
	public int getX2() {
		return x2;
	}
	/**
	 * Set para cambiar la coordenada x de la esquina superior derecha del rectángulo
	 * @param x2 coordenada x que queremos establecer para la esquina superior derecha del rectángulo
	 */
	public void setX2(int x2) {
		if (x1 < x2) {
			this.x2 = x2;
		}
	}
	/**
	 * Get para obtener el valor de la coordenada y superior derecha del rectángulo
	 * @return Coordenada y de la esquina superior derecha del rectángulo
	 */
	public int getY2() {
		return y2;
	}
	/**
	 * Set para cambiar la coordenada y de la esquina superior derecha del rectángulo 
	 * @param y2 coordenada y que queremos establecer para la esquina superior derecha del rectángulo
	 */
	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}
	}
	/**
	 * Setter para las dos coordenadas de la esquina inferior izquierda
	 * @param x1 coordenada x de la esquina inferior izquierda
	 * @param y1 coordenada y de la esquina inferior izquierda
	 */
	public void setX1Y1(int x1, int y1) {
		if (x1<x2 && y1<y2) {
			this.x1 = x1;
			this.y1 = y1;
		}
	}
	
	/**
	 * Setter para las dos coordenadas de la esquina superior derecha
	 * @param x2 coordenada x de la esquina superior derecha
	 * @param y2 coordenada y de la esquina superior derecha
	 */
	public void setX2Y2(int x2, int y2) {
		if (x1<x2 && y1<y2) {
			this.x2 = x2;
			this.y2 = y2;
		}
	}
	/**
	 * Método setter para todas las coordenadas de las esquinas inferior izquierda y superior derecha del rectángulo. 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		if (x1<x2 && y1<y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}
	
	/**
	 * Método para obtener el perímetro de un rectángulo
	 * @return Perímetro del rectángulo
	 */
	public int getPerimetro() {
		return (Math.abs(this.x1 - this.x2)*2 +  Math.abs(this.y1 - this.y2)*2);
	}
	
	/**
	 * Método para obtener el área de un rectángulo 
	 * @return Área del rectángulo
	 */
	public double getArea() {
		return (Math.abs(this.x1 - this.x2) * Math.abs(this.y1 - this.y2));
	}
	
	public String toString() {
		return ("(" + this.x1 + "," + this.y1 + ") y (" + this.x2 + "," + this.y2 + ")");
	}

}
