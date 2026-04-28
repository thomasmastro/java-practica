public class Coche {

    String marca;
    String modelo;
    int anio;
    int velocidad;


    public Coche (String marcaInicial, String modeloInicial, int anioInicial, int velocidadInicial) {

        marca = marcaInicial;
        modelo = modeloInicial;
        anio = anioInicial;
        velocidad = velocidadInicial;

    }

    public void mostrarInfo(){
        System.out.println("El coche " + marca + " Modelo " + modelo + " del año " + anio + " velocidad " + velocidad );
    }

    public int cambiarVelocidad(int delta){

        velocidad += delta;

        return velocidad;
    }
    
    public static void main(String[] args) {

        

        Coche c1 = new Coche("Peugeot", "206",2005, 0);
        Coche c2 = new Coche("Fiat", "Uno", 2003, 0);

        c1.mostrarInfo();
        c2.mostrarInfo();

        c1.cambiarVelocidad(-20);
        c1.mostrarInfo();
        c1.cambiarVelocidad(20);
        c1.mostrarInfo();

        
        
    }
}
