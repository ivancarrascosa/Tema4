package boletin1.Ejercicio4;

public class MainArticulo {

	public static void main(String[] args) {
		// Creo un objeto de la clase Articulo
		Articulo pijama = new Articulo();
		
		// Asigno valores a los atributos
		pijama.precio = 24.5;
		pijama.cuantosQuedan = 50;
		
		System.out.println("Precio:" + pijama.precio + "€ - IVA:21% - " + "PVP:" + pijama.precio*1.21 + "€");
		pijama.precio = 10;
		System.out.println("Precio:" + pijama.precio + "€ - IVA:21% - " + "PVP:" + pijama.precio*1.21 + "€");
	}

}
