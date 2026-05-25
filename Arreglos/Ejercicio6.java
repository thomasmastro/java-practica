package Arreglos;
import java.util.Scanner;
import java.util.Arrays;

/* Se pide ingresar por teclado 8 valores que se cargarán en un vector, pero se controlará que 
todos los valores sean distintos. Si el valor ingresado ya se encuentra en los cargados 
previamente, vuelva a solicitar el valor para esa posición. DESAFIO usar una versión 
modificada de buscar. */

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean numRepe = false;
        int [] vector1 = new int[8];

        for(int i = 0 ; i < vector1.length; i++){

            

            System.out.println("Ingrese un numero: "); 

            int numNuevo = sc.nextInt();
            
            for(int j = 0; j < i; j++){
            
            if (numNuevo == vector1[j]) {
            numRepe = true;
            break;
            }

        }

        if (numRepe) {
                i--;
                numRepe = false;
                System.out.println("El numero esta repetido ingrese otro ");

            }
            else{
            vector1[i] = numNuevo;
        }

        }

        System.out.println(Arrays.toString(vector1));

    sc.close();    
    }
    
}
