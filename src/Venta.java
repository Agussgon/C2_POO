import java.time.LocalDate;
import java.time.Period;

public class Venta {

    private LocalDate fecha;
    private Double monto;
    private String[] items;
    private Cliente cliente;

    public Venta(LocalDate fecha, Double monto, String[] items, Cliente cliente ){
        this.fecha= fecha;
        this.monto= monto;
        this.items=items;
        this.cliente=cliente;
    }

    //CALCULAR DIAS TRANSCURRIDOS
    public int calcularDiasTranscurridosDeLaVenta(){
        int dias= Period.between(this.fecha, LocalDate.now()).getDays()  ;
        return dias;
        // doc MONTHS
    }



}
