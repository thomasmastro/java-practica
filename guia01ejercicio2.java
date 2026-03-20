import java.util.Scanner;

public class guia01ejercicio2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el dia de la semana: ");

        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes es el numero " + dia);
                break;
            case 2:
                System.out.println("Martes es el numero: "+ dia);
                break;
            case 3:  
                System.out.println("Miercoles es el numero: "+ dia);
                break;
            case 4:
                System.out.println("Jueves es el numero: "+ dia);
                break;
            case 5:
                System.out.println("Viernes es el numero: "+ dia);
                break;
            case 6:
                System.out.println("Sabado es el numero: "+ dia);
                break;   
            case 7:
                System.out.println("Domingo es el numero: "+ dia);
                break;     


                
            default:
                System.out.println("Error: numero fuera de rango.");
                break;
        }


        scanner.close();



    }

    
}
