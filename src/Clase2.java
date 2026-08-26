import java.util.Scanner;

public class Clase2 {


    /*
    * Se requiere verificar que una palabra ingresada no es nula ni vacía.
Luego imprimir cuantas letras tiene y contabilizar las veces que se encuentra la letra ‘a’.

    *
    * */

    static void main() {

        contarA();
    }


    public static void contarA() {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("Ingrese una palabra: ");
            String palabra = scanner.nextLine();
            if (palabra == null || palabra.isBlank()) {
                System.out.println("Ingreso una frase vacia. Quiere ingresarlo nuevamente: ");
                continuar = scanner.nextBoolean();

            } else {
                IO.println("La cantidad de letras es: " + palabra.strip().length());
                IO.println("cantidad de letras utilizando replace " + palabra.replace(" ", "").length());
                int contadorA = 0;

                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.toLowerCase().charAt(i) == 'a') {
                        contadorA++;
                    }

                }
                IO.println("La cantidad de veces que aparece la letra A: " + contadorA);
                System.out.println("Quiere ingresar otra: ");
                continuar = scanner.nextBoolean();
            }
        }

    }
}

