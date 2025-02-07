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
	/**
	 * Método para devolver el precio con IVA de un producto
	 * @return Precio con IVA incluido del producto
	 */
	public double getPVP() {
		return (this.precio * Articulo.IVA);
	}
	
	/**
	 * Método para saber el precio de un producto con un porcentaje de descuento (IVA incluido)
	 * @param descuento porcentaje de descuento que le queremos hacer al producto
	 * @return Precio del artículo con el descuento aplicado
	 */
	public double getPVPDescuento(double descuento) {
		return (this.precio * Articulo.IVA * (1 - descuento/100));
	}
	
	/**
	 * Método que representa la venta de un producto y resta la cantidad vendida de la cantidad que queda del artículo
	 * @param cantidad cantidad vendida del Artículo
	 * @return true si es posible vender esa cantidad, false si no hay suficiente stock 
	 */
	public boolean vender(int cantidad) {
		boolean posible = true;
		if (cantidad > this.cuantosQuedan) {
			posible = false;
		} else {
			this.cuantosQuedan = this.cuantosQuedan - cantidad;
		}
		return posible;
	}
	/**
	 * Método que aumenta el stock de un objeto 
	 * @param cantidad unidades en las que queremos aumentar el objeto
	 */
	public void almacenar(int cantidad){
		this.cuantosQuedan += cantidad;
	}
	
	/**
	 * Método que devuelve en un string el nombre del artículo, su precio y las unidades que quedan 
	 * @return String con el nombre del artículo, su precio y cuantos quedan
	 */
	public String toString() {
		return ("Nombre: " + this.nombre + ", precio:" + this.precio + ", cuantos quedan:" + this.cuantosQuedan);
	}
}
