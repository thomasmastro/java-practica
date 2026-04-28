package GuiaEjerciciosExtra;
import java.util.Scanner;


public class ejercicioextrajuego3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secreto = ("holo");
        String palabra = ("");
        int intentos = 5;
        int contador = 0;

        for (int i = 0; i < secreto.length();i++) {
            palabra = palabra + "_";
        }

        System.out.println("La palabra tiene "+secreto.length()+ " Letras");
        System.out.println(palabra.length());

        do {
        System.out.println("Palabra: " + palabra);
        System.out.println("Intentos restantes :" + intentos);
        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);

        contador = 0;

        for (int i = 0; i < secreto.length();i++) {
            
            if (letra == secreto.charAt(i)) {
                palabra = palabra.substring(0, i)
                + letra
                + palabra.substring(i + 1);
                contador++;
            }


            

        }
        if (contador == 0){
            System.out.println("letra incorrecta");
            intentos--;
        }
        else{
            System.out.println("Bien!");
        }
        if (intentos == 0) {
            System.out.println("Perdiste! La palabra era : " + secreto);
            
        }



        if (palabra.equals(secreto)){
            System.out.println("Ganaste! La palabra era: " + secreto);
            break;
        }


        
        
        } while (intentos > 0);


        sc.close();
    }
    
}
