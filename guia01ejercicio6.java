import java.util.Scanner;
public class guia01ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primero lado");
        float lado1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo lado");
        float lado2 = scanner.nextFloat();
        System.out.print("Ingrese el tercer lado");
        float lado3 = scanner.nextFloat();
        scanner.close();
        if (lado1==lado2) {
            if (lado2==lado3){
                System.out.print("es un equilatero");
            } else {
                System.out.print("es un isoceles");
            }
        }else if (lado2==lado3){
            System.out.print("es un isoceles");

        }else if (lado1==lado3){
            System.out.print("es un isoceles");
        }else{
            System.out.print("es un escaleno");
        }
            }
        }  
