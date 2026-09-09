import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    static void main() {

        Producto[] productos= new Producto[3];

        IO.println(crearYguardarProductos(productos));



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


//        producto1.setPrecioVenta(4000.0);
//        IO.println("consultando valores \n prcio de costo: "+ producto1.getPrecioCosto()
//        +"\n precio de venta: "+ producto1.getPrecioVenta());
//
//
//
//        IO.println("consultar disponibilidad: "+ producto1.consultarDisponibilidad()+ "\n" +
//                "calcular ganancia total: "+ producto1.calcularGananciaTotal());
//
//
//        producto1.setNombre("A13");
//        IO.println("el nombre luego de modificarlo: "+ producto1.getNombre() );
//
//
//        //probar promoción por categoría
//        producto1.setCategoria("bazar");
//        producto1.setStock(20);
//        IO.println("Calcular precio final "+ producto1.calcularPrecioFinal());
    }

    public static String crearYguardarProductos(Producto[] productos ){

        //inicio las variables que requiero
        Scanner scanner= new Scanner(System.in);
        boolean continuar= true;
        int contadorIndice=0;

        while(continuar && contadorIndice < productos.length) {
            IO.println("Ingresa en orden el código, el nombre y precio de costo del producto separados por coma. Al finalizar presiona enter.");
            String datos = scanner.nextLine();
            String[] datosSeparados = datos.split(",");

            //conversión
            Integer codigo = Integer.valueOf(datosSeparados[0]);
            Double precioCosto = Double.valueOf(datosSeparados[2]);

            //crear el producto
            Producto producto = new Producto(codigo, datosSeparados[1], precioCosto);
            productos[contadorIndice] = producto;
            contadorIndice++;

            if(contadorIndice == productos.length){
                IO.println("Completo la capacidad de registro.");
            }else{
            IO.println("Quiere continuar cargando productos? ");
            continuar= scanner.nextBoolean();
            scanner.nextLine();
            }

        }

        return Arrays.toString(productos);


    }





}
