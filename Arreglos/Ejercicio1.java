package Arreglos;

/*Armar un vector con 10 valores enteros en la inicialización. Hallar la sumatoria de los 
valores. Si prueba con los pares comenzando en 2, la suma debe dar 110. */


public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int numeroActual = 0;
        for(int i = 0; i < numeros.length; i++) {

            numeroActual = numeroActual + numeros[i];

        }

        System.out.print(numeroActual);


    }
}
