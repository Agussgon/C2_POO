public class Socia {
    private String nombre;
    private final int DNI;
    private int nSocia;
    private int puntosDisponibles=100;

    //atributo de clase
    private static int limitePuntosTransferibles =500;

    public Socia( String nombre, int DNI, int nSocia){
        this.nombre=nombre;
        this.DNI= DNI;
        this.nSocia =nSocia;
    }

    //
    public static void setLimitePuntosTransferibles(int nuevoValorLimite){
        if(nuevoValorLimite < 1) IO.println("Ingresa un valor positivo.");
        else limitePuntosTransferibles = nuevoValorLimite;
    }

    //cnsultar el LPT
    public int getLimitePuntosTransferibles(){
        return limitePuntosTransferibles;
    }


    //regalar
    public void regalarPuntos(int puntos, Socia otroSocio){
        if(puntos < 1) IO.println("Ingresa un valor positivo.");
        else if(puntos > limitePuntosTransferibles) IO.println("No debe superar el límite establecido " +
                "de transferencia. "
        +limitePuntosTransferibles);
        else if( puntos > this.puntosDisponibles) IO.println("Supera los puntos disponibles.");
        else{
            this.puntosDisponibles -= puntos;
            //otroSocio.puntosDisponibles += puntos;
            otroSocio.recibirPuntos(puntos);


            IO.println("Los saldos quedan de la siguiente forma: "+ this.puntosDisponibles +" y "+ otroSocio.puntosDisponibles);

        }
    }
    //recibir 2% comisión
    private void recibirPuntos(int puntos){
        if(puntos < 1) IO.println("Ingresa un valor positivo.");
        else{
            double comision= puntos*0.02;
            int puntosNuevos=   (int)(Math.round(puntos - comision));
            this.puntosDisponibles += puntosNuevos ;
        }
    }




}
