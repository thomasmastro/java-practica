package ArregloMemo;
import java.util.Scanner;

public class memo {

    public static boolean comparar(int posi1, int posi2, String[] letras){
        if (letras[posi1].equalsIgnoreCase(letras[posi2])) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] letras = {"a", "a", "b", "b", "c", "c", "d", "d", "e", "e"};
        String[] ocultas = {"*","*","*","*","*","*","*","*","*","*",};

        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        int encontradas = 0;


        do {
        
        for (int i = 0; i < letras.length; i++) {
            System.out.print(i + ":" + ocultas[i] + "  ");
        }
        
        System.out.println("");
        System.out.println("Ingresa 1: ");
        int posi1 = sc.nextInt();
        System.out.println("Ingresa 2: ");
        int posi2 = sc.nextInt();

        if (true == comparar(posi1,posi2,letras)){
                ocultas[posi1] = letras[posi1];
                ocultas[posi2] = letras[posi2];
                encontradas++;

        }
        else {
                System.out.println("MAL ");
                continue;
        }
        intentos++;   
        System.out.println("Intentos: " + intentos);

        }        
        while(encontradas<5);    

        System.out.println("Winner");

            
        
    sc.close();    
    }
        
}
    
