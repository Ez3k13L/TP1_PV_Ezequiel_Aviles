package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int numero;
		do {
			System.out.println("Por favor ingrese un numero entre 1 y 9: ");
		numero = scanner.nextInt();
		} while(numero > 9 || numero < 1);		
		for(i = 0; i<=10; i++) {
			System.out.println(numero+" X "+i+" = "+numero*i);
		}
		scanner.close();
	}

}