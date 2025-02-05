package boletin1.ejercicio1;

/**
 * Clase en la que vamos a almacenar puntos en espacios de dos dimensiones con
 * sus dos coordenadas
 */
public class Punto {
	/**
	 * La coordenada x del punto
	 */
	int x;
	/**
	 * La coordenada y del punto
	 */
	int y;

	/**
	 * Constructor con todos los parámetros del objeto
	 * 
	 * @param x coordenada x del punto
	 * @param y coordenada y del punto
	 */
	Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Getter de la coordenada x del punto
	 * 
	 * @return coordenada x del punto
	 */
	public int getX() {
		return x;
	}

	/**
	 * Setter para establecer una nueva coordenada x al punto
	 * 
	 * @param x coordenada x que se desea establecer al punto
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Getter de la coordenada y del punto
	 * 
	 * @return coordenada y del punto
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter para establecer una nueva coordenada y al punto
	 * 
	 * @param y coordenada y que se desea establecer al punto
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Setter para establecer las dos coordenadas de un punto
	 * 
	 * @param x coordenada x del punto
	 * @param y coordenada y del punto
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Método para trasladar un punto
	 * 
	 * @param dx movimiento que tendrá en el eje x
	 * @param dy movimiento que tendrá en el eje y
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	/**
	 * Método que calcula la distancia entre 2 puntos en el plano cartesiano
	 * 
	 * @param p punto con el que queremos calcular la distancia
	 * @return distancia entre los dos puntos
	 */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	/**
	 * Método para devolver las cordenadas de un punto de la forma "(x,y)"
	 * @return Coordenadas del punto
	 */
	public String toString() {
		return ("(" + this.x + "," + this.y + ")");
	}

}
