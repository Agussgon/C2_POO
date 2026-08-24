
import java.util.Scanner;

public class Clase4 {

    public static void main(String [] args){


        IO.println(obtenerProducto(5,5,10));
//        IO.println(calcularCantidadLetras(" ho la a a "));


//        String saludo= null;
//        saludo="";
//        System.out.println(saludo.length());


        System.out.println("cambios");

//        Crear un programa que cuente de uno en uno hasta que se le indique.(hecho-repaso).

//            int contador1=0;

            Scanner scanner= new Scanner(System.in);
//            System.out.println("Quiere contar de uno en uno, ingrese true o false.");
//            boolean contar=scanner.nextBoolean();
//          //  IO.println("ingreso la respuesta "+ contar);
//
//            while(contar){
//                contador1 ++;
//                IO.println(contador1);
//                System.out.println("quiere continuar?");
//                contar= scanner.nextBoolean();
//            }
//
//
//



  }

//    1- Crea una función que valide que un
//    texto no este vacio, retorne cuantos caracteres tiene e imprima la cantidad del carácter ‘a’.
//            (Podemos reutilizar el anterior)

  public static int calcularCantidadLetras(String texto) {
      if (texto == null || texto.isBlank()) {
          System.out.println("Ingreso un texto vacio.");
          return 0;

      } else {
          String textoNormalizado = texto.replace(" ", "").toLowerCase();

          int contadorA = 0;
          for (int i = 0; i < textoNormalizado.length(); i++) {
              if (textoNormalizado.charAt(i) == 'a') {
                  contadorA = contadorA + 1;
              }
          }
          IO.println("la a aparece tantas veces: " + contadorA);

          return textoNormalizado.length();


      }

  }

//  2-      Escribí una fx que multiplique todos los números divisibles por x en el rango de x al x y retorne el resultado.

      public static int obtenerProducto(int divisor, int inicioRango, int limiteRango){

          int producto=1;

          for(int i=inicioRango;i <= limiteRango; i++){
              //    for(int i=2;i <= 12; i=i+2
              if(i%divisor  == 0){
                  producto *= i;
              }
//            else{
//                IO.println("El n° "+i+ " no es / por 2");
//
//            }

          }

          return producto;

      }




  }





