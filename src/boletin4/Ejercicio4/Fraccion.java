package boletin4.Ejercicio4;

/**
 * Clase fracción que almacenará fracciones y distintas operaciones que podemos
 * hacer entre ellas
 */
public class Fraccion {
	/**
	 * Numerador de la fracción
	 */
	int num = 0;
	/**
	 * Denominador de la fracción
	 */
	int den = 1;

	/**
	 * Constructor vacío
	 */
	public Fraccion() {
	}

	/**
	 * Constructor con el numerador y el denominador
	 * 
	 * @param num numerador de la fracción
	 * @param den denominador de la fracción
	 */
	public Fraccion(int num, int den) {
		this.num = num;
		if (den != 0) {
			this.den = den;
		}
	}

	/**
	 * Getter del numerador de una fracción
	 * 
	 * @return numerador de la fracción
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Getter del denominador de una fracción
	 * 
	 * @return denominador de la fracción
	 */
	public int getDen() {
		return den;
	}

	/**
	 * Método que realiza la suma de dos fracciones
	 * 
	 * @param frac2 Fracción con la que queremos sumar la fraccion que llama a la
	 *              función
	 * @return suma de las fracciones simplificada
	 */
	public Fraccion suma(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.den = this.den * frac2.den;
		res.num = this.num * frac2.den + frac2.num * this.den;
		res.simplifica();
		return res;
	}

	/**
	 * Método que realiza la resta de dos fracciones
	 * 
	 * @param frac2 Fracción con la que queremos restar la fraccion que llama a la
	 *              función
	 * @return resta de las fracciones simplificada
	 */
	public Fraccion resta(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.den = this.den * frac2.den;
		res.num = this.num * frac2.den - frac2.num * this.den;
		res.simplifica();
		return res;
	}

	/**
	 * Método que realiza la multiplicacion de dos fracciones
	 * 
	 * @param frac2 Fracción con la que queremos multiplicar la fraccion que llama a
	 *              la función
	 * @return resultado de la multiplicación de las fracciones simplificada
	 */
	public Fraccion multiplica(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.den = this.den * frac2.den;
		res.num = this.num * frac2.num;
		res.simplifica();
		return res;
	}

	/**
	 * Método que realiza la division de dos fracciones
	 * 
	 * @param frac2 Fracción con la que queremos dividir la fraccion que llama a la
	 *              función
	 * @return resultado de la división de las fracciones simplificada
	 */
	public Fraccion divide(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.num = this.num * frac2.den;
		res.den = this.den * frac2.num;
		res.simplifica();
		return res;
	}

	/**
	 * Método para simplificar la fracción
	 */
	public void simplifica() {
		// Si el numerador es distinto de 0
		if (num != 0) {
			// Recorro desde 2 (el primero con el que podemos dividir, hasta el mínimo del
			// numerador y el denominador
			for (int i = 2; i <= Math.min(num, den); i++) {
				// Esto es por si se puede dividir mas de una vez entre un número, por ej 8
				// podemos dividirlo 2 veces entre 2, mientras sean divisibles, seguiremos
				// dividiendo entre i
				while (num % i == 0 && den % i == 0) {
					num /= i;
					den /= i;
				}
			}
		}
	}

	/**
	 * Método para devolver una función de la forma: x/y
	 */
	@Override
	public String toString() {
		return num + "/" + den;
	}

}
