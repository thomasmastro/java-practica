public class Persona01 {


/*Atributos */

    String nombre;
    int edad;

/*Metodos */

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad);


    }
/*constructor */

    public Persona01(String nombreInicial, int edadInicial){

        nombre = nombreInicial;
        edad = edadInicial;

    }


    public static void main(String[] args) {
        Persona01 p1 = new Persona01("Thomas",24);
        Persona01 p2 = new Persona01("Sera",17);
        p1.saludar();
        p2.saludar();

    }



}