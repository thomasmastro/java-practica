import java.util.Scanner;

public class guia01ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la cantidad de lapices en stock ");

        int stock = scanner.nextInt();

        System.out.print("ingrese la cantidad de lapices que entran en la caja ");

        int caja = scanner.nextInt();

        int disponibles = stock/caja;

        System.out.println("Se completaron " + disponibles + " Cajas");

        int resto = stock % caja;

        System.out.println("Sobrarian " + resto + " lapices");


        scanner.close();

    }

}
