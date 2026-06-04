package Arreglos;

/* Defina y de valores a una matriz de doubles de 4 filas y 3 columnas. Llame a una función 
que acepte matrices de tipo double que devuelva el promedio de los elementos en la matriz. */

public class Ejercicio7 {

    static double promedioArray(double[][] array){
        
        double totalElementos = 0;
         
        int contadorElementos = 0;    

        for (int i = 0 ; i < array.length ; i++){
            
            for(int j = 0 ; j < array[i].length; j++){
                totalElementos = totalElementos + array[i][j];
                contadorElementos ++;
            }
            
        }

        double resultadoArray = totalElementos/contadorElementos;

        return resultadoArray;
    }

    
    public static void main(String[] args){

        double [][] notas = { { 7 , 7 , 7 },
                              { 8 , 8 , 8 },
                              { 9 , 9 , 9 },
                              { 10 , 10 , 10 } };
                              
      
        System.out.println(promedioArray(notas));
    }
    
}
