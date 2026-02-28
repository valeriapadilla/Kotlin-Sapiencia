package cuentas;

public class CuentaCorriente extends Cuenta{
    private double sobreGiro;

    public CuentaCorriente(String titular, double sobreGiro){
        super(titular);
        this.sobreGiro = sobreGiro;
    }

    @Override
    public void retirar(double retiro){
        if(saldo + sobreGiro >= retiro){
            saldo = saldo - retiro;
        }
    }

}
