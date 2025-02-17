package boletin3.Ejercicio4;

public class ParseToBooleanClase {
	public static boolean parseToBoolean(int i) {
		boolean res = true;
			if (i == 1) {
				res = true;
			} else if (i == 0) {
				res = false;
			}
		return res;
	}
	
	public static boolean parseToBoolean(String s) {
		boolean res = true; 
		if (s.equals("true")) {
			res = true;
		} else if (s.equals("false")) {
			res = false;
		}
		return res;
	}
}
