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
    public String fechaCompleta(){
        return dia + "/" + mes + "/" + anio;

    }

    //metodo
    public static Fecha hoy(){
        return new Fecha(29,4,2026);
    }

    //metodo
    public int distanciaEnAnios(Fecha otraFecha){
        int diferencia = this.anio - otraFecha.anio;
        return Math.abs(diferencia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <=31) {
            this.dia = dia;
        }
        else {
            System.out.println("Error el dia no existe.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >=1 && mes <= 12) {
            this.mes = mes;
        }
        else {
            System.out.println("Error el mes no existe.");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio >=1990 && anio <=2026) {
            this.anio = anio;
        }
        else {
            System.out.println("El año no existe");
        }
    }

    public static void main(String[] args) {
        
        System.out.println(Fecha.hoy().fechaCompleta());
    }



}
