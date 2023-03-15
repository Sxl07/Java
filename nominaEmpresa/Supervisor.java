public class Supervisor extends Empleado{
    private double sueldo,comision,total;

    public Supervisor(String codigoCarnet, String nombre, String apellido, double sueldo, double comision) {
        super(codigoCarnet, nombre, apellido);
        setTotal(sueldo,comision);
    }

    public void setTotal(double sueldo,double comision){
        this.sueldo=sueldo;
        this.comision=comision;
        this.total=sueldo+comision;
    } 

    public double getTotal() {
        return this.total;
    }
    

    @Override
    public String toString() {
        return super.toString()+"sueldo: $" + sueldo + "USD, comision: $" + comision + "USD, total devengado: $"+getTotal()+"USD";
    }
    
}
