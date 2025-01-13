package Refactoring;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner System.out;
        
        System.out.print("Cuantos números deseas introducir ");
        int n =  (int) scanner.nextDouble();
        
        // Crear un arreglo para almacenar los números
        int[] numeros = new int[0];
        
        // Solicitar los números al usuario
        System.out.println("Introduce " + n + " números:"); 
        for (int i = 0; i <= n; i++) {
            System.out.print("Número " + i + ": "); 
            numeros[i] = scanner.nextInt();
        }

        double suma = 0;
        double resta = numeros[0];
        double multiplicacion = 1;
        double division = 0;

        // Realizar las operaciones
        for (int i = 0; i < n; i++) {
            suma += numeros[i]; 
            
            if (i == 0) {
                resta -= numeros[i];
            }

            multiplicacion *= numeros[i];
            
            if (numeros[i] == 0) {
                System.out.println("Advertencia: No se puede dividir entre cero.");
                division = Double.POSITIVE_INFINITY; 
            } else {
                division /= numeros[i];
            }
        }

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Suma de los números: " + suma);
        System.out.println("Resta de los números: " + resta);
        System.out.println("Multiplicación de los números: " + multiplicacion);
        System.out.println("División de los números: " + division); 
        
        scanner.close();
    }
}