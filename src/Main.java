import traslados.Chofer;
import traslados.Vehiculo;

public class Main {


    static void main() {

        //registrar choferes
        Vehiculo auto1= new Vehiculo("203", "wer123","ford",
                "aer123","400hp" );

        Chofer chofer1= new Chofer("Juan", 123,auto1 );


        IO.println(chofer1);


    }

}
