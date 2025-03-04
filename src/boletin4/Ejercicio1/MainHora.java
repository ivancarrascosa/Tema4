package boletin4.Ejercicio1;

public class MainHora {

	public static void main(String[] args) {
		Hora hora1 = new Hora(23,59,59);
		System.out.println(hora1);
		hora1.incrementarSegundo();
		System.out.println(hora1);

	}

}
