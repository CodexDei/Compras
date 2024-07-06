import java.util.Date;

public class OrdenCompra {

    //Atributos de la clase
    private Integer idCompra;
    private String descripcionCOmpra;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto;
    private int granTotalPrecios = 0;

    //COntructores de la clase
    //Constructor sin parametros
    public OrdenCompra(){

        this.idCompra++;
        productos = new Producto[4];
    }

    //COntructores con parametros
    public OrdenCompra(String descripcionCOmpra){

        this.descripcionCOmpra = descripcionCOmpra;
    }

    //Metodos getters
    public Integer getIdCompra() {
        return idCompra;
    }

    public String getDescripcionCOmpra() {
        return descripcionCOmpra;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getGranTotalPrecios() {
        return granTotalPrecios;
    }
    //metodos setters

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //metodo add
    public void addProducto(Producto producto){
        this.productos[indiceProducto++] = producto;
    }

    //metodos de la clase
    public int granTotal (int precio){

        this.granTotalPrecios += precio;
        return this.granTotalPrecios;
    }

    @Override
    public String toString() {

        String impresion;

         impresion = "FACTURA\n\n" +
                "idCompra=" + idCompra + "\n" +
                ", descripcionCOmpra='" + descripcionCOmpra + "\n" +
                ", fecha=" + fecha + "\n" +
                ", cliente=" + cliente + "\n" +
                ", productos=" + "\n";

                 if(productos != null) {
                     for (Producto producto: productos){
                         impresion += "Fabricante: " + producto.getFabricante() + "\n"
                         + "Nombre: " + producto.getNombre() + "\n"
                         + "Precio " + producto.getPrecio();
                     }
                 }

                 impresion +=
                 "indiceProducto=" + indiceProducto + "\n" +
                ", granTotalPrecios=" + granTotalPrecios;

        return impresion;
    }
}
