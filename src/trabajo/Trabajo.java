package trabajo;

import java.util.Arrays;
import java.util.Scanner;

public class Trabajo {

    public static void main(String[] args) {
        // Crear un array para almacenar los 10 números
        int[] numeros = new int[10];
        int contadorPares = 0;

        // Crear una única instancia de Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 10 números
        System.out.println("Introduce 10 números enteros:");

        // Leer los números y contar los pares
        contadorPares = leerNumerosYContarPares(numeros, scanner);

        // Ordenar los números de menor a mayor
        Arrays.sort(numeros);

        // Mostrar los números ordenados
        mostrarNumerosOrdenados(numeros);

        // Mostrar la cantidad de números pares e impares
        mostrarCantidadParesEImpares(contadorPares, numeros.length);

        // Cerrar el Scanner
        scanner.close();
    }

    /*
     * Metododo para leer 10 números enteros y contar cuántos son pares.
     * @param numeros Array donde se almacenarán los números.
     * @param scanner Instancia de Scanner para leer la entrada del usuario.
     * @return Cantidad de números pares.
     */
    private static int leerNumerosYContarPares(int[] numeros, Scanner scanner) {
        int contadorPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Contar los números pares
            if (esPar(numeros[i])) {
                contadorPares++;
            }
        }

        return contadorPares;
    }

    /*
     * Metodo para verificar si un numero es par
     *
     * @param numero Número a verificar.
     * @return true si el número es par, false en caso contrario.
     */
    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /*
     * Metodo para mostrar los números ordenados de menor a mayor.
     *@param numeros Array de números ordenados.
     */
    private static void mostrarNumerosOrdenados(int[] numeros) {
        System.out.println("Números ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Salto de línea para mejor formato
    }

    /*
     *Metodo para mostrar la cantidad de numeros pares e impares
     * @param contadorPares Cantidad de números pares.
     * @param totalNumeros  Total de números ingresados.
     */
    private static void mostrarCantidadParesEImpares(int contadorPares, int totalNumeros) {
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + (totalNumeros - contadorPares));
    }
}