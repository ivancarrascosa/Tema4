package boletin2.Ejercicio1;

public class MainCuentaCorriente {

	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("54932030C","Iván", 500, "Española" );
		CuentaCorriente c2 = new CuentaCorriente("54932030C","Iván", 5000, "Española" );
		
		System.out.println(c1.equals(c2));
		c1.ingresarDinero(5);
		System.out.println(c1.getSaldo());
		System.out.println(c1.sacarDinero(100000));
		c1.sacarDinero(405);
		System.out.println(c1.getSaldo());
	}

}
