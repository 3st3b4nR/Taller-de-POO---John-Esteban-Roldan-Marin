package ejercicio9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---------------MENÚ-----------------");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Imprimir estudiantes");
            System.out.println("5. Salir");

            System.out.println("escoja una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre del estudiante: ");
                    String nombreAgregar = scanner.nextLine();

                    System.out.println("Ingresa el ID del estudiante: ");
                    String id = scanner.nextLine();

                    curso.Insertar(new Estudiante(nombreAgregar, id));
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del estudiante que desea eliminar: ");
                    String nombreEliminar = scanner.nextLine();

                    curso.Eliminar(nombreEliminar);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre que desea buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    curso.Buscar(nombreBuscar);
                    break;
                case 4:
                    curso.Imprimir();
                    break;
                default:
                    System.out.println("No válido");
                    break;
            }



        }while(opcion!=5);

        scanner.close();

    }
}

