import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class OrdenCompra {

    //Atributos de la clase
    //Atributos estaticos
    private static Integer idCompra = 1000;
    //Atributos no estaticos
    private String descripcionCOmpra;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto;
    private int granTotalPrecios = 0;

    //COntructores de la clase
    //Constructor sin parametros
    public OrdenCompra(){

        idCompra++;
        productos = new Producto[4];
    }

    //COntructores con parametros
    public OrdenCompra(String descripcionCOmpra){

        this();
        this.descripcionCOmpra = descripcionCOmpra;
    }

    //Metodos getters
    public static Integer getIdCompra() {
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

    public int getIndiceProducto() {
        return indiceProducto;
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
        if(producto < indiceProducto)
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

        NumberFormat monedaColombiana = NumberFormat.getCurrencyInstance(new Locale("Es", "CO"));

         impresion = "ORDE DE COMPRA:\n\n" +
                "idCompra=" + getIdCompra() + "\n" +
                "descripcionCOmpra=" + getDescripcionCOmpra() + "\n" +
                "fecha=" + getFecha() + "\n" +
                "cliente=" + getCliente().getNombre() + " " + getCliente().getApellido() + "\n\n" +
                "productos=" + "\n\n";

                 if(getProductos() != null) {
                     for (Producto producto: getProductos()){
                         impresion += "Fabricante: " + producto.getFabricante() + "\n"
                         + "Nombre: " + producto.getNombre() + "\n"
                         + "Precio " + monedaColombiana.format(producto.getPrecio()) + "COP" + "\n\n";
                     }
                 }

                 impresion +=
                 "Cantidad de productos=" +  getIndiceProducto() + "\n" +
                 "Gran total=" + monedaColombiana.format(getGranTotalPrecios()) + " COP";

        return impresion;
    }
}
