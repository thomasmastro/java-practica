import java.util.Scanner;

public class guia01ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercero numero ");
        int num3 = scanner.nextInt();

        System.out.printf("%d %d %d",num1,num2,num3);
        System.out.print(" Te los escribo en el orden que los escribiste");
        System.out.println("");

        if (num1 == num2 && num2 == num3 ) {
            System.out.printf("%d %d %d", num1,num2,num3);    
        }
        else if (num1 == num2) {
            if (num2>num3) {
                System.out.printf("%d %d %d", num3,num2,num1);
            }
            else
                System.out.printf("%d %d %d", num2,num1,num3);
        }
        else if (num1 == num3) {
            if (num3>num2) {
                System.out.printf("%d %d %d", num2,num3,num1);
            }
            else
                System.out.printf("%d %d %d", num1,num3,num2);
        }
        else if (num2 == num3) {
            if (num3>num1) {
                System.out.printf("%d %d %d", num1,num2,num3);
            }
            else
                System.out.printf("%d %d %d", num2,num3,num1);
        }
        else if (num1>num2) {
            if (num2>num3) {
                System.out.printf("%d %d %d", num3,num2,num1);    
            }
            else if (num3<num1) {
                System.out.printf("%d %d %d", num2,num3,num1);    
            }
            else
                System.out.printf("%d %d %d", num2,num1,num3);
        }
        else if (num2>num3) {
            if (num3>num1) {
                System.out.printf("%d %d %d", num1,num3,num2);    
            }
            else
                System.out.printf("%d %d %d", num3,num1,num2);
        }
        else
            System.out.printf("%d %d %d", num1,num2,num3);
        
        System.out.print(" Te los ordene de forma creciente!");    







        scanner.close();
    }
    
}
