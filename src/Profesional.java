public class Profesional {

    private final int MATRICULA;

    public Profesional(int MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "MATRICULA=" + MATRICULA +
                '}';
    }
}
