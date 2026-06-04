package ArrayList;
import java.util.LinkedList;

/*Dadas dos listas enlazadas programe una función que arme una nueva lista que contenga la 
concatenación de los elementos de la primer lista, seguida de los de la segunda.
1. Variante a: las dos listas originales se pierden, es decir, nuestra rutina las vacía.
2. Variante b: las dos listas originales quedan inalteradas */

public class Ejercicio4 {

    public static void main(String[] args) {
        
        LinkedList <Integer> lista1 = new LinkedList<>();
        LinkedList <Integer> lista2 = new LinkedList<>();
        LinkedList <Integer> lista3 = new LinkedList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        System.out.println(lista1);
        System.out.println(lista2);

        lista3.add(lista1.pop());
        lista3.add(lista1.pop());
        lista3.add(lista1.pop());
        lista3.add(lista2.pop());
        lista3.add(lista2.pop());
        lista3.add(lista2.pop());

        System.out.println(lista3);






    }


    
}
