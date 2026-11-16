package reto1;

public class Funciones1 {
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int multiplicar(int a, int b) {
		return a*b;
	}
	
	public static boolean esPar(int a) {
		if (a%2==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean esPositivo(int a) {
		if (a>=0) {
			return true;
		}
		else {
			return false;
			
		}
	}

}
