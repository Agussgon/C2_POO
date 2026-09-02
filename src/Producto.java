public class Producto {

    private int codigo;
    private String nombre;
    private int stock;
    private double precioCosto;
    private double precioVenta;

    //constructor
    public Producto(int codigo, String nombre, int stock, double precioCosto, double precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
    }

    //consultar stock

    public int getStock(){
        return this.stock;
    }

    //reglas para modificar el stock



    public void setStock(int stock){
        if(stock <= 0) IO.println("Debe ingresar una cantidad igual o mayor a cero.");
        else this.stock=stock;
    }

    public void agregarStock(int stockNuevo){
        if(stockNuevo <= 0) IO.println("Debe ingresar una cantidad igual o mayor a cero.");
        else this.stock += stockNuevo;
    }

    public void quitarStock(int stockARetirar){
        if(this.stock < stockARetirar)
            IO.println("No hay suficientes unidades para retirar "+ stockARetirar);
        else this.stock-= stockARetirar ;
    }

    public boolean consultarDisponibilidad(){
        return this.stock > 0;
    }

    public double calcularGananciaTotal(){
        double gananciaTotal= (this.precioVenta-this.precioCosto)* this.stock;
        return  gananciaTotal;
    }


}
