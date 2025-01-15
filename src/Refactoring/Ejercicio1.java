package Refactoring;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numeros = new double[5]; // Ajustado para almacenar 5 números correctamente

        System.out.println("Por favor introduce 5 números:");

        for (int i = 0; i < numeros.length; i++) { // Corregido el límite del bucle
            System.out.print("Número " + (i + 1) + ": "); // Mejorado el mensaje
            numeros[i] = input.nextDouble(); // Usar nextDouble para consistencia con el tipo del array
        }

        System.out.println("Los números que introdujiste son:");

        for (int i = 0; i < numeros.length; i++) { // Corregido el límite del bucle
            System.out.println("Número " + (i + 1) + ": " + numeros[i]); // Corregido el índice y mejorado el mensaje
        }

        input.close();
    }
}
