package boletin3.Ejercicio6;

public class FuncionesMatematicas {
	
	public static int sumatorio(int n) {
		int res = 0;
		if (n == 1) {
			res = 1;
		} else {
			res = n + sumatorio(n-1);
		}
		return res;
	}
	
	public static double potencia(double a, int n) {
		double res = 0;
		if (n == 1) {
			res = a;
		} else {
			res = a*(potencia(a,n-1));
		}
		return res;
	}
	
	public static int serieFibonacci(int n) {
		int res = 0;
		if (n == 0) {
			res = 1;
		} else if (n == 1) {
			res = 1;
		} else {
			res = serieFibonacci(n-1) + serieFibonacci(n-2);
		}
		return res;
	}
	
}
