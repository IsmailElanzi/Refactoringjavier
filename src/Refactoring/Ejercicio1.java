package Refactoring;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		  double[] numeros = new double[5];
	        
	        System.out.println("Por favor, introduce 5 números decimales:");

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextDouble();
	        }

	        System.out.println("Los números que introdujiste son:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
	        }
	        
	        scanner.close();
	}
}