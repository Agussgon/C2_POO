import java.time.LocalDate;

public class Main {


    static void main() {

//        Producto producto1= new Producto(123,"Cafe",20,5000.0,
//                8000.0);

        Producto producto1= new Producto(123,"Cafe",5000.0);

//        IO.println("cantidad de stock: "+ producto1.getStock());
//
//        producto1.setStock(10);
//
//        IO.println("cantidad de stock: "+ producto1.getStock());
//
//        producto1.agregarStock(-5);
//        IO.println("cantidad de stock: "+ producto1.getStock());
//
//        producto1.quitarStock(5);
//        IO.println("cantidad de stock: "+ producto1.getStock());
//
//        producto1.quitarStock(11);
//
//        IO.println("cantidad de stock: "+ producto1.getStock());


        producto1.setPrecioVenta(4000.0);
        IO.println("consultando valores \n prcio de costo: "+ producto1.getPrecioCosto()
        +"\n precio de venta: "+ producto1.getPrecioVenta());



        IO.println("consultar disponibilidad: "+ producto1.consultarDisponibilidad()+ "\n" +
                "calcular ganancia total: "+ producto1.calcularGananciaTotal());


        producto1.setNombre("A13");
        IO.println("el nombre luego de modificarlo: "+ producto1.getNombre() );


        //probar promoción por categoría
        producto1.setCategoria("bazar");
        producto1.setStock(20);
        IO.println("Calcular precio final "+ producto1.calcularPrecioFinal());
    }



}
