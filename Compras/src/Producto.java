public class Producto {

    private String fabricante;
    private String nombre;
    private int precio;

    //Contructor
    //Constructor con parametros
    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    //getters
    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
