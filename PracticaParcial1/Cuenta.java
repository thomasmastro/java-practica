package PracticaParcial1;

public class Cuenta {

    //atributos
    private double saldo;

    //constructor
    public Cuenta(double saldo){
        this.setSaldo(saldo);
    }

    //getter

    public double getSaldo(){
        return saldo;
    }

    //setter
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodo
    public double retirar(double monto){
        if (saldo >= monto) {
            saldo = this.saldo - monto ;
        }
        else {
            System.err.println("Fondos insuficientes");
        }
        return saldo; 
    }

    //Metodo
    public double mostrarSaldo(){
        return this.getSaldo();
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1000);
        System.out.println(c1.mostrarSaldo());
        c1.retirar(1200);
        System.out.println(c1.mostrarSaldo());

    }




    
}
