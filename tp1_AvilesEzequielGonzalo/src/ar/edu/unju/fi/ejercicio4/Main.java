package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Ingrese numero: ");
			i = scanner.nextInt();
		} while(i > 10 || i < 0);
		
		int factorial = 1;
		while(i > 0) { 
			factorial *= i--;
		}
		System.out.println("Factorial: "+factorial);
		
		scanner.close();
	}

}