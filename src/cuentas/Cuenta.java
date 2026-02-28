package cuentas;

public class Cuenta {
    //atributos
    private String titular;
    protected double saldo;

    //constructor
    public Cuenta(String nombre){
        this.titular =nombre;
        this.saldo = 0;
    }

    //get y set
    //solamente queremos ver el saldo y el nombre
    //no se puede editar saldo y nombre

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //metodos

    //el usuario va a poder retirar de la cuenta
    public void consignar(double ingreso){
        this.saldo += ingreso;
        //es igual a esto
        //this.saldo = this.saldo + ingreso;
    }

    public void retirar(double retiro){
        if(this.saldo>=retiro){
            this.saldo = this.saldo - retiro;
        }
    }

    public String verSaldo(){
        return "Su saldo actual es de: " + this.saldo;
    }

}
