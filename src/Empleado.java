import java.util.ArrayList;

public class Empleado {
    private final int DNI;
    private String nombre;
    private String turno;
    private int tel;

    public Empleado(int DNI, String nombre, String turno, int tel) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.turno = turno;
        this.tel = tel;
    }

    public int consultarStockPorTitulo(String titulo, ArrayList<Libro> listadoLibros) {
        if (titulo == null || titulo.isBlank()) {
            IO.println("Ingrese un título válido.");
        } else {

            for (int i = 0; i < listadoLibros.size(); i++) {
                Libro libro= listadoLibros.get(i);
                if (libro.getTitulo().equals(titulo)) {
                    IO.println("EL TÍTULO BUSCADO TIENE LA SIGUIENTE CANTIDAD DE EJEMPLARES DISPONIBLES: "
                            + libro.getStock());
                    return libro.getStock();
                }
            }

        }
        return 0;
    }

}