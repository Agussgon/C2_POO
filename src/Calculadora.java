public class Calculadora {

    public static final int cantidadLitrosLataBarniz=10;

    /*
    * Calcular las latas de barniz de 10 litros necesarias en base a la cantidad de litros que se
    * utilizarán en la semana.

    * Calcular cuántos metros de tapacantos se necesitan para una mesa rectangular de melamina:
    *  calcula el perímetro(2*(b+h)).
    * */

    public static int calcularCantidadLatasBarniz(double litrosTotal){
        double cantidadLatasDecimal= litrosTotal/ cantidadLitrosLataBarniz;
        return (int)(Math.ceil(cantidadLatasDecimal));
    }

    public static int calcularMetrosTapacantos(double base, double altura){
        double perimetro= base*2 + altura*2;
        return (int)(Math.ceil(perimetro));
    }


}
