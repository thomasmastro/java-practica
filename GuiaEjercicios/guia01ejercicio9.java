package GuiaEjercicios;
import java.util.Scanner;

public class guia01ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            System.out.println(" Para salir ingrese 0 ");
            System.out.print(" Ingrese su numero : ");
            num = scanner.nextInt();
            
            if (num < 0) {
                System.out.println(" Es un numero negativo");
            }
            else if (num > 0) {
                System.out.println(" Es un numero positivo");
            }
            else
                System.out.println(" Su numero es 0");

        } while(num != 0);

    scanner.close();    
    }

}
