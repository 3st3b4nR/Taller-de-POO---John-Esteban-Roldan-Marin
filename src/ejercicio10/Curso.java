package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombreCurso;
    private List<Profesor> profesores;

    public Curso() {
    }


    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.profesores = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void agregarPorfesor(Profesor profesor) {
        profesores.add(profesor);

    }

    public void imprimirProfesores() {
        System.out.println("-------Lista de profesores-------");
        System.out.println("---------"+nombreCurso+"--------");
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }

}
