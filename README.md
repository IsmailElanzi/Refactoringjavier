1. Diseñar un programa que solicite al usuario que introduzca por teclado 5 números
decimales a continuación, debe mostrar los números en el mismo orden que se han
introducido.

3. Desarrollar un programa que rellene un array con los números primos comprendidos
entre 1 y 100 y los muestre en pantalla en orden ascendente. Crea un método que indique
si un número entero es primo o no lo es.

4. Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
los mostrará en el orden inverso al introducido.

5. Introducir por teclado un número n; a continuación solicitar al usuario que teclee n
números. Muestra la suma, resta, multiplicación y división de todos.

6. Introducir por teclado un número n; a continuación solicitar al usuario que teclee n
números. Realizar la media de los números positivos, la media de los negativos y contar
el número de ceros introducidos.

Mejoras realizadas:
Correción de límites en bucles: Ajusté los límites en ambos bucles para que no se excedan del tamaño del array, evitando errores como ArrayIndexOutOfBoundsException.
Tamaño correcto del array: Modifiqué el tamaño del array numeros a 5 para coincidir con el mensaje que solicita 5 números.
Consistencia de tipos: Usé nextDouble() en lugar de nextInt() para garantizar que los datos coincidan con el tipo double del array.
Mensajes mejorados: Mejoré los mensajes para mostrar índices consistentes y más amigables (comenzando desde 1 para el usuario).
