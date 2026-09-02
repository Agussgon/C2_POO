public class Cliente {

    //atributos que indican su estado
    private String nombre;
    private Integer tel;


    //métodos
    //constructor crea una nueva instancia
    public Cliente(String nombre, Integer tel){
        this.nombre=nombre;
        this.tel= tel;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombreNuevo){
        if(nombreNuevo == null || nombreNuevo.isBlank() || nombreNuevo.length() < 2){
            IO.println("No se actualizó, ingrese un nombre válido.");
        }else
        {this.nombre=nombreNuevo;}
    }

//CONVERSIÓN

    //ENCAPSULAMIENTO TEL

    public String getTel(){
        String telefonoString= String.valueOf(this.tel);
        return "**** "+ telefonoString.substring(4);
    }

}
