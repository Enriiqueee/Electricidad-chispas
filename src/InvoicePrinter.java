public class InvoicePrinter {
    public void printFactura(Factura factura){
        System.out.println("Factura: " + factura.getCodigofactura() + " | " + factura.getVenta() + "|" + factura.getFfactura());
        System.out.println("Cliente: " +factura.getCliente().getId()+ " | " +factura.getCliente().getNombre()+ " | " +factura.getCliente().getPoblacion()+ " | " + factura.getCliente().getProvincia()+ " | " +factura.getCliente().getEmail());
        System.out.println("Linea Venta (producto/servicio): " +factura.getVenta().getCodigoproducto()+ " | " +factura.getVenta().getNombre()+ " | " +factura.getVenta().getPrecio()+ " | " +factura.getVenta().getIVA()+ " | " +factura.getTota());
        System.out.println("Total: " +factura.getTota());
    }
}
