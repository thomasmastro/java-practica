package EjercicioCiudadano;
public class Fecha {
    
    //atributos
    private int dia;
    private int mes;
    private int anio;


    //constructor
    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        anio = a;
    }

    //metodo
    public String FechaCompleta(){
        return dia + "/" + mes + "/" + anio;

    }

    //metodo
    public void Hoy(){
        this.dia = 25;
        this.mes = 9;
        this.anio = 2025;
    }

    //public int distanciaEnAnios(Fecha fecha1, Fecha fecha2){
    //    if (fecha1(anio) > fecha2(anio)){
    //
    //
    //    }
    //    return fecha
    //}

    public static void main(String[] args) {
        Fecha f1 = new Fecha(0,0,0);
        f1.Hoy();
        System.out.println(f1.FechaCompleta());
    }



}
