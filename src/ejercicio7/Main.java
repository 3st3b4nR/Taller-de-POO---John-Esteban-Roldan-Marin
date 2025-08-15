package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor1=new Motor(100,"Manual");
        Automovil auto1=new Automovil( motor1, "Chevrolet", "Onix","Rojo");
        System.out.println(auto1);

    }
}
