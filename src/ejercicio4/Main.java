package ejercicio4;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1=new CuentaBancaria(100);
        System.out.println("El saldo es de: "+c1.getSaldo());
        c1.Depositar(100);
        c1.Retirar(200);
        System.out.println("El saldo es de: "+c1);

    }
}
