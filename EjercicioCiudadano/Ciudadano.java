package EjercicioCiudadano;

public class Ciudadano{
    
    //atributos
    private String apellido;
    private String nombre;
    private Fecha nacimiento;
    private Tramite tramite;

    //constructor vacio
    public Ciudadano(){
    }

    //constructor
    public Ciudadano(String apellido, String nombre, Fecha nacimiento){
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.tramite = Tramite.NINGUNO;
    }

    //metodo
    public String toString() {
        return "Hola soy " + this.getApellido() + " " + this.getNombre() + " y naci el " 
        + this.getNacimiento().fechaCompleta() + " Tramite : " + this.getTramite() ;
    }

    //metodo
    public int getEdad() { 
        return Fecha.hoy().distanciaEnAnios(this.nacimiento);
    }

    public void setTramite(Tramite tramite) {
        if (tramite == Tramite.ABRIR_EMPRESA) {
            if (this.getEdad() >= 18) {
                this.tramite = Tramite.ABRIR_EMPRESA;
            }
            else {
                System.out.println("Error tramite no permitido");
                this.tramite = Tramite.NINGUNO;
            }    
        }
        else if (tramite == Tramite.REGISTRO_AUTO) {
            if (this.getEdad() >= 16) {
                this.tramite = Tramite.REGISTRO_AUTO;
            }
            else {
                System.out.println("Error tramite no permitido");
                this.tramite = Tramite.NINGUNO;
            }
        }
        else {
            this.tramite = tramite;
        }
    }


    //setters y getters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Fecha getNacimiento(){
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento){
        this.nacimiento =  nacimiento;    
        }

    public Tramite getTramite(){
        return tramite;
    }



    //main
    public static void main(String[] args) {
        Ciudadano c1 = new Ciudadano("Mastrogiacomo", "Thomas",new Fecha(16,5,2016));
        Ciudadano c2 = new Ciudadano("Cavalleri", "Candela", new Fecha(20,10,2000));
        
        System.out.println(c1);
        System.out.println(c2);
        
        c1.setTramite(Tramite.REGISTRO_AUTO); 
        c2.setTramite(Tramite.ABRIR_EMPRESA);

        System.out.println(c1);
        System.out.println(c2);
    }

}
