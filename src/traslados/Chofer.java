package traslados;

public class Chofer {

    private String nombre;
    private final int N_REGISTRO;
    private Vehiculo auto;

    //instancias independendientes
    public Chofer(String nombre, int n_REGISTRO, Vehiculo auto) {
        this.nombre = nombre;
        N_REGISTRO = n_REGISTRO;
        this.auto = auto;
    }


    @Override
    public String toString() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", N_REGISTRO=" + N_REGISTRO +
                ", auto=" + auto +
                '}';
    }
}
