package ArrayList;
import java.util.List;
import java.util.LinkedList;

/*Similar al ejercicio anterior (programe solo la variante b) pero en lugar de concatenar 
intercale. Por ejemplo si la primer lista tiene 1, 2, 3 y la segunda lista tiene 5, 6, 7, 8, 9 la 
lista resultante debe ser 1, 5, 2, 6, 3, 7, 8, 9 */

public class Ejercicio5 {

    static void intercalar(List<Integer> primero, List<Integer> segundo, List<Integer> intercalada){
        

        int contador1 = 0;
        int contador2 = 0; 

        while (contador1 != primero.size() || contador2 != segundo.size()) {

            if (contador1 != primero.size()) {
                intercalada.add(primero.get(contador1));
                contador1++;
            }

            if (contador2 != segundo.size()) {
                intercalada.add(segundo.get(contador2));
                contador2++;
            }
            
        }


    }


    public static void main(String[] args) {
        
        
        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new LinkedList<>();
        List<Integer> lista3 = new LinkedList<>();


        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        System.out.println(lista1);

        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);

        System.out.println(lista2);


        intercalar(lista1, lista2, lista3);
        
        System.out.println(lista3);




    }
    
}
