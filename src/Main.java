import traslados.Chofer;
import traslados.RegistroChoferes;
import traslados.Vehiculo;

import java.util.ArrayList;

public class Main {


    static void main() {


        //registrar choferes idealmente -->  ingresarían los datos con scanner
        RegistroChoferes registro= new RegistroChoferes();


        Vehiculo auto1= new Vehiculo("203", "wer123","ford",
                "aer123","400hp" );


        Chofer chofer1= new Chofer("Juan", 123,auto1 );


        registro.registrarChofer(chofer1);

        IO.println(registro.getChoferes());


//----------------------Probando métodos de ArrayList desde la clase Chofer

        chofer1.agregarAuto(new Vehiculo("205", "yer123","ford",
                "a123","450hp"));

//        chofer1.agregarAuto(new Vehiculo("5", "yr123","ford",
//                "a123","450hp"));

        //validaciones al agregar

        //Ingrese un auto válido para el registro.
        chofer1.agregarAuto(null);

        //Ya tiene ese vehiculo registrado.
        chofer1.agregarAuto(auto1);
        //Superaría la cantidad de autos asociados.
        chofer1.agregarAuto(new Vehiculo("50", "yr1f23","ford",
                "a123","450hp"));

        //consultar
        IO.println(chofer1.getAutos());

        //eliminar
        chofer1.desasociarAuto(auto1);

        //eliminar un auto inexistente
        chofer1.desasociarAuto(auto1);

        //consultar
        IO.println(chofer1.getAutos());

        //buscar patente
        chofer1.consultarPatenteAsociada("yer123");
        chofer1.consultarPatenteAsociada("no existe.");
        chofer1.consultarPatenteAsociada("yer124");


        // listar patentes asoc
         chofer1.visualizarPatentesAsociadas();



        //----- Ejemplo de Array vs ArrayList


//        //Array estático

//
//        int[] numeros= {1,2,3,4,5};
//        IO.println(numeros[3]); //acceder a un elemento 4
//
//        //array dinámico
//        ArrayList<Integer> numerosList= new ArrayList<>();
//        numerosList.add(1);
//        numerosList.add(2);
//
//        IO.println(numerosList.get(1) );
//        numerosList.remove(1);
//
//
//        IO.println("Cantidad de elementos del arraylist " + numerosList.size()
//        +"\n array completo "+ numerosList);

    }

}
