import java.util.Scanner;

public class guia01ejercicio8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int base = 10;    
    System.out.print("Ingrese el numero entero : ");
    int num = scanner.nextInt();
    int n = num;
    int cont = 0;
    

    if (n < 0) {
        n = n * -1;
        
    }

    do{
        n /= base;
        cont++;
    } while (n != 0);

    System.out.println("El numero "+ num + " tiene " + cont + " Cifra/s");
    scanner.close();
}

    
}
