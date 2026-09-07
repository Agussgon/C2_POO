public class Producto {

    private final int CODIGO; // agregamos constantes
    private String nombre;
    private int stock;
    private double precioCosto;
    private double precioVenta;
    private final int STOCK_LIMITE_PROMOCION=15;
    private String categoria;

//    //constructor
//    public Producto(int codigo, String nombre, int stock, double precioCosto, double precioVenta) {
//        this.codigo = codigo;
//        this.nombre = nombre;
//        this.stock = stock;
//        this.precioCosto = precioCosto;
//        this.precioVenta = precioVenta;
//    }

    public Producto(int CODIGO,String nombre, double precioCosto){
        this.CODIGO= CODIGO;
        this.nombre=nombre;
        this.precioCosto=precioCosto;
        this.precioVenta= precioCosto + precioCosto*0.10;
    }


    //consultar stock

    public int getStock(){
        return this.stock;
    }

    //reglas para modificar el stock
    public void setStock(int stock){
        if(stock < 0) IO.println("Debe ingresar una cantidad igual o mayor a cero.");
        else this.stock=stock;
    }

    public void agregarStock(int stockNuevo){
        if(stockNuevo <= 0) IO.println("Debe ingresar una cantidad mayor a cero.");
        else this.stock += stockNuevo;
    }

    public void quitarStock(int stockARetirar){
        if(stockARetirar <= 0)IO.println("Debe ingresar una cantidad mayor a cero.");
        else if(this.stock < stockARetirar)
            IO.println("No hay suficientes unidades para retirar "+ stockARetirar);
        else this.stock= this.stock - stockARetirar ;
    }

    public boolean consultarDisponibilidad(){
        return this.stock > 0;
    }

    public double calcularGananciaTotal(){
        double gananciaTotal= (this.precioVenta-this.precioCosto)* this.stock;
        return  gananciaTotal;
    }
    //setters y getters de precios

    public double getPrecioCosto(){
        return this.precioCosto;
    }

    public double getPrecioVenta(){
        return this.precioVenta;
    }

    public void setPrecioVenta(double precioVentaNuevo){
        if( precioVentaNuevo <= this.precioCosto){
            IO.println("No puede ingresar un precio de venta menor al precio de costo, genera pérdida.");
        }else{ this.precioVenta = precioVentaNuevo;}
    }

    //métodos para el nombre


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank() || nombre.length() < 3){
            IO.println("Ingrese una descripción del producto válida.");
        }
        else if(nombre.matches(".*[0-9].*") ){
            IO.println("No se permiten n° en la descripción del producto.");
        }

//        String numeros="1234567890";
//        boolean numero=false;
//
//        for (int i = 0; i < nombre.length(); i++) {
//            if(numeros.indexOf(nombre.charAt(i)) != -1 ){
//                numero=true;
//                break;
//            }
//        }
//
//        if(numero){
//            IO.println("No se permiten n° en la descripción del producto."); }
        else{this.nombre = nombre;}
    }


    //SETTEO DE CONSTANTE --> ERROR - no se puede
//    public void setSTOCK_LIMITE_PROMOCION(int n){
//        this.STOCK_LIMITE_PROMOCION= n;
//    }

    //consulta de últimos 3 digitos del código para ver el sector
    public String consultarCODIGOSECTOR(){
        String codigoS= String.valueOf(CODIGO);
        String ultimos3= codigoS.substring(codigoS.length()-3);   //codigoS.substring(5); //si fueran 8 digitos
        return ultimos3;
    }

    //agregar métodos del nuevo atributo categoria


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //calcular precio final incluyendo promos >15 --> 0.1 && categoria.equals("bazar) --> 0.1
    public double calcularPrecioFinal(){
        double precioFinal= this.precioVenta;
        //promo categoría
        if(this.categoria.equals("bazar") ){
            double precioDescuento= precioFinal- precioFinal*0.1;
            if(precioDescuento < this.precioCosto){
                IO.println("No se aplica descuento, no puede ser menor al precio de costo.");
            }else{
                precioFinal= precioDescuento;
            }
        }
        //stock mínimo
        if(this.stock > this.STOCK_LIMITE_PROMOCION){
            double precioDescuento= precioFinal*0.9;
            if(precioDescuento < this.precioCosto){
                IO.println("No se aplica descuento, no puede ser menor al precio de costo.");
            }else{
                precioFinal= precioDescuento;
            }
        }
        return precioFinal;
    }


}
