package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		int dia, mes, anio;
		Scanner scanner = new Scanner(System.in);
		Persona p1 = new Persona();
		
		System.out.println("Introduzca Nombre: ");
		p1.setNombre(scanner.next());
		System.out.println("Introduzca DNI: ");
		p1.setDni(scanner.nextInt());

		System.out.println("Introduzca Dia de Nacimiento: ");
		dia =  scanner.nextInt();
		System.out.println("Introduzca mes de Nacimiento: ");
		mes = scanner.nextInt();
		System.out.println("Introduzca año de Nacimiento: ");
		anio = scanner.nextInt();
		p1.setFechaDeNacimiento(LocalDate.of(anio, mes, dia));

		System.out.println("Introduzca Provincia: ");
		p1.setProvincia(scanner.next());

		
		p1.mostrarCampos();
		System.out.println("**********");		
		System.out.println("SEGUNDA PERSONA");
		System.out.println("**********");
		System.out.println("Nombre: ");
		String nombre = scanner.next();
		System.out.println("DNI: ");
		int dni = scanner.nextInt();
		System.out.println("Introduzca Dia de Nacimiento: ");
		dia =  scanner.nextInt();
		System.out.println("Introduzca mes de Nacimiento: ");
		mes = scanner.nextInt();
		System.out.println("Introduzca año de Nacimiento: ");
		anio = scanner.nextInt();
		System.out.println("Provincia: ");
		String provincia = scanner.next();
		Persona p2 =  new Persona(dni, nombre, LocalDate.of(anio, mes, dia), provincia);
		
		p2.mostrarCampos();
		
		System.out.println("TERCER PERSONA");
		System.out.println("Nombre: ");
		nombre = scanner.next();
		System.out.println("DNI: ");
		dni = scanner.nextInt();
		System.out.println("Introduzca Dia de Nacimiento: ");
		dia =  scanner.nextInt();
		System.out.println("Introduzca mes de Nacimiento: ");
		mes = scanner.nextInt();
		System.out.println("Introduzca año de Nacimiento: ");
		anio = scanner.nextInt();
		
		Persona p3 = new Persona(dni, nombre, LocalDate.of(anio, mes, dia));
		
		p3.mostrarCampos();
		
		scanner.close();
	}

}