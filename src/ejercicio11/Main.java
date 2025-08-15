package ejercicio11;

public class Main {
    public static void main(String[] args) {
        Compania empresa = new Compania("UCO");
        Empleado e1=new Empleado("Esteban", 5000000.0);
        Empleado e2=new Empleado("Luiz", 4500000.0);
        Empleado e4=new Empleado("Cristian", 6000000.0);
        Empleado e3=new Empleado("Sebas", 5500000.0);

        empresa.agragarEmpleado(e1);
        empresa.agragarEmpleado(e2);
        empresa.agragarEmpleado(e3);
        empresa.agragarEmpleado(e4);

        empresa.imprimirMayorSalario(55000000.0);
    }
}
