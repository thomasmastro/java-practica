package GuiaEjerciciosExtra;
import java.util.Scanner;


public class ejercicioextrajuego2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        String alreves = ("");
        String adivinar;

        for (int i = palabra.length()-1; i >= 0; i--){
            alreves = alreves + palabra.charAt(i);
        }

        System.out.print("Escribi la palabra al reves " );
        adivinar = sc.nextLine();

        

        if (alreves.equalsIgnoreCase(adivinar)) {
            System.out.println("Correcto!");    
        } else {
            System.out.println("Incorrecto!");
        }

        sc.close();
    }
    
}
