package entitades;

public class Clientes {

    //atributos
    private String dni;
    private String nombre;
    private String telefono;
    private String direccion;
    
    // Constructor sin parametros
    public Clientes() {
    }
    
    // Constructor con parametros
    public Clientes(String dni, String nombre, String telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
}

