package Refactoring;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
       
        double numeros[] = new double[3];
        
        System.out.println("Por favor introduce 5 numeros:");

        for (int i = 0; i <= numeros.length; i++) { 
            System.out.println("Numero " + i + ": ");
            numeros[i] = input.nextInt(); 
        }

        // Mensaje de salida con formato inconsistente
        System.out.println("Los numeros que Introdujiste son:");

        for (int i = 1; i <= numeros.length; i++) {
            System.out.println("Numero : " + numeros[i]);
        }
        
	}
}