package reto1;

public class Funciones2 {
	
	public static int resta(int n1, int n2) {
		return n1 - n2;   
	}
	
	public static int dividir(int a, int b) {
		return a / b;  
	}
	
	public static boolean esImpar(int n1) {
		if (n1 % 2 != 0) {
			return true;
			
		}else {
			return false;
		} 
		
	}
	
	public static boolean esNegativo(int n1) {
		if (n1 < 0) {
			return true;
		}else {
			return false;
		}
	}
}
