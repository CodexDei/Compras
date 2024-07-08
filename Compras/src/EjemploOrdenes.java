import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        //ORDEN DE COMPRA # 1
        // se crea el objeto ordenCompra1, usando constructor que inicializa el id de la compra y la descripcion, ya que
        // el constructor que solo inicializa la descripcion, llama al contructor sin parametros que inicializa id de la
        // compra y arreglo productos
        OrdenCompra ordenCompra1 = new OrdenCompra("Celulares");

        //se crea objeto fecha para la orden de compra
        Date fecha1 = new Date();
        fecha1.getTime();

        //se crea objeto cliente para la orden de compra
        Cliente cliente1 = new Cliente("Luis", "Castillo");

        //se crean los objetos productos para la orden de compra
        //Orden de celulares segun indica la "descripcion"
        Producto[] productosOrden1 = new Producto[4];

        productosOrden1[0] = new Producto(Celulares.RedmiNote11.getFabricanteCelular(), Celulares.RedmiNote11.getNombreCelular(),
                                Celulares.RedmiNote11.getPrecioCelular());
        productosOrden1[1] = new Producto(Celulares.iPhone15ProMax.getFabricanteCelular(), Celulares.iPhone15ProMax.getNombreCelular(),
                                Celulares.iPhone15ProMax.getPrecioCelular());
        productosOrden1[2] = new Producto(Celulares.SamsungGalaxyS24Ultra.getFabricanteCelular(), Celulares.SamsungGalaxyA545G.getNombreCelular(),
                                Celulares.SamsungGalaxyS24Ultra.getPrecioCelular());
        productosOrden1[3] = new Producto(Celulares.MotorolaMotoG22.getFabricanteCelular(), Celulares.MotorolaMotoG22.getNombreCelular(),
                                Celulares.MotorolaMotoG22.getPrecioCelular());

        //se llaman los stters de fecha y cliente para enviarles los objetos anteriores para la orden de compra
        ordenCompra1.setFecha(fecha1);
        ordenCompra1.setCliente(cliente1);
        ordenCompra1.addProducto(productosOrden1[0]);
        ordenCompra1.addProducto(productosOrden1[1]);
        ordenCompra1.addProducto(productosOrden1[2]);
        ordenCompra1.addProducto(productosOrden1[3]);
        //Se envian precios de los productos a metodo gran total para obtener el total de la compra
        ordenCompra1.granTotal(productosOrden1[0].getPrecio());
        ordenCompra1.granTotal(productosOrden1[1].getPrecio());
        ordenCompra1.granTotal(productosOrden1[2].getPrecio());
        ordenCompra1.granTotal(productosOrden1[3].getPrecio());
        //Imprsion Orden # 1
        System.out.println(ordenCompra1.toString());

        //ORDEN DE COMPRA # 2
        //Descripcion de la compra se inicializa con laptops
        OrdenCompra ordenCompra2 = new OrdenCompra("LAPTOPS");
        //Se genera fecha2 para capturar fecha actual para la orden 2
        Date fecha2 = new Date();
        fecha2.getTime();
        //nuevo cliente para la orden 2
        Cliente cliente2 = new Cliente("Marye", "Hortua");
        //Se generan los productos para la orden 2
        Producto[] productosOrden2 = new Producto[4];

        productosOrden2[0] = new Producto(Laptops.LenovoLOQ16.getFabricanteLaptop(), Laptops.LenovoLOQ16.getNombreLaptop(),
                                Laptops.LenovoLOQ16.getPrecioLaptop());
        productosOrden2[1] = new Producto(Laptops.HP240G9.getFabricanteLaptop(), Laptops.HP240G9.getNombreLaptop(),
                                Laptops.HP240G9.getPrecioLaptop());
        productosOrden2[2] = new Producto(Laptops.ASUSVivobookX1504ZANJ372.getFabricanteLaptop(), Laptops.ASUSVivobookX1504ZANJ372.getNombreLaptop(),
                                Laptops.ASUSVivobookX1504ZANJ372.getPrecioLaptop());
        productosOrden2[3] = new Producto(Laptops.LenovoIdeaPadSlim315IAH8.getFabricanteLaptop(), Laptops.LenovoIdeaPadSlim315IAH8.getNombreLaptop(),
                                Laptops.LenovoIdeaPadSlim315IAH8.getPrecioLaptop());

        //Se inicializan datos usando setters para la orden # 2
        ordenCompra2.setFecha(fecha2);
        ordenCompra2.setCliente(cliente2);
        ordenCompra2.addProducto(productosOrden2[0]);
        ordenCompra2.addProducto(productosOrden2[1]);
        ordenCompra2.addProducto(productosOrden2[2]);
        ordenCompra2.addProducto(productosOrden2[3]);
        //obtenemos el precio de cada producto con "get precio" y lo enviamos a gran total para obtener la suma total de la orden # 2
        ordenCompra2.granTotal(productosOrden2[0].getPrecio());
        ordenCompra2.granTotal(productosOrden2[1].getPrecio());
        ordenCompra2.granTotal(productosOrden2[2].getPrecio());
        ordenCompra2.granTotal(productosOrden2[3].getPrecio());
        //Impresion Orde # 2
        System.out.println(ordenCompra2.toString());


        //ORDEN DE COMPRA # 3
        //se crea un objeto ordencompra3 para la orden # 3
        OrdenCompra ordenCompra3 = new OrdenCompra("PIANOS");
        //Se crea un objeto tipo fecha para la orden # 3
        Date fecha3 = new Date();
        fecha3.getTime();
        //se crea un obejto tipo cliente para la orden # 3
        Cliente cliente3 = new Cliente("Samy", "Acosta");
        //Se crea un arreglo para almacenar los productos para la orden # 3
        Producto[] productosOrden3 = new Producto[4];

        productosOrden3[0] = new Producto(Pianos.YamahaU3.getFabricantePiano(), Pianos.YamahaU3.getNombrePiano(),
                                Pianos.YamahaU3.getPrecioPiano());
        productosOrden3[1] = new Producto(Pianos.KawaiK300.getFabricantePiano(), Pianos.KawaiK300.getNombrePiano(),
                                Pianos.KawaiK300.getPrecioPiano());
        productosOrden3[2] = new Producto(Pianos.RolandRP100.getFabricantePiano(), Pianos.RolandRP100.getNombrePiano(),
                                Pianos.RolandRP100.getPrecioPiano());
        productosOrden3[3] = new Producto(Pianos.KorgKROSS288.getFabricantePiano(), Pianos.KorgKROSS288.getNombrePiano(),
                                Pianos.KorgKROSS288.getPrecioPiano());

        //setters y addProductos para modificar variables
        ordenCompra3.setFecha(fecha3);
        ordenCompra3.setCliente(cliente3);
        ordenCompra3.addProducto(productosOrden3[0]);
        ordenCompra3.addProducto(productosOrden3[1]);
        ordenCompra3.addProducto(productosOrden3[2]);
        ordenCompra3.addProducto(productosOrden3[3]);
        //llamamos metodo
        ordenCompra3.granTotal(productosOrden3[0].getPrecio());
        ordenCompra3.granTotal(productosOrden3[1].getPrecio());
        ordenCompra3.granTotal(productosOrden3[2].getPrecio());
        ordenCompra3.granTotal(productosOrden3[3].getPrecio());

        //Imprimir orden # 3
        System.out.println(ordenCompra3.toString());
    }
}
