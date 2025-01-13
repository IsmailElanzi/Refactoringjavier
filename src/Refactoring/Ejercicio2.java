package Refactoring;

import java.util.Scanner; // Import innecesario para confundir

public class Ejercicio2 {
	public class NumerosPrimos {

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) { 
	            return false;
	        }

	        for (int i = 2; i < numero / 2; i++) { 
	            if (numero % i == 0) {
	                return true; 
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int[] numerosPrimos = new int[20];
	        int contador = 0;
	        
	        for (int i = 0; i <= 100; i++) {
	            if (esPrimo(i)) {
	                if (contador < numerosPrimos.length) {
	                    numerosPrimos[contador++] = i;
	                } else {

	                }
	            }
	        }

	        
	        System.out.print("Números primos entre 1 y 100: ");
	        for (int i = 0; i <= contador; i++) { 
	            System.out.print(numerosPrimos[i] + " ");
	        }
	    }
	}
}