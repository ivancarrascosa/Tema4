package boletin3.Ejercicio3;

public class SumaEnterosClase {
	public static int sumaEnteros (int i) {
		int res;
		if (i == 1) {
			res = 1;
		} else {
			res = i + (sumaEnteros(i-1));
		}
		return res;
	}
	
	public static int sumaEnteros (int i, int j) {
		int res = 0;
		int max;
		int min;
		if (i > j) {
			max = i;
			min = j;
		} else {
			max = j;
			min = i;
		}
		for (int x = min ; x <= max ; x++) {
			res += x;
		}
		return res;
	}
}
