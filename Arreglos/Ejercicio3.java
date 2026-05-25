package Arreglos;

/*Cargar  un vector con los promedios anuales (pueden tener decimales) de las notas de  10 
alumnos. Informe el promedio de todas esas notas (calculado por una función) y cuantos 
alumnos estuvieron por encima del promedio (calculado por otra función). Si lee del archivo 
datos03.txt el promedio es 7,492 y la cantidad de alumnos que superan el promedio es 6.
Nota: En la función que calcula el promedio verifique la precondición de que haya 
elementos.*/ 

//se puede ajustar su eficiencia

public class Ejercicio3 {

    public static double promedio (double[] notas){
        double notasTotal = 0;
        int notasCant = 0;
        double promedioNotas = 0;
        for(int i = 0;  i < notas.length; i++){
            notasTotal = notasTotal + notas[i];
            notasCant ++;
        }

        if (notasCant > 0) {
            promedioNotas = notasTotal/notasCant;
        }
        else {
            promedioNotas = 0;
        }
        
        return promedioNotas;
    }

    public static double cantidadAprobados(double[] notas, double condicion){

        int contadorAprob = 0;

        for(int i = 0;  i < notas.length; i++){

            if (notas[i]>condicion) {

                contadorAprob++;
            }

        }


        return contadorAprob;
    }

    public static void main(String[] args) {
        double[] alumnos = {5.73, 6.23, 9.74, 2.11, 9.67, 8.66, 9.94, 5.58, 7.52, 9.74};

        System.out.println("El promedio es de : " + promedio(alumnos));
        System.out.println("Superaron el promedio: " + cantidadAprobados(alumnos, promedio(alumnos)));


    }
    
}
