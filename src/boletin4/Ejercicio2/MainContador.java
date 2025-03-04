package boletin4.Ejercicio2;

public class MainContador {

	public static void main(String[] args) {
		Contador cont = new Contador(1);
		System.out.println(cont);
		cont.decrementar();
		System.out.println(cont);
		cont.decrementar();
		System.out.println(cont);
		for (int i = 0 ; i <= 100 ; i++) {
			cont.incrementar();
		}
		System.out.println(cont);

	}

}
