public class Tratamiento {

    private String descripcion;

    public Tratamiento(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
