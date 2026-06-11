package ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;

/*Dadas dos listas enlazadas programe una función que arme una nueva lista que contenga la 
concatenación de los elementos de la primer lista, seguida de los de la segunda.
1. Variante a: las dos listas originales se pierden, es decir, nuestra rutina las vacía.
2. Variante b: las dos listas originales quedan inalteradas */

public class Ejercicio4 {

    static void concatenacionVarianteB(LinkedList<Integer> primero, LinkedList<Integer> segundo, LinkedList<Integer> concatenada){
        for(Integer numero: primero){
            concatenada.add(numero);
        }
        for(Integer numero: segundo){
            concatenada.add(numero);
        }
    }

    static void concatenacionVarianteA(LinkedList<Integer> primero, LinkedList<Integer> segundo, LinkedList<Integer> concatenada){
        while (!primero.isEmpty()) {
            concatenada.add(primero.pop());
            
        }
        while (!segundo.isEmpty()) {
            concatenada.add(segundo.pop());
            
        }
    }

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

        //variante b

        

        concatenacionVarianteB(lista1, lista2, lista3);

        System.out.println(lista3);

        System.out.println(lista1);

        System.out.println(lista2);



        System.out.println("termino aca el recorrido");

        //variante a

        lista1.clear();
        lista2.clear();
        lista3.clear();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        concatenacionVarianteA(lista1, lista2, lista3);

        System.out.println(lista3);
        System.out.println(lista1);
        System.out.println(lista2);






    }


    
}
