package boletin1.Ejercicio3;

public class MainRectangulo {

	public static void main(String[] args) {
		// Creamos los dos rectángulos
		Rectangulo rect1 = new Rectangulo(0,0,5,5);
		Rectangulo rect2 = new Rectangulo(7,9,2,3);
		
		/* Asignamos las coordenadas del primer rectángulo
		rect1.x1 = 0;
		rect1.y1 = 0;
		rect1.x2 = 5;
		rect1.y2 = 5;
		
		// Asignamos las coordenadas del segundo rectángulo
		rect2.x1 = 7;
		rect2.y1 = 9;
		rect2.x2 = 2;
		rect2.y2 = 3;
		Esto era del ej anterior
		*/
		// Imprimo las coordenadas de ambos rectángulos
		System.out.println("Las coordenadas del primer rectángulo son:" + "(" + rect1.x1 + "," + rect1.y1 + ") y (" + rect1.x2 + "," + rect1.y2 + ")");
		System.out.println("Las coordenadas del segundo rectángulo son:" + "(" + rect2.x1 + "," + rect2.y1 + ") y (" + rect2.x2 + "," + rect2.y2 + ")");
		
		// Imprimo los perímetros de los rectángulos
		System.out.println("El perímetro del primer rectángulo es: " + (Math.abs(rect1.x1 - rect1.x2)*2 +  Math.abs(rect1.y1 - rect1.y2)*2));
		System.out.println("El perímetro del primer rectángulo es: " + (Math.abs(rect2.x1 - rect2.x2)*2 +  Math.abs(rect2.y1 - rect2.y2)*2));
		
		// Imprimo las áreas
		System.out.println("El área del primer rectángulo es: " + (Math.abs(rect1.x1 - rect1.x2) * Math.abs(rect1.y1 - rect1.y2)));
		System.out.println("El área del primer rectángulo es: " + (Math.abs(rect2.x1 - rect2.x2) * Math.abs(rect2.y1 - rect2.y2)));
	}

}
