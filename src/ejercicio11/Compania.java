package ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Compania {
    private String nombre;
    private List<Empleado> staff;

    public Compania() {

    }

    public Compania(String nombre) {
        this.nombre = nombre;
        this.staff = new ArrayList<Empleado>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getStaff() {
        return staff;
    }

    public void setStaff(List<Empleado> staff) {
        this.staff = staff;
    }

    public void imprimirMayorSalario(double cantidad){
        boolean encontrado = false;
        for (Empleado empleado:staff) {
            if (empleado.getSalario() > cantidad) {
                System.out.println(empleado);
                encontrado=true;
            }

        }if (!encontrado){
            System.out.println("No existe el empleado con el salario especificado");
        }
    }




    public void agragarEmpleado(Empleado empleado){
        staff.add(empleado);
    }
}
