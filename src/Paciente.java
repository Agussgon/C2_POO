import java.util.ArrayList;

public class Paciente {

    private String nombre;
    private ArrayList<Turno> turnos= new ArrayList<>();

    public Paciente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", turnos=" + turnos +
                '}';
    }

 //consultar todos los turnos
    public  ArrayList<Turno> getTurnos(){
        return this.turnos;
    }

    //agregar
    public void agregarTurno(Turno turnoNuevo){
        //validaciones
        if(turnoNuevo == null){
            IO.println("No se ha guardado, datos incorrectos.");
        }else if( this.turnos.contains(turnoNuevo)){
            IO.println("Ya se encuentra registrado.");
        }else{
            this.turnos.add(turnoNuevo);
            IO.println("Su turno se ha registrado de forma exitosa.");
        }

    }

    //eliminar
    public void eliminarTurno(Turno turno) {
        //validaciones
        if(turno == null){
            IO.println("Ingresó datos incorrectos.");
        }else{
            IO.println("¿El turno ingresado se encuentra registrado? "+
                    this.turnos.contains(turno)
                    );

            IO.println("¿Turno eliminado? "+  this.turnos.remove(turno));


        }
    }

    //reemplazar
    public void modificarTurno(int nTurno, Turno turno){

        for(int i=0; i < this.turnos.size(); i++){
            //primero accedo al objeto turno
            Turno turnoListado= this.turnos.get(i);
            //accedo a la propiedad n° de turno de ese turno
            if(nTurno == turnoListado.getnTurno()){
                this.turnos.set(i,turno);  // reemplazamos todo el turno
                IO.println("Turno reemplazado");
                break;
            }

        }

    }




}
