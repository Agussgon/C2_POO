import java.util.Scanner;

public class Clase7 {

    static void main() {

        calcularCostoTotal(5000.0);

    }
//    Crea una función que solicite ingresar por consola el precio unitario de un producto
//    y la cantidad comprada, ingresando los valores como texto.
//    Debe calcular el total, y si el total supera cierto monto ingresado como parámetro
//    aplicar un descuento del 10%.
//    Imprimir el total formateado como String.

    public static void calcularCostoTotal( Double montoHabilitaPromo ){
        //scanner pedimos precio y cantidad
        Scanner scanner = new Scanner(System.in);
        IO.println("Ingresa el precio unitario: ");
        String precioS= scanner.nextLine();

        IO.println("Ingresa la cantidad: ");
        String cantidadS= scanner.nextLine();

        //parseo
        Double precio= Double.valueOf(precioS.strip());
        Integer cantidad= Integer.parseInt(cantidadS.strip());

        //calculamos el total
        Double total= precio*cantidad;
        //verificamos si tiene promo

        if(total > montoHabilitaPromo){
            //calcular la promo
            total= total - (total*0.1);
            IO.println("El precio promocional total es: "+ String.valueOf(total)  );
        }else{
            IO.println("El precio total sin descuento es: "+ Double.toString(total) );
        }

        scanner.close();
    }

}
