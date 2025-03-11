package boletin4.Ejercicio3;

public class MainFecha {

	public static void main(String[] args) {
		Fecha fechita = new Fecha(29,2,2000);
		System.out.println(fechita);
		fechita.diaSiguiente();
		System.out.println(fechita);
		fechita.diaSiguiente();
		System.out.println(fechita);

	}

}
