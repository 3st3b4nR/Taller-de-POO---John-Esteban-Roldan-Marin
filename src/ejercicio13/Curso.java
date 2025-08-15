package ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
        estudiante.addCursoInt(this);
    }

    public void addEstudianteInt(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void printEstudiantes(){
        System.out.println("-----------"+this.nombre+"--------------");
        for (Estudiante estudiante : this.estudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }


}
