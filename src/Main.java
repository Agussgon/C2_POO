import java.util.Scanner;

public class Main {
/*

EJERCICIOS CON LOS MÉTODOS ESTÁTICOS DE LA CLASE MATH

* Calcular la raíz de un número ingresado.
Generar un número aleatorio (random) del 1 al 100 que el usuario deberá adivinar.
Obtener el máximo entre dos números (max).

*
* */

    static void main() {

        Scanner scanner = new Scanner(System.in);
        IO.println(" Ingrese un n° ");
        int numeroIngresado = scanner.nextInt();
        IO.println("La raíz cuadrada del número es " + Math.round(Math.sqrt(numeroIngresado)));

        int numeroAleatorio = ((int) (Math.random() * 100)) + 1;
        IO.println("el n° aleatorio es " + numeroAleatorio);

        IO.println("N° máximo de los dos " + Math.max(numeroAleatorio, numeroIngresado));

        //Clase utilitaria Calculadora
        IO.println(
                "Utilizando métodos estáticos de la clase Calculadora "+
                Calculadora.calcularCantidadLatasBarniz(35.4)
                + "\n Metros de tapacantos necesarios para una mesa rectangular "
                + Calculadora.calcularMetrosTapacantos(1.8, 0.9));

    }

}
