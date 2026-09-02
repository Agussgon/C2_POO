import java.time.LocalDate;

public class Main {


    static void main() {

        Producto producto1= new Producto(123,"Cafe",20,5000.0,
                8000.0);

        IO.println("cantidad de stock: "+ producto1.getStock());

        producto1.setStock(10);

        IO.println("cantidad de stock: "+ producto1.getStock());
        producto1.agregarStock(-5);

        IO.println("cantidad de stock: "+ producto1.getStock());
        producto1.quitarStock(5);

        IO.println("cantidad de stock: "+ producto1.getStock());

        producto1.quitarStock(11);

        IO.println("cantidad de stock: "+ producto1.getStock());

        IO.println("consultar disponibilidad: "+ producto1.consultarDisponibilidad()+ "\n" +
                "calcular ganancia total: "+ producto1.calcularGananciaTotal());


    }
}
