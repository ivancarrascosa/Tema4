package boletin1.Ejercicio4;
/**
 * Clase artículo en la que vamos a tener los atributos nombre, precio, iva y cuantosQuedan
 */
public class Articulo {
	/**
	 * Nombre del producto
	 */
	private String nombre;
	/**
	 * Precio del producto
	 */
	private double precio = 0;
	/**
	 * IVA del producto
	 */
	public static final double IVA = 1.21;
	/**
	 * Cuantas unidades quedan del prodcuto
	 */
	private int cuantosQuedan = 0;
	
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
	
	/**
	 * Get para obtener el nombre de un artículo
	 * @return nombre del artículo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método para cambiar el nombre de un artículo
	 * @param nombre nombre que queremos establecer al artículo
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank() ) {
			this.nombre = nombre;
		}
	}
	/**
	 * Obtener el precio de un artículo
	 * @return el precio del artículo
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Setter para cambiar el precio de un producto
	 * @param precio que queremos establecer
	 */
	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}
	/**
	 * Getter para las unidades que quedan de un artículo
	 * @return las unidades que quedan de un artículo
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	/**
	 * Setter para cambiar las unidades que quedan de un artículo
	 * @param cuantosQuedan las unidades que queremos establecer que quedan de un artículo
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
	

}
