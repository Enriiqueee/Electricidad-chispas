public class Autonomo implements Clientes{
    private String nombre;
    private String apellidos;
    private String DNI;
    private Integer direccionpostal;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String name) {

    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellido(String apellidos) {

    }

    @Override
    public String getId() {
        return DNI;
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
