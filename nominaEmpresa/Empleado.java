public class Empleado {
    private String codigoCarnet, nombre ,apellido;

    public Empleado(String codigoCarnet, String nombre, String apellido) {
        this.codigoCarnet = codigoCarnet;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "\ncodigo: " + codigoCarnet + ", nombre: " + nombre + ", apellido: " + apellido +", ";
    }
    
}