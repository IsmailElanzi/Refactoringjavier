package Refactoring;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos números deseas introducir? ");
        int n = scanner.nextInt();
        
        //Crear un arreglo para almacenar los números
        double[] numeros = new double[n];  // Usamos 'double' para permitir decimales si es necesario
        
        //Solicitar los números al usuario
        System.out.println("Introduce " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();  // Leer cada número e introducirlo en el arreglo
        }

        double suma = 0;
        double resta = numeros[0];  // Comenzamos con el primer número para hacer la resta acumulada
        double multiplicacion = 1;
        double division = numeros[0];  // Comenzamos con el primer número para hacer la división acumulada
        
        // Paso 4: Realizar las operaciones
        for (int i = 0; i < n; i++) {
            suma += numeros[i];  // Sumar el número actual
            
            if (i > 0) {
                resta -= numeros[i];  // Restar el número actual
            }
            
            multiplicacion *= numeros[i];  // Multiplicar el número actual
            
            if (numeros[i] != 0) {
                division /= numeros[i];  // Dividir el número actual (manejo de división por cero más adelante)
            } else {
                // Si el número es cero, marcarlo como un error
                System.out.println("Advertencia: No se puede dividir entre cero.");
                division = Double.NaN;  // Asignamos NaN (Not a Number) a la división
            }
        }

        // Paso 5: Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Suma de los números: " + suma);
        System.out.println("Resta de los números: " + resta);
        System.out.println("Multiplicación de los números: " + multiplicacion);
        if (Double.isNaN(division)) {
            System.out.println("División de los números: Error (división por cero).");
        } else {
            System.out.println("División de los números: " + division);
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}