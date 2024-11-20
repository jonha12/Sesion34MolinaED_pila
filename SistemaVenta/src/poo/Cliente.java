
package poo;


public class Cliente {
    private int folio;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int folio, String nombre, String telefono, String direccion) {
        this.folio = folio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
