package entitades;

public class Pacientes {
    
    //atributos
    private String dni;
    private String nombre;
    private int edad;
    private String color;
    private String raza;
    private double peso;

    // Constructor sin parametros
    public Pacientes() {
    }
    
    // Constructor con parametros
    public Pacientes(String dni, String nombre, int edad, String color, String raza, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
        this.peso = peso;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", raza=" + raza + ", peso=" + peso + '}';
    }
    
}

