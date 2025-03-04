package boletin4.Ejercicio4;

public class Fraccion {
	int num = 0;
	int den = 1;
	
	public Fraccion() {
	}
	public Fraccion(int num, int den) {
		this.num = num;
		if (den != 0) {
			this.den = den;
		}
	}
	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	
	public Fraccion suma(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.den = this.den*frac2.den;
		res.num = this.num*frac2.den + frac2.num*this.den;
		res.simplifica();
		return res;
	}
	
	public Fraccion resta(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.den = this.den*frac2.den;
		res.num = this.num*frac2.den - frac2.num*this.den;
		res.simplifica();
		return res;
	}
	
	public Fraccion multiplica(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.den = this.den*frac2.den;
		res.num = this.num*frac2.num;
		res.simplifica();
		return res;
	}
	
	public Fraccion divide(Fraccion frac2) {
		Fraccion res = new Fraccion();
		res.num = this.num*frac2.den;
		res.den = this.den*frac2.num;
		res.simplifica();
		return res;
	}
	
	public void simplifica() {
		if (num != 0) {
			for(int i = 2 ; i <= Math.min(num, den) ; i++) {
				while(num%i == 0 && den%i == 0) {
					num /= i;
					den /= i;
				}
			}
		}
	}
	@Override
	public String toString() {
		return num + "/" + den;
	}
	
	
	
}
