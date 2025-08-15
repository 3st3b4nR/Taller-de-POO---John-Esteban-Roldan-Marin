package ejercicio9;

import ejercicio8.Libro;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public void Insertar(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante + " insertado");
    }

    public void Eliminar(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                estudiantes.remove(i);
                eliminado = true;
                System.out.println("Estudiante eliminado correctamente.");
                break;
            }
            if (!eliminado) {
                System.out.println("No se encontró un estudiante con ese nombre.");
            }
        }
    }

    public void Buscar(String nombre) {
        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Estudiante encontrado: " + estudiante);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un estudiante con ese nombre.");
        }
    }

    public void Imprimir(){
        if  (estudiantes.isEmpty()){
            System.out.println("Estudiantes no encontrados");
        }else{
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
        }

        }
    }

}
