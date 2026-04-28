package GuiaEjerciciosExtra;
import java.util.Scanner;

public class EjercicioExtraJuego4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contlet = 0;
    int contnum = 0;
    int contmayus = 0;
    int contcaractes = 0;

    System.out.print("Ingrese una contraseña ");

    String contra = sc.nextLine();

    if (contra.length() < 10) {
        System.out.println("La contraseña debe tener al menos 10 caracteres.");
        sc.close();
        return;
    }

    for (int i = 0 ;i < contra.length(); i++){

        char caract = contra.charAt(i);

        if (Character.isLetter(caract)) {
            contlet++;
        }

        if (Character.isDigit(caract)){
            contnum++;
        }

        if (Character.isUpperCase(caract)){
            contmayus++;
        }

        if (!Character.isLetterOrDigit(caract)) {
            contcaractes++;
        }


    }

    if (contnum == 0) {
        System.out.println("Contraseña insegura, no contiene numeros");
        sc.close();
        return;
    }

    if (contlet == 0) {
        System.out.println("Contraseña insegura, no contiene letras");
        sc.close();
        return;
    }

    if (contmayus == 0) {
        System.out.println("Contraseña insegura, no contiene mayusculas");
        sc.close();
        return;
    }

    if (contcaractes == 0) {
        System.out.println("Contraseña insegura, no contiene caracteres especiales");
        sc.close();
        return;
    }


    System.out.println("La contraseña es segura");






    sc.close();
}

    
}
