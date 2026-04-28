package GuiaEjercicios;
import java.util.Scanner;

public class guia01ejercicio1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese el valor en milimetros: ");

        double mm = scanner.nextDouble();

        double pulgadas = mm / 25.4;

        System.out.println("el valor en pulgadas es: " + pulgadas);

        scanner.close();

    }
}

