package Arreglos;

/* En un vector de 10 elementos encontrar los dos valores máximos, o sea el más grande y el 
que le siga. Cargue el vector en la declaración. Si inicializa con los datos: 6, 1, 3, 7, 9, 4, 10, 
2, 8, 5 el máximo es 10 en la posición 6 y el segundo es 9 en la posición 4. En la función 
que encuentra los dos mayores, verifique con una precondición que haya al menos 2 
elementos. */

public class Ejercicio5 {

static String valMaximo(int[]lista){
    int indice1 = -1;
    int indice2 = -1;
    int valor1 = Integer.MIN_VALUE;
    int valor2 = Integer.MIN_VALUE;


    if (lista.length >= 2) {
    for(int i = 0; i < lista.length; i++){
        
        if (lista[i] > valor1) {
            valor2 = valor1;
            indice2 = indice1;
            
            valor1 = lista[i];
            indice1 = i;
        }
        else if(lista[i]> valor2 && i != indice1){
            valor2 = lista[i];
            indice2 = i;

        }
    }
    }
    else{
        return ("No se pueden comparar, faltan elementos");
    }

    
    return ("El valor maximo es : "+valor1+" y su indice es : "+indice1+" El segundo : "+valor2+" indice: "+indice2);  
}

    
public static void main(String[] args) {
    int[] numeros = {6, 1, 3, 7, 9, 4, 10, 2, 8, 5};

    System.out.print(valMaximo(numeros));
}

}
