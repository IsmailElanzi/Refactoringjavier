package Refactoring;

import java.util.Scanner;

public class Ejercicio2 {
	public class NumerosPrimos {

	    // Método que determina si un número es primo
	    public static boolean esPrimo(int numero) {
	        if (numero < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        // Array para almacenar los números primos (máximo 25 entre 1 y 100)
	        int[] numerosPrimos = new int[25];
	        int contador = 0;

	        // Rellenar el array con los números primos entre 1 y 100
	        for (int i = 1; i <= 100; i++) {
	            if (esPrimo(i)) {
	                numerosPrimos[contador] = i;
	                contador++;
	            }
	        }

	        // Mostrar los números primos en orden ascendente
	        System.out.println("Números primos entre 1 y 100:");
	        for (int i = 0; i < contador; i++) {
	            System.out.print(numerosPrimos[i] + " ");
	        }
	    }
	}
}