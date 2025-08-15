package ejercicio12;

public class Pasaporte {
    private String idPasaporte;
    private Persona duenio;

    public Pasaporte() {
    }

    public Pasaporte(String idPasaporte) {
        this.idPasaporte = idPasaporte;
    }

    public String getIdPasaporte() {
        return idPasaporte;
    }

    public void setIdPasaporte(String idPasaporte) {
        this.idPasaporte = idPasaporte;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Número de pasaporte: "+idPasaporte;
    }
}
