public class Regular extends Empleado{
    private double sueldo;

    public Regular(String codigoCarnet, String nombre, String apellido, double sueldo) {
        super(codigoCarnet, nombre, apellido);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"total devengado: $" + sueldo + "USD";
    }   
}
