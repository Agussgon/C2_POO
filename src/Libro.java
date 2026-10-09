public class Libro {
    private final int CODIGO;
    private String titulo;
    private String autor;
    private double precioCosto;
    private double precioVenta;
    private int stock;
    // estáticas

    private static int stock_promo;

    public Libro(int CODIGO, String titulo, String autor, double precioCosto, int stock) {
        this.CODIGO = CODIGO;
        this.titulo = titulo;
        this.autor = autor;
        this.precioCosto = precioCosto;
        this.precioVenta = precioCosto+ precioCosto*0.3;
        this.stock = stock;
    }

    public void setStock(int stock) {
        //validar que sea al menos >=0
        this.stock = stock;
    }

    public void agregarStock(int stockNuevo) {
        //validar que sea al menos >=0
        if (stockNuevo <= 0) {
            IO.println("Ingrese uan cantidad válida.");
        } else {
            this.stock += stockNuevo;
            IO.println("Se agrego nuevo stock .");
        }
    }

    public void restarStock(int stock) {
        //validar que sea al menos >=0
        if (stock <= 0) {
            IO.println("Ingrese una cantidad válida.");
        } else if (stock > this.stock) {
            IO.println("Supera la cantidad de stock disponible.");
        } else {
            this.stock -= stock;
            IO.println("Se actualizo por ventas el stock.");
        }
    }


    //

    public static void setStock_promo(int stock_nuevo) {
        //validar que sea al menos >=0
        if (stock_nuevo <= 0){
            IO.println("Ingrese una cantidad válida.");
        }else{
         stock_promo= stock_nuevo;
            IO.println("Actualizado el stock que activa la promo."+
                    stock_promo);
        }
    }

    //calcular precio final

    public double calcularPrecioFinal(){
        if(this.stock > stock_promo){
            double precioFinal= this.precioVenta - this.precioVenta*0.15; //precioVenta*0.85
        //evaluar que no fuera menor al precio de costo
            return precioFinal;
        }else{
            return this.precioVenta;
        }
    }


//métodos que utilizará el empleado

    public String getTitulo(){
        return this.titulo;

    }
    public int getStock() {
        return stock;
    }
}
