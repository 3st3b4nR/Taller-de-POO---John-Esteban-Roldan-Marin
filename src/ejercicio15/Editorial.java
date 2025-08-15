package ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;
    private List<Libro> almacen;

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.almacen = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getAlmacen() {
        return almacen;
    }

    public void setAlmacen(List<Libro> almacen) {
        this.almacen = almacen;
    }

    public void addLibro(Libro libro) {
        almacen.add(libro);
        libro.setEditorial(this);
    }

    public void printAlmacen() {
        System.out.println("--------------"+nombre+"---------------");
        for (Libro libro : almacen) {
            System.out.println(libro.getTitulo()+": "+libro.getAutor());
        }
    }
}
