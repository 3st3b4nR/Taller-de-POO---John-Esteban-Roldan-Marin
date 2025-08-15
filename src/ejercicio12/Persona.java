package ejercicio12;

public class Persona {
    private String nombre;
    private String apellido;
    private String ID;
    private Pasaporte pasaporte;


    public Persona() {
    }

    public Persona(String nombre, String apellido, String ID, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        setPasaporte(pasaporte);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null) {
            pasaporte.setDuenio(this);
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre +" Apellido: "+this.apellido+" ID: "+this.ID;
    }
}
