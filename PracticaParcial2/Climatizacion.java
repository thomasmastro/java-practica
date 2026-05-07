package PracticaParcial2;

public class Climatizacion {
    public static void main(String[] args) {
        int tempActual = 40;
        int tempDeseada = 20;

        System.out.println("Temperatura Actual : "+tempActual + " " + "Temperatura deseada: "+tempDeseada);

        while (tempActual < tempDeseada) {
            tempActual++; 
            System.out.println("La temperatura actual es: "+tempActual);
        }
        while (tempActual > tempDeseada) {
            tempActual--;
            System.out.println("La temperatura se regulo: "+tempActual);
            
        }

    }
}
