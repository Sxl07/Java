public class Temporal extends Empleado{
    private double total;
    private int horas;

    public Temporal(String codigoCarnet, String nombre, String apellido, int horas) {
        super(codigoCarnet, nombre, apellido);
        setTotal(horas);
    }

    public void setTotal(int horas) {
        this.horas = horas;
        this.total = this.horas*7;
    }
    public double getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        return super.toString()+"total devengado: $" + getTotal() + "USD";
    }

    
    
    
}
