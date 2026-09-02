import java.time.LocalDate;

public class Main {


    static void main() {

        //creamos una instancia(objeto) de la clase Cliente
        Cliente cliente1= new Cliente("Juan",12345678);


        Venta venta1= new Venta(LocalDate.of(2026,8,20),30000.0,
                new String[]{"cafe","tostado"},cliente1);


        //fecha actual LocalDate.now()

        //quiero actualizar el nombre del cliente1
       //ESTO NO -->  cliente1.nombre= "Luis" ;
        IO.println(cliente1.getNombre());

        cliente1.setNombre("luz");

        IO.println("el nombre actualizado es: "+cliente1.getNombre());

        IO.println("Consultando últimos digitos del tel: "+ cliente1.getTel());

        //calcular dias transcurridos de la compra

        IO.println(" "+ venta1.calcularDiasTranscurridosDeLaVenta());

    }
}
