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
        this.nombre=nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellido(String apellidos) {
        this.apellidos=apellidos;
    }

    @Override
    public String getId() {
        return DNI;
    }

    @Override
    public void setId(String Id) {
        this.DNI=Id;
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
