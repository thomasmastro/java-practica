package PracticaParcial3;

public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, double nota1, double nota2, double nota3){
        this.setNombre(nombre);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota2(nota3);

    }

    //setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNota1(double nota1){
        this.nota1 =  nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

    //getter

    public String getNombre(){
        return nombre;
    }



    
}
