package Arreglos;

/* Dado un vector de double con 7 elementos, armar una función que devuelva el promedio de 
aquellos valores que superen una determinado parámetro (que se pasará a la función).
Reflexione sobre que puede hacer cuando ningún valor supera el parámetro dado.*/


public class Ejercicio2 {

    public static double promedioCondicion(double[] arreglos, double condic) {
    double promed = 0;
    double totalValor = 0;
    int cantValor = 0;
        for (int i = 0; i < arreglos.length; i++){
            if (arreglos[i] > condic) {
                totalValor = totalValor + arreglos[i];
                cantValor ++;
            }
    }
    if (cantValor > 0) {
        promed = totalValor/cantValor;
    }
    
    else {
        promed = 0;
        
    }
    return promed;
    }


    public static void main(String[] args){
        double[] valores = {5.25, 18.75, 6.66, 8.80, 1, 16.47, 12.93};
        System.out.print(promedioCondicion(valores,20));

        
    }

}