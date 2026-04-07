import java.util.Scanner;


public class ejercicioextrajuego3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secreto = ("hola");
        String palabra = ("");
        int intentos = 5;

        for (int i = 0; i < secreto.length();i++) {
            palabra = palabra + "_ ";
        }

        do {
        System.out.println("Palabra: " + palabra);
        System.out.println("Intentos restantes :" + intentos);
        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);

        for (int i = 0; i < secreto.length();i++) {
            if (letra == i) {
                palabra = palabra + letra;
            }
            else
                System.out.println("Letra incorrecta! ");
                intentos--;
        }

        
        
        } while (intentos > 0);


        sc.close();
    }
    
}
