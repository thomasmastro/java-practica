package GuiaEjercicios;
import java.util.Scanner;

public class guia01ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la medida del primer angulo del triángulo: ");
        double angulo1 = scanner.nextDouble();
        System.out.print("Ingrese la medida del segundo angulo del triángulo: ");
        double angulo2 = scanner.nextDouble();
        double angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("La medida del tercer angulo del triángulo es: " + angulo3);
        scanner.close();    
    }
}