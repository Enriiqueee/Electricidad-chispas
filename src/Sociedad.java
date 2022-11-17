public class Sociedad implements Clientes {
    private String razonsocial;
    private String CIF;
    private Integer direccionpostal;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;

    @Override
    public String getNombre() {
        return razonsocial;
    }

    @Override
    public void setNombre(String name) {

    }

    @Override
    public String getId() {
        return CIF;
    }

    @Override
    public void setId(String Id) {

    }

    @Override
    public Integer getDireccionpostal() {
        return direccionpostal;
    }

    @Override
    public void setDireccionpostal(Integer direccionpostal) {

    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {

    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {

    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public Integer getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(Integer telefono) {

    }
}
