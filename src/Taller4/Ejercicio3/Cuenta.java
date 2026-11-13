package Taller4.Ejercicio3;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}

/*
sin metodos set y get

public class Taller4.Taller5.Taller6.Ejercicio3.Cuenta {

    private double saldo;

    public Taller4.Taller5.Taller6.Ejercicio3.Cuenta(double saldo) {
        this.saldo = saldo;
    }
}

No se debe permitir que otras clases
modifiquen directamente los atributos
internos de un objeto.
 */