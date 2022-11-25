public class Factura {
    private String  codigofactura;
    private String ffactura;
    private Integer baseimponible;
    private Integer Tota;
    private Clientes cliente;
    private venta venta;

    public String getCodigofactura() {
        return codigofactura;
    }

    public void setCodigofactura(String codigofactura) {
        this.codigofactura = codigofactura;
    }
    public String getFfactura() {
        return ffactura;
    }

    public void setFfactura(String ffactura) {
        this.ffactura = ffactura;
    }
    public Integer getBaseimponible() {
        return baseimponible;
    }

    public void setBaseimponible(Integer baseimponible) {
        this.baseimponible = baseimponible;
    }

    public Integer getTota() {
        return Tota;
    }

    public void setTota(Integer tota) {
        Tota = tota;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public venta getVenta() {
        return venta;
    }

    public void setVenta(venta venta) {
        this.venta = venta;
    }

}
