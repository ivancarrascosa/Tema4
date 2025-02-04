package boletin1.Ejercicio4;

public class MainArticulo {

	public static void main(String[] args) {
		// Creo un objeto de la clase Articulo
		Articulo pijama = new Articulo("pijama", 24.5, 50);
		Articulo cosas = new Articulo("cosaaa", 64, 0);
		/* Asigno valores a los atributos
		pijama.nombre = "pijama";
		pijama.precio = 24.5;
		pijama.cuantosQuedan = 50;
		Esto es del ejercicio anterior
		*/
		System.out.println("Precio:" + pijama.precio + "€ - IVA:21% - " + "PVP:" + pijama.precio*pijama.IVA + "€");
		pijama.precio = 10;
		System.out.println("Precio:" + cosas.precio + "€ - IVA:21% - " + "PVP:" + cosas.precio*cosas.IVA + "€");
	}

}
