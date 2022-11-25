public class Main {
    public static void main(String[] args) {
        Autonomo autonomo = new Autonomo();
        autonomo.setId("1");
        autonomo.setNombre("Enrique");
        autonomo.setApellido("Arenas");
        autonomo.setPoblacion("Ávila");
        autonomo.setProvincia("Ávila");
        autonomo.setDireccionpostal(05003);
        autonomo.setEmail("email@gmail.com");
        autonomo.setTelefono(652986880);

        Sociedad sociedad = new Sociedad();
        sociedad.setId("2");
        sociedad.setPoblacion("Ávila");
        sociedad.setProvincia("Ávila");
        sociedad.setDireccionpostal(00504);
        sociedad.setEmail("email@gmail.com");
        sociedad.setTelefono(918660434);


        printCLiente((autonomo));
        printCLiente(sociedad);
    }
    public static void printCLiente(Clientes clientes){
        System.out.println("Cod " +clientes.getId()+ " Nombre "+ clientes.getNombre());
    }
}