//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.time.LocalDate;

public class Main{

    static void main() {

        //creación de instancias
        Sucursal sucursal1= new Sucursal(1,2345678, "Luis","tarde",123);

        //libros son independientes el ciclo de vida
        Libro libro1= new Libro(1,"POO 1","Fontela",40000.0,3);
        Libro libro2= new Libro(2,"POO 2","Fontela",45000.0,5);

        //agregar y eliminar ejemplares
        sucursal1.agregarLibro(libro1);
        sucursal1.agregarLibro(libro2);
        sucursal1.eliminarLibro(libro1);

        sucursal1.getEmpleado().consultarStockPorTitulo("POO 2",sucursal1.getLibros() );

        //métodos de los libros algunos
        libro1.agregarStock(20);
        IO.println(libro1.calcularPrecioFinal());

        //método estático
        Libro.setStock_promo(50);
        IO.println(libro1.calcularPrecioFinal());





    }

}







