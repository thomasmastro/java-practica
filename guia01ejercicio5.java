import java.util.Scanner;
public class guia01ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor:");
        double valor1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo valor:");
        double valor2 = scanner.nextDouble();

        if (valor1>valor2) {

            System.out.println("El primer valor es mayor que el segundo valor.");
        } else if (valor1<valor2) {
            System.out.println("El segundo valor es mayor que el primer valor.");
        } else { 
            System.out.println("Ambos valores son iguales.");
        
        }
            
        }

    }
