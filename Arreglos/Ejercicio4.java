package Arreglos;
import java.util.Scanner;
import java.util.Arrays;

/*Se tiene un vector de 8 elementos enteros. Sus valores deben cargarse por consola en forma 
estrictamente creciente, verificando y volviendo a pedir un valor si no cumple la condición 
(Arme una función de carga con verificación).*/ 


public class Ejercicio4 {


    static String diferenciaMaxDos(int [] lista){

        int maxDif = -1;
            int indi1 = -1;
            int indi2 = -1;

        for(int i = 1; i < lista.length; i++){
            
            if(maxDif < Math.abs(lista[i] - lista[i-1])){
                maxDif = Math.abs(lista[i]-lista[i-1]);
                indi2 = i;
                indi1 = i-1;
            }
            else if (maxDif == Math.abs(lista[i] - lista[i-1])) {
                indi2 = i;
                indi1 = i-1;
            }
        }

        return "La maxima diferencia es: " + maxDif + " se da entre los elementos(ultima diferencia) " + indi1 + " y " + indi2;
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] numeros = new int[8];

    for(int i = 0; i < numeros.length; i++){
        
        System.out.println("Ingrese un numero: ");

        int numUser = sc.nextInt();
        if (i == 0) {
            numeros[i] = numUser;
        }
        else if (numUser > numeros[i-1]) {
            numeros[i] = numUser;
            
        }else{
            i--;
            System.out.println("Ingrese un numero mayor");
        }



    }

    System.out.println(Arrays.toString(numeros));
    System.out.println(diferenciaMaxDos(numeros));



    sc.close();
}
}
