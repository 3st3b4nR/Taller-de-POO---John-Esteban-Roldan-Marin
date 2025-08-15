package ejercicio14;

public class Main {
    public static  void main(String[] args) {
        Cliente c1=new Cliente("Esteban");
        Cliente c2=new Cliente("Sebastian");

        Pedido p1=new Pedido("Condones XS", "Calle1");
        Pedido p2=new Pedido("Condones XXXL", "Calle2");
        Pedido p3=new Pedido("Condones M", "Calle3");

        c1.addPedido(p2);
        c1.addPedido(p3);

        c2.addPedido(p2);

        c1.printPedidos();
        c2.printPedidos();
    }
}
