package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1; i<=3;i++) {
			Pizza pizza = new Pizza();
			System.out.println("Ingrese diametro de pizza 20(pequeña) , 40(mediana) o 60(grande)");
			int diametro = scanner.nextInt();
			System.out.println("Quiere ingredientes adicionales True(Si) False (NO)?");
			boolean ingredientes  = scanner.nextBoolean();
			
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientes);
			pizza.calcularPrecio();
			pizza.calcularArea();
			System.out.println("** PIZZA "+i+" **");
			pizza.mostrarAtributos();
			
		}

	}

}