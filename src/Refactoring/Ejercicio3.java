package Refactoring;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        // Solicitar al usuario la cantidad de números que quiere introducir
        System.out.print("Cuantos números deseas introducir ");
        int cantidad = sc.nextDouble();
        
        // Crear un arreglo para almacenar los números
        int[] numeros = new int[cantidad]; 
        
        // Solicitar los números al usuario y almacenarlos en el array
        System.out.println("Introduce " + cantidad + " numeros:");
        for (int i = 0; i <= cantidad; i++) { 
            System.out.println("Numero " + (i + 1) + ": "); 
            numeros[i] = sc.nextInt(); 
        }
        
        // Números en orden inverso
        System.out.println("\nLos numeros en orden inverso son:");
        for (int i = cantidad; i >= 0; i--) { 
            System.out.print(numeros[i] + " "); 
        }
        
        sc.close();
    }
}