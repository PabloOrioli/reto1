package reto1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Elige la operacion: \n1. Sumar \n2. Resta \n3. Multiplicar \n4. Dividir \n5. Par");
			n = Integer.parseInt(sc.nextLine());
		
		if (n==1) {
			System.out.println(Funciones1.suma(4, 6));
		}
		
		if (n==2) {
			System.out.println(Funciones2.resta(-2, 5));
		}
		
		if (n==3) {
			System.out.println(Funciones1.multiplicar(5, 5));
		}
		
		if (n==4) {
			System.out.println(Funciones2.dividir(2, 6));
		}
		
		if (n==5) {
			System.out.println(Funciones1.esPar(2));
		}
		
		if (n==6) {
			System.out.println(Funciones2.esImpar(5));
		}
		
		if (n==7) {
			System.out.println(Funciones1.esPositivo(10));
		}
		
		if (n==8) {
			System.out.println(Funciones2.esNegativo(-10));
		}
		
		if (n==0) {
			System.out.println("Se acabo");
		}
		} while (!(n == 0 ));

	}

}
