package ArrayList;
import java.util.LinkedList;

/*Dada una pila programe una función swap que inverta los dos elementos tope. Si la pila 
tiene 1, 2, 3 luego de llamar a esta función tendrá 2, 1 , 3. Si la pila tiene menos de dos 
elementos la función la deja inalterada. */

public class Ejercicio2 {

    static void swap(LinkedList<Integer> lista){

        if (lista.size()>2) {
            int cambio1 = lista.pop();
            int cambio2 = lista.pop();

            lista.push(cambio1);
            lista.push(cambio2);

        }

    }
    
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.push(3);
        numeros.push(2);
        numeros.push(1);
        System.out.println(numeros);
        swap(numeros);
        System.out.println(numeros);

    }
    
}
