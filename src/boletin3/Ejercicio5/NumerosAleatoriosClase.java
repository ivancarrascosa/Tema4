package boletin3.Ejercicio5;

import java.util.Random;

public class NumerosAleatoriosClase {
	public static void numerosAleatorios(int x) {
		for (int i = 0 ; i < x ; i++) {
			System.out.println(Math.random());
		}
	}
	
	public static void numerosAleatorios (int x, int y) {
		Random rand = new Random();
		
		for (int i = 0 ; i < x ; i++) {
			System.out.println(rand.nextInt(0,y));
		}
	}
	
	public static void numerosAleatorios (int x, int y, int z) {
		Random rand = new Random();
		
		for (int i = 0 ; i < x ; i++) {
			System.out.println(rand.nextInt(y,z));
		}
	}
	
}
