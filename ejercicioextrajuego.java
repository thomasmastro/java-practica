import java.util.Scanner;
public class ejercicioextrajuego {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nivel de dificultad");
        System.out.println("Nivel 1 - Facil - Rango del 1 al 10 - Intentos 5");
        System.out.println("Nivel 2 - Medio - Rango del 1 al 50 - Intentos 7");
        System.out.println("Nivel 3 - Dificil - Rango del 1 al 100 - Intentos 10");
        int difi = sc.nextInt();
        if (difi >= 1 && difi <= 3) {
            System.out.println("Opcion seleccionada :" + difi);
        }
        int num;
        int intentos;
        int secreto;

        switch (difi) {
            
            case 1:
                intentos = 5;                
                secreto = (int)(Math.random()*10)+1;

                do {
                    System.out.print("Ingrese un numero del 1 al 10: ");
                    num = sc.nextInt();
                    if (num > 10 || num < 0) {
                System.out.println("El numero esta fuera del rango, prueba con otro ");
                continue;   
                }
                if (num == secreto) {
                    System.out.println("Encontraste el numero secreto!");
                    break;
                }
                if (num < secreto) {
                    System.out.println("El numero secreto es MAYOR.");
                }    
                if (num > secreto) {
                    System.out.println("El numero secreto es MENOR.");    
                }


                intentos--;
                System.out.println("Intentos restantes: " + intentos);


                } while (intentos > 0);

                break;
            
            case 2:
                intentos = 7;                
                secreto = (int)(Math.random()*50)+1;

                do {
                    System.out.print("Ingrese un numero del 1 al 50: ");
                    num = sc.nextInt();

                    if (num > 50 || num < 0) {
                        System.out.println("El numero esta fuera del rango, prueba con otro ");
                        continue;   
                    }
                if (num == secreto) {
                    System.out.println("Encontraste el numero secreto!");
                    break;
                }
                if (num < secreto) {
                    System.out.println("El numero secreto es MAYOR.");
                }    
                if (num > secreto) {
                    System.out.println("El numero secreto es MENOR.");    
                }


                intentos--;
                System.out.println("Intentos restantes: " + intentos);


                } while (intentos > 0);
                
                break;
            
            case 3:
                intentos = 10;                
                secreto = (int)(Math.random()*100)+1;

                do {
                    System.out.print("Ingrese un numero del 1 al 100: ");
                    num = sc.nextInt();
                    if (num > 100 || num < 0) {
                System.out.println("El numero esta fuera del rango, prueba con otro ");
                continue;   
                }
                if (num == secreto) {
                    System.out.println("Encontraste el numero secreto!");
                    break;
                }
                if (num < secreto) {
                    System.out.println("El numero secreto es MAYOR.");
                }    
                if (num > secreto) {
                    System.out.println("El numero secreto es MENOR.");    
                }


                intentos--;
                System.out.println("Intentos restantes: " + intentos);


                } while (intentos > 0);
                
                
                break;

            default:
                System.out.println("Numero incorrecto, intente de nuevo");
                break;
        }

        sc.close();
    }


    
}
