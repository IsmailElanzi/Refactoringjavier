package Refactoring;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        //Solicitar al usuario la cantidad de números que quiere introducir
        System.out.print("¿Cuántos números deseas introducir? ");
        int cantidad = scanner.nextInt();  // Leer la cantidad de números
        
        //Crear un arreglo para almacenar los números
        int[] numeros = new int[cantidad];  // El arreglo tendrá tamaño 'cantidad'
        
        //Solicitar los números al usuario y almacenarlos en el array
        System.out.println("Introduce " + cantidad + " números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();  //introducirlo en el arreglo
        }
        
        //números en orden inverso
        System.out.println("\nLos números en orden inverso son:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");  // Imprimir los números desde el último hasta el primero
        }
        
        scanner.close();
    }
}