package ejercicio10;

public class Main {
    public static void main(String[] args) {

        Curso curso1=new Curso("Java");

        curso1.agregarPorfesor(new Profesor("Esteban"));
        curso1.agregarPorfesor(new Profesor("Luiz"));

        curso1.imprimirProfesores();

        Curso curso2=new Curso("Python");
        curso2.agregarPorfesor(new Profesor("Esteban"));
        curso2.imprimirProfesores();
    }
}
