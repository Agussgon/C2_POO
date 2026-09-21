package dto;

public class Sube {

    //variables de clase
    private static double limiteSaldoNegativo=-2000;

    //variable de instancia --> objeto
    private final int NUMERO;
    private double saldo;

    //constructor -- > nunca incluye variables estáticas
    public Sube(int NUMERO, double saldo) {
        this.NUMERO = NUMERO;
        this.saldo = saldo;
    }
}
