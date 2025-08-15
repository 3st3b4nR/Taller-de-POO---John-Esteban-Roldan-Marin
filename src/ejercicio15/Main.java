package ejercicio15;

public class Main {
    public static void main(String[] args) {
        Libro l1=new Libro("La venganza de los chamos", "Maduro");
        Libro l2=new Libro("50 sombras de gray", "Esteban");

        Editorial e1=new Editorial("Las tortugas");

        e1.addLibro(l1);
        e1.addLibro(l2);

        e1.printAlmacen();
    }
}
