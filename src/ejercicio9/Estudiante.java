package ejercicio9;

public class Estudiante {
    public String nombre;
    public String ID;

    public Estudiante() {
    }

    public Estudiante(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "{nombre: " + this.nombre + ", ID: " + this.ID + '}';
    }
}
