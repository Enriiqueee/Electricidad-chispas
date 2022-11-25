public class Sociedad implements Clientes {
    private String Razonsocial;
    private String CIF;
    private Integer direccionpostal;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;

    @Override
    public String getNombre() {
        return Razonsocial;
    }

    @Override
    public void setNombre(String name) {
        this.Razonsocial=Razonsocial;
    }

    @Override
    public String getId() {
        return CIF;
    }

    @Override
    public void setId(String Id) {
        this.CIF=Id;
    }

    @Override
    public Integer getDireccionpostal() {
        return direccionpostal;
    }

    @Override
    public void setDireccionpostal(Integer direccionpostal) {
        this.direccionpostal=direccionpostal;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {
        this.poblacion=poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia=provincia;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public Integer getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(Integer telefono) {
        this.telefono=telefono;
    }
}
