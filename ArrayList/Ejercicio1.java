package ArrayList;
import java.util.LinkedList;

/*1. Dada una pila programe una función dup (por duplicar) que reciba la pila y duplique el 
elemento que está en el tope (a menos que la pila esté vacía). Por ejemplo si la pila un 1 al 
tope seguido más abajo de un 2 (Notación: 1, 2) luego de invocar esta función debe tener 1, 
1, 2 */

public class Ejercicio1{
    
    static void dup(LinkedList<Integer> lista){

        
        if (lista.size() > 0) {
            int duplicado = lista.peek();
            lista.push(duplicado);
        }
    }

    public static void main(String[] args){
        
        LinkedList<Integer> pila = new LinkedList<>();
        
        pila.push(2);
        pila.push(1);
        
        System.out.println("La pila :" + pila);

        dup(pila);

        System.out.println("La pila :" + pila);

    }

}