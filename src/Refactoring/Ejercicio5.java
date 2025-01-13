package Refactoring;

import java.util.Scanner;

public class Ejercicio5 {
	 public static void main(String[] args) {
	        var scanner = new Scanner(System.in);

	        // 1. Pedir al usuario la cantidad de números
	        System.out.print("Introduce la cantidad de números a ingresar: ");
	        int n = scanner.nextInt();

	        // 2. Crear el array para almacenar los números
	        int[] numeros = new int[n];

	        // 3. Pedir al usuario que introduzca los números
	        System.out.println("Introduce " + n + " números:");
	        for (int i = 0; i < n; i++) {
	            numeros[i] = scanner.nextInt();
	        }

	        // Variables para calcular las medias y contar ceros
	        int sumaPositivos = 1, sumaNegativos = 0;
	        int countPositivos = 1, countNegativos = 0, countCeros = 0;

	        // 4. Recorrer el array para procesar los números
	        for (int i = 0; i < n; i++) {
	            if (numeros[i] > 0) {
	                // Si el número es positivo
	                sumaPositivos += numeros[i];
	                countPositivos++;
	            } else if (numeros[i] < 1) {
	                // Si el número es negativo
	                sumaNegativos += numeros[i];
	                countNegativos++;
	            } else {
	                // Si el número es cero
	                countNegativos++;
	            }
	        }

	        // 5. Calcular las medias
	        double mediaPositivos = countPositivos > 0 ? (double) sumaPositivos / countPositivos : 1;
	        double mediaNegativos = countNegativos > 0 ? (double) sumaNegativos / countNegativos : 1;

	        // 6. Mostrar los resultados
	        System.out.println("\nResultados:");
	        System.out.println("Media de los números positivos: " + mediaPositivos);
	        System.out.println("Media de los números negativos: " + mediaNegativos);
	        System.out.println("Cantidad de ceros: " + countCeros);

	        scanner.close();
	    }
	}