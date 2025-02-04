package boletin1.Ejercicio3;
/**
 * Clase Rectangulo en la que vamos a almacenar rectángulos con los atributos x1,x2,y1,y2 que representan dos esquinas de este.
 */
public class Rectangulo {
	/**
	 * Coordenada x1
	 */
	int x1 = 0;
	/**
	 * Coordenada y1
	 */
	int y1 = 0;
	/**
	 * Coordenada x2
	 */
	int x2 = 1;
	/**
	 * Coordenada y2
	 */
	int y2 = 1;
	
	/**
	 * Constructor de la clase Rectangulo con todas las variables
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
	
}
