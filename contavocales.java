import java.util.Scanner;

public class contavocales {

    public static int contVocales(String palabra, char letra) {
        int cont = 0;

        for (int i = 0; i < palabra.length(); i++) {
            
            if (Character.toLowerCase(palabra.charAt(i))== letra) {
                cont++;
            }

        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = sc.next();

        char letra = palabra.charAt(0);

        

        System.out.println("La palabra" + palabra + " tiene " + letra + contVocales(palabra, letra) + " veces");
    }



}
