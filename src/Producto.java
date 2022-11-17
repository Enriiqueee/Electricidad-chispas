public class Producto implements venta{
    private Integer codigoproducto;
    private String nombre;
    private String marca;
    private String modelo;
    private Integer precio;
    private String IVA;

    @Override
    public Integer getCodigoproducto() {
        return codigoproducto;
    }

    @Override
    public void setCodigoproducto(Integer codigoproducto) {
        this.codigoproducto=codigoproducto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getMarca() {
        return marca;
    }
        public void setMarca(String marca){
            this.marca=marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    @Override
    public Integer getPrecio() {
        return precio;
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
