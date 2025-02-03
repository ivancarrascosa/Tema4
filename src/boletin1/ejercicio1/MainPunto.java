package boletin1.ejercicio1;

public class MainPunto {

	public static void main(String[] args) {
		// Creo tres objetos de la clase Punto
		Punto pun1 = new Punto();
		Punto pun2 = new Punto();
		Punto pun3 = new Punto();
		
		// Les doy valores a sus atributos
		pun1.x = 5;
		pun2.x = 10;
		pun2.y = 10;
		pun3.x = -3;
		pun3.y = 7;
		
		// Imprimo los valores
		System.out.println(pun1.x + "," + pun1.y);
		System.out.println(pun2.x + "," + pun2.y);
		System.out.println(pun3.x + "," + pun3.y);
		
		// Pruebo varios operadores
		pun2.x *= 5; 
		pun2.y -= 13; 
		System.out.println(pun2.x + "," + pun2.y);
		
	}

}
