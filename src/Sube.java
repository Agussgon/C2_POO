public class Sube {

    //variables de clase
    private static double limiteSaldoNegativo=-2000;

    //variable de instancia --> objeto
    private final int NUMERO;
    private double saldo;

//constructor -- > nunca incluye variables estáticas
    public Sube(int NUMERO, double saldo) {
        this.NUMERO = NUMERO;
        this.saldo = saldo;
    }

    public Sube(int NUMERO){
        this.NUMERO=NUMERO;
    }

    public int getNUMERO(){
        return this.NUMERO;
    }

    //método de la clase --> no existe el this
    public static double getLimiteSaldoNegativo(){
        return  limiteSaldoNegativo;
    }

    public static void setLimiteSaldoNegativo(double saldo){
        if(saldo > limiteSaldoNegativo){
            IO.println("No se puede disminuir el saldo negativo disponible.");
        }else {  limiteSaldoNegativo=saldo;}
    }

    // método de la instancia
    public double getLimiteSaldoNegativoInstancia(){
        return limiteSaldoNegativo;
    }

    //este método no debe existir
//    public void setLimiteSaldoNegativoInstancia(double saldo){
//        limiteSaldoNegativo=saldo;
//    }

    // modificar el saldo de la instancia....
    public double getSaldo() {
        return saldo;
    }


    //volvemos a los métodos de la instancia

    //cargar y pagar viajes
    public void cargarSaldo( double monto ){

        //Y si el usuario se confunde? contemplarlo
        if(monto < 1 ) IO.println("Ingresa un monto válido");
        else
            this.saldo += monto;
    }

    public void pagarViaje( double viaje ){
        //acá es más importante esta validación ver el calculo de saldo final
        if(viaje < 1 ) IO.println("Ingresa un monto válido");
        else{
            double saldoFinal= this.saldo - viaje;

            if( saldoFinal < limiteSaldoNegativo){
                IO.println("Saldo insuficiente.");
            }else{
                this.saldo=saldoFinal;
            }

        }
    }

    //transferirle a otra sube

    public void transferirSaldo(double monto, Sube subeR){
        if(monto < 1) IO.println("Ingresa un monto válido.");
        else if(monto > this.saldo) IO.println("No cuenta con suficiente saldo. Saldo actual disponible: "+this.saldo);
        else{
            this.saldo -= monto;
            subeR.saldo += monto;

            IO.println("La sube que transfiere quedó con el siguiente saldo $ "+ this.saldo+ "\n La sube que recibe con $ "+ subeR.saldo);

        }

    }


}
