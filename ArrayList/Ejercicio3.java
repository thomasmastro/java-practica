package ArrayList;
import java.util.LinkedList;

/*Dada una pila programe un función rot (por rotar) tal que si la lista tiene al menos 3 
elementos ponga el tercero al tope y sino deje inalterada la pila. Ejemplo, si la tiene 1, 2, 3, 4 
luego de llamar a esta función la pila quedará: 3, 1, 2, 4 */

public class Ejercicio3 {

    static void rot(LinkedList<Integer> lista){
        if (lista.size()>= 3) {

            int primero = lista.pop();
            int segundo = lista.pop();
            int tercero = lista.pop();

            lista.push(segundo);
            lista.push(primero);
            lista.push(tercero);
            
        }
    }

    public static void main(String[] args) {
        
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.push(4);
        numeros.push(3);
        numeros.push(2);
        numeros.push(1);

        System.out.println(numeros);

        rot(numeros);

        System.out.println(numeros);

    }
    
}
