package domain;

public class Tienda {
    private int numero;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String rfc;
    private Cliente[] clientes;
    private static int MAX_CLIENTES = 1000;

    public Tienda(int numero, String domicilio, String telefono, String rfc, String nombre) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.rfc = rfc;
        this.nombre = nombre;
        clientes = new Cliente[MAX_CLIENTES];        
    }
       
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void agregarCliente(Cliente cliente){
        for (int i = 0; i < MAX_CLIENTES; i++) {
            if(clientes[i] == null){
                clientes[i] = cliente;
                break;
            }
        }
    }
        
    public void eliminarCliente(Cliente cliente){
        for (int i = 0; i < MAX_CLIENTES; i++) {
            if(clientes[i].getNumero() == cliente.getNumero() &&
               clientes[i].getRfc() == cliente.getRfc()){
                clientes[i] = null;
                break;
            }
        }        
    }
    
    public void display(){
        System.out.println(".......DATOS DE LA TIENDA.......");
        System.out.println("Número: " + this.getNumero());
        System.out.println("Nombre: " + this.getNombre());

        System.out.println("Clientes:");
        char separador = '║';
        for (Cliente cliente : clientes) 
            if (cliente != null)
                System.out.println(new StringBuilder("\t")
                                    .append("Numero: ").append(cliente.getNumero()).append(separador)
                                    .append("Nombre: ").append(cliente.getNombre()).append(separador)
                                    .append("Email: ").append(cliente.getEmail())                        
                                    .toString());
        
        System.out.println("...............................");
    }
}
