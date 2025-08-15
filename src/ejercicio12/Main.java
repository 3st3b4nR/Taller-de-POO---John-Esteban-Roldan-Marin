package ejercicio12;

public class Main {
    public static void main(String[] args) {
        Pasaporte p1 = new Pasaporte("AS71010");
        Pasaporte p2 = new Pasaporte("AS81020");

        Persona per1= new Persona("Esteban","Roldan", "1040874322", p1);
        Persona per2= new Persona("Sebas","Lucuara", "1140871222", p2);


        System.out.println(per1);
        System.out.println(per2);

        System.out.println(p1.getDuenio());
        System.out.println(p2.getDuenio());

        System.out.println(per1.getPasaporte());
        System.out.println(per2.getPasaporte());

    }
}
