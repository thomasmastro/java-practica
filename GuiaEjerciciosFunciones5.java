import java.util.Scanner;

public class GuiaEjerciciosFunciones5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");    
        int num = sc.nextInt();

    
        String resultado = primo(num);

        System.out.println(resultado);
        
        sc.close();
    }
    
    
    
    /* I verife by a method if it is a prime number */ 
    /*  */
    public static String primo(int a){

        String texto = ("");
        int nprim = 0;
        int prim= 0;

        int raiz =(int) Math.sqrt(a);

        for (int i = 2 ;i<=raiz ;i++ ){
            if (a%i != 0) {
                
                
                
            }

        }
        
    
        return a + texto;
    }
}

