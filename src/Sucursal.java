import java.util.ArrayList;

public class Sucursal {

    private final int ID;
    private Empleado empleado;
    private ArrayList<Libro> libros= new ArrayList<>(); //importante


    // visualizar la composición y la agregación
    public Sucursal(int ID, int DNI, String nombre, String turno, int tel) {
        this.ID = ID;
        this.empleado = new Empleado(DNI,nombre,turno,tel);
    }
    //reemplazar empleado
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void agregarLibro(Libro libro){
        //validar que no sea nulo -- else if
        if(libros.contains(libro)){
            IO.println("El libro ya se encontraba registrado en la sucursal.");
        }else{
            libros.add(libro);
            IO.println("Registrado.");

        }
    }

    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }

    //istar titulos de los libros

    public ArrayList<Libro> getLibros() {
        return libros;
    }
}

