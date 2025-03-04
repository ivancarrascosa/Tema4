package boletin4.Ejercicio4;

public class FraccionMain {

	public static void main(String[] args) {
		Fraccion frac = new Fraccion(7,9);
		Fraccion frac2 = new Fraccion(2,15);		
		System.out.println(frac);
		frac.simplifica();
		System.out.println(frac);
		System.out.println(frac.suma(frac2));

	}

}
