package Ejercicio_9;

public class Persona {
    private String nombre;
    private String apellido;
    private String apodo;
    private int edad;
    private Integer DNI;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String apodo, int edad, Integer DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", apodo='" + apodo + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                '}';
    }
}
