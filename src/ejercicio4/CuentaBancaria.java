package ejercicio4;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void  Depositar(double cantidad){
        this.saldo+=cantidad;
        System.out.println("El saldo depositado es de: "+cantidad);
    }
    public void Retirar(double cantidad){
        this.saldo-=cantidad;
        System.out.println("Retirando "+cantidad);
    }

    @Override
    public String toString() {
        return "Tu saldo es de: "+this.saldo;
    }
}
