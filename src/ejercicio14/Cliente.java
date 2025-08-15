package ejercicio14;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setCliente(this);
    }

    public void printPedidos(){
        System.out.println("---------------"+nombre+"--------------");
        System.out.println("Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.getNombre() +" "+ pedido.getDireccion());
        }
    }
}
