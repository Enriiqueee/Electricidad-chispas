public class Servicio implements venta{
    private Integer codigoservicio;
    private String nombre;
    private Integer precio;
    private String IVA;

    @Override
    public Integer getCodigoproducto() {
        return codigoservicio;
    }

    @Override
    public void setCodigoproducto(Integer codigoproducto) {
        this.codigoservicio=codigoproducto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public Integer getPrecio() {
        return getPrecio();
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio=precio;
    }

    @Override
    public String getIVA() {
        return IVA;
    }

    @Override
    public void setIVA(String IVA) {
        this.IVA=IVA;
    }
}
