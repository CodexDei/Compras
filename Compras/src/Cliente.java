public class Cliente {

    private String nombre;
    private String apellido;

    //Contructores
    //Contructor con parametros
    public Cliente(String nombre, String apellido){

        this.nombre = nombre;
        this.apellido = apellido;
    }

    //metodos getters
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }
}
