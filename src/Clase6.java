import java.util.Scanner;

public class Clase6 {

    static void main() {

        IO.println("subida nueva. cambio nuevo ");
        //scanner
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingresa la cantidad de faltas que tuviste: ");
        int faltas= scanner.nextInt();
        System.out.println("Ingresa si presentaste la documentación para rendir : ");
        boolean doc= scanner.nextBoolean();

        IO.println(consultaHabilitacionExamen(faltas,doc));

        // caso negativo de documentacion
        //cn faltas
        // cn faltas y documentacion
        // Caso positivo


    }

//    Crear una función que reciba una cantidad de faltas y retorne verdadero en caso de que se encuentre dentro
//    del límite disponible para rendir el examen.Utilizar scanner en método main. Recordemos que las horas de clase
//     son 150 y el tiempo por clase 3.20. Para este caso el porcentaje de asistencia será de 85.
//

    public static boolean asistenciaHabilita(int faltas ){

       if(faltas < 0){
           System.out.println("Ingresa un valor de faltas válido. ");
           return false;
       }

        int clasesEnTotal=(int)(150/3.2) ;
        int faltasDisponibles= (int)(clasesEnTotal*0.15);

//        if( faltas <= faltasDisponibles) {return true;}
//        else{ return false;}

        return faltas <= faltasDisponibles;

    }



//    Crear una segunda función que solicite los datos, utilice esa primera función además de consultar
//    si presentó la documentación para rendir, debe retornar un mensaje personalizado para cada caso.

    public static String consultaHabilitacionExamen( int faltas,boolean presentoDocumentacion ){
       //casos negativos

//        if(presentoDocumentacion == null || ! presentoDocumentacion.equals("Sí")
//                || ! presentoDocumentacion.equals("No") ){
//            return "No responde con sí o no al solicitar la documentación.";
//        }


        //sumar while de prueba

        boolean asistencia= asistenciaHabilita(faltas);

        if(!presentoDocumentacion && !asistencia){
            return "No cumple ningún requisito.";
        }
        else if (!presentoDocumentacion){
            return "No presentó la documentación no puede rendir.";
        }
        else if(! asistencia){
            return "No puede rendir porque no cumple con la asistencia.";
        }
        else{
        return "Está habilitado para rendir.";}


    }

}
