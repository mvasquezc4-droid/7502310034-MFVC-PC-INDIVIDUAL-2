package Taller4.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Sebas");

        System.out.println(persona1.getNombre());

        persona1.setNombre("Carlos");

        System.out.println(persona1.getNombre());
    }
}


/*
public class Taller4.Taller5.Taller6.Ejercicio3.Taller5.Taller6.Ejercicio1.Taller5.Taller6.Ejercicio2.Taller6.Ejercicio2.Prueba.Taller5.Taller6.Ejercicio3.Taller6.Ejercicio1.Taller6.Ejercicio3.Main {
    public static void main(String[] args) {

        Taller4.Taller5.Taller6.Ejercicio3.Taller5.Taller6.Ejercicio3.Persona persona1 = new Taller4.Taller5.Taller6.Ejercicio3.Taller5.Taller6.Ejercicio3.Persona("Sebas");

        Esto genera un error:
        persona1.nombre = "Carlos";
    }
}
 */