//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.time.LocalDate;

public class Main{

    static void main() {

        //crear instancias de todas las clases

        Profesional profesional1=new Profesional(123);
        Paciente paciente1=new Paciente("Flor");
        Tratamiento tratamiento1= new Tratamiento("cosmetología");

        Turno turno1= new Turno(1, LocalDate.now(), paciente1,profesional1, tratamiento1);

        Turno turno2= new Turno(2,LocalDate.of(2026,11,30),paciente1,profesional1, tratamiento1);

//
        //visualizar info del turno 1

        IO.println(turno1);

        //Paciente maneja sus turnos

        paciente1.agregarTurno(turno1);
        paciente1.agregarTurno(turno2);
        //  paciente1.eliminarTurno(turno2);
        IO.println("consulta sus turnos "+ paciente1.getTurnos());

        paciente1.eliminarTurno(turno1);
        paciente1.modificarTurno(2,turno1);

        IO.println("consulta sus turnos "+ paciente1.getTurnos());




    }

}







