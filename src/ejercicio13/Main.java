package ejercicio13;

public class Main {
    public static void main(String[] args) {
        Curso c1=new Curso("Programacion");
        Curso c2=new Curso("Actuación porno");
        Estudiante est1=new Estudiante("Esteban");
        Estudiante est2=new Estudiante("Fernando");
        Estudiante est3=new Estudiante("Sebastian");

        c1.addEstudiante(est1);
        c1.addEstudiante(est2);
        c2.addEstudiante(est1);

        est3.addCurso(c2);

        c1.printEstudiantes();
        c2.printEstudiantes();

        est1.printCurso();
        est2.printCurso();
        est3.printCurso();
    }
}
