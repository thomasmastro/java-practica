import java.util.Scanner; 


public class guiaejerciciosE1 {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("ingrese el numero");
        int nro = sc.nextInt();
        System.out.printf("El cuadrado de %d es %d", nro, cuadrado(nro));
        sc.close();
    }

    public static int cuadrado(int nro) {
        return nro * nro;
    }    
    

}