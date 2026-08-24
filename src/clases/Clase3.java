package clases;

import java.util.Scanner;

public class Clase3 {
//
//    Hacer un programa que calcule la resta de los N primeros números naturales,
//    donde N es el número límite ingresado por teclado.
//    Escribí un programa que multiplique todos los números divisibles por 2 en el rango del 1 al 12.
//    Crear un programa que cuente de uno en uno hasta que se le indique.(hecho-repaso).

    static void main() {

        int num=5;
        int resta=0;
        //validacion agregar
        for (int i=num; i > 0; i--){
            resta-= i - (i-1);
        }
        System.out.println("la resta da "+ resta);


        int producto=1;
        for (int i = 2; i <= 12 ; i++) {
            //smar aclarac llaves
            if(i%2==0)  producto*=i;
        }

        System.out.println(producto);

        boolean continuarContando=true;
        int contador=0;

        Scanner scanner= new Scanner(System.in);

        while(continuarContando){
            contador++;
            IO.println(contador);
            //print
            System.out.println("quiere contar más: ");
            continuarContando = scanner.nextBoolean();
        }

    }

//
//    Crea una función que cuente cuantas letras tiene el trayecto y que al finalizar imprima el total. Actualizarlo para que retorne la cantidad del carácter ‘a’.(reutilizar el anterior)
//    Crear una función que reciba una cantidad de faltas y retorne verdadero en caso de que se encuentre dentro del límite disponible para rendir el examen.
//
//    Crear una segunda función que utilice esa primer función, además de consultar si presentó la documentación para rendir.
//    Las horas de clase son 150 y el tiempo por clase 3.30



}
