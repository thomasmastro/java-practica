public class Coche {

    String marca;
    String modelo;
    int fecha;
    int velocidad;

    public void mostrarInfo(){
        System.out.println("El coche " + marca + " Modelo " + modelo + " del año " + fecha + " velocidad " + velocidad );
    }
    
    public Coche (String marcaInicial, String modeloInicial, int fechaInicial, int velocidadInicial) {

        marca = marcaInicial;
        modelo = modeloInicial;
        fecha = fechaInicial;
        velocidad = velocidadInicial;

    }

    public static void main(String[] args) {

        Coche c1 = new Coche("Peugeot", "206",2005, 0);
        Coche c2 = new Coche("Fiat", "Uno", 2003, 0);

        c1.mostrarInfo();
        c2.mostrarInfo();
        
    }
}
