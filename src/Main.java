import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static void main() {




        //instanciar un arreglo 1
        String[] comidas = new String[3];
        comidas[0] = "Milanesa";
        comidas[2] = "Cafe";
        //
//        IO.println(comidas[1]);

        //fx convertir Array

        IO.println(convertirArray(comidas));

        //2 Instanciar
        String[] comidas2={"chocolate", "tostadas","cafe"};

        //3 Instanciar
        String[] comidas3= new String[]{"chocolate", "tostadas","cafe"};

        //quiero cambiar el valor del segundo elemento del arreglo
        comidas3[1]="Medialunas";


        Arrays.sort(comidas3, String::compareToIgnoreCase);


//        for each
//        for(String comida: comidas3){
//           // comida = comida.toUpperCase();
//            IO.println(comida);
//        }

     //   IO.println( Arrays.toString(comidas3) );

        String[] comidas3Copia= Arrays.copyOf(comidas3, 5);
//        Arrays.fill(comidas3Copia, " ");

//        for
        for (int i = 0; i < comidas3Copia.length; i++) {
            if(comidas3Copia[i] != null){
            comidas3Copia[i]=comidas3Copia[i].toUpperCase();}

            IO.println(comidas3Copia[i]);
        }

//        //while
//        int contador= 0;
//
//        while(contador < comidas3.length){
//            IO.println(comidas3[contador]);
//            contador++;
//        }


    }

//    Crea un array de tres comidas e imprimirlas por orden alfabético utilizando for-each.
//    Crea una copia del array con el texto en mayúscula. Necesitamos cargar dos comidas más.
//    Armar una función que reciba tres comidas separadas por coma y las transforme en un arreglo.
//    Debe retornar el array como un texto e indicar si es igual al primer array.

    public static String convertirArray(String [] compararArray){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa tres comidas separadas por coma: ");
        String [] comidasArray=null;

            String comidas= scanner.nextLine();
//            IO.println("esto es lo que obtuvo de consola:" + comidas);

            if(comidas.isBlank()){
                return "No ingreso lo solicitado.";
            }
            comidasArray= comidas.trim().split(",");

        return Arrays.toString(comidasArray) + " Es igual al array recibido? "
                + Arrays.equals(comidasArray, compararArray);

    }

}
