package domain;


public class Cliente extends Persona{
    private int numero;
    private String rfc;
    private String email;

    public Cliente(int numero, String nombre, String domicilio, String email ) {
        this.numero = numero;
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.email = email;        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}
