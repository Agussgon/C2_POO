//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



void main() {



    /*
    * Iniciemos el módulo creando un programa que permita:
    Almacenar la información del mismo: nombre del trayecto, nombre del módulo, carga horaria (150) y tiempo de clase (3.3).
    Visualizar un mensaje de bienvenida con la información básica del módulo.

*/
//
//   //ALMACENAR
    String nombreTrayecto = "Programador/a";
    String nombreModulo = "POO";
    int cargaHoraria = 150;
    double tiempoClase = 3.3;
//
//    //VISUALIZAR
    IO.println("Bienvenid@s. Información del curso:\n" + nombreTrayecto + "\n" + nombreModulo + "\n" + cargaHoraria + " horas\n" +
            tiempoClase + " tiempo de clase.");

//
//    /*
//    *   Al ingresar un número de clase aclarar si es asincrónico.
//    * Tener en cuenta que está condición se da cada tres clases y
//     * que el número de clase ingresado no puede superar la cantidad de encuentros.*/
//
//    // cada 3 clases - no puede superar la cantidad de clases
//    //cuantas clases tengo en total si tengo 150 hs / 3.3

    double cantidadClasesTotalDecimal = cargaHoraria / tiempoClase;
    System.out.println(cantidadClasesTotalDecimal);

    int cantidadClasesTotal = (int) cantidadClasesTotalDecimal; //redondear
    System.out.println(cantidadClasesTotal);


    int numeroClase = -23;

    //caso 1
//    if (numeroClase <= cantidadClasesTotal && numeroClase % 3 == 0) {
//        System.out.println("La clase " + numeroClase + " es asincrónica.\n");
//    } else {
//        IO.println("No cumple alguna de las condiciones. ");
//    }

    //caso 2
    if (numeroClase > cantidadClasesTotal || numeroClase < 1) {
        IO.println("No se encuentra en el rango válido de clases disponibles.");
    } else {
        if (numeroClase % 3 != 0) {
            IO.println("Es sincrónica.");
        } else {
            IO.println("la clase " + numeroClase + " es asincrónica");
        }
    }


    //  Responder cuántos encuentros asincrónicos tendría el módulo.
        //desde la primera clase hasta la cantidadClasesTotal cuantas son asincronicas

        int contadorAsincronicas=0;

        for(int i=1; i <= cantidadClasesTotal; i++){
            if(i %3 == 0){
              //contadorAsincronicas++;
                // contadorAsincronicas= contadorAsincronicas+1;
                contadorAsincronicas+= 1;
            }


        }
    System.out.println("la cantidad de clases asincrónicas es: "+ contadorAsincronicas);


    //Contabilizar de forma regresiva la cantidad de clases sincrónicas que habría partiendo de un número
    // de clase ingresado en consola. ( Ver la posibilidad del do while si la clase no existe).

   // int contadorClase=cantidadClasesTotal;

    int contadorSincronicas=0;

    Scanner scanner= new Scanner(System.in);

    System.out.println("Ingresa en n° de clase límite.");
    int contadorClase= scanner.nextInt();


    while(contadorClase > 0 ){
        if( contadorClase%3 != 0 ){
          //  System.out.println("la clase "+ contadorClase + " es sincrónica.");
            contadorSincronicas++;
        }
        contadorClase -- ;
    }

    System.out.println("la cantidad de clases sincro. : "+ contadorSincronicas);


    //  Al recibir una nota numérica imprimir la nota de concepto teniendo en cuenta que del 1 al 3 es desaprobado,
    //  del 4 al 7 aprobado y del 8 al 10 excelente.

    //reutilizar scanner

    System.out.println("Ingresa la nota numérica.");
    int nota= scanner.nextInt();

    switch(nota){
        case 1,2,3 -> IO.println(" desaprobado");
        case 4,5,6,7 -> IO.println("aprobado.");
        case 8,9,10 -> IO.println("excelente.");
        default -> IO.println("Ingresa un n° válido.");
    }



}






