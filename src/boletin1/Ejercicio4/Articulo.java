package boletin1.Ejercicio4;
/**
 * Clase artículo en la que vamos a tener los atributos nombre, precio, iva y cuantosQuedan
 */
public class Articulo {
	/**
	 * Nombre del producto
	 */
	String nombre;
	/**
	 * Precio del producto
	 */
	double precio = 0;
	/**
	 * IVA del producto
	 */
	final double IVA = 1.21;
	/**
	 * Cuantas unidades quedan del prodcuto
	 */
	int cuantosQuedan = 0;
	
	/**
	 * Constructor de la clase Artículo sin el iva, que es una constante
	 * @param nombre nombre del producto
	 * @param precio precio del producto
	 * @param cuantosQuedan cuantas unidades del producto quedan 
	 */
	Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.isBlank() && cuantosQuedan >= 0 && precio > 0) {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}
	}

}
