import java.time.LocalDate;

public class Turno {

    private int nTurno;
    private LocalDate fecha;
    private Paciente paciente;
    private Profesional profesional;
    private Tratamiento tratamiento;

    public Turno(int nTurno, LocalDate fecha, Paciente paciente, Profesional profesional, Tratamiento tratamiento) {
        this.nTurno = nTurno;
        this.fecha = fecha;
        this.paciente = paciente;
        this.profesional = profesional;
        this.tratamiento = tratamiento;
    }

    public Turno(int nTurno, Paciente paciente, Profesional profesional, Tratamiento tratamiento) {
        this.nTurno = nTurno;
        this.paciente = paciente;
        this.profesional = profesional;
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "nTurno=" + nTurno +
                ", fecha=" + fecha +
                ", profesional=" + profesional +
                ", tratamiento=" + tratamiento +
                '}';
    }


    //get para encapsulamiento


    public int getnTurno() {
        return nTurno;
    }
}
