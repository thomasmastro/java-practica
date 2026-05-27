package Arreglos;

/* Defina y de valores a una matriz de doubles de 4 filas y 3 columnas. Llame a una función 
que acepte matrices de tipo double que devuelva el promedio de los elementos en la matriz. */

public class Ejercicio7 {

    public static void main(String[] args){

        double [][] notas = { { 7 , 7 , 7 },
                              { 8 , 8 , 8 },
                              { 9 , 9 , 9 },
                              { 10 , 10 , 10 } };
                              
        double totalFila = 0;
        
        /*creamos un array para almacenar los distintos promedios */
        double[] promedio = new double[notas.length];     

        for (int i = 0 ; i < notas.length ; i++){
            
            for(int j = 0 ; j < notas[i].length; j++){
                totalFila = totalFila + notas[i][j];
                System.out.println(totalFila);
                
            }
            

            
            promedio[i] = totalFila/notas[i].length;
            totalFila = 0;

            System.out.println("El promedio de la fila " + i + " es " + promedio[i]);
           

        }


                              
        
       
        
        




         



        

    }
    
}
