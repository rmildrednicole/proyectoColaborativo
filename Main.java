package PrimerTrimestre.Prueba2;

import java.util.Scanner;

import PrimerTrimestre.Pruebas.alumno;

public class Main {

	public static void main(String[] args) {
		// Clase principal de la clase alumno
		//Prueba clases2
		
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		
		
		System.out.println("Introduzca el nombre y apellido del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca el Nº de expediente del alumno: ");
		String n_exp = sc.nextLine();
		
		System.out.println("Introduzca el DNI del alumno: ");
		String dni = sc.nextLine();
		
		System.out.println("Introduzca la edad del alumno: ");
		int edad = sn.nextInt();
		
		System.out.println("Introduzca nota del alumno: ");
		double nota = sn.nextDouble();
		
		alumno alumno1 = new alumno(nombre, n_exp, dni, edad, nota);
		
		alumno1.mostrarDatos();
		
		if (alumno1.aprobado()==true) {
			System.out.println(alumno1.getNombre()+" esta aprobado");
		}else {
			System.out.println(alumno1.getNombre()+" esta suspenso");
		}
	}
}
