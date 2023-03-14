public class Planta extends Profesor{
    private int horas_clase,horas_investigacion,horas_admin;
    public Planta(String nombre, String apellido, String nroDocumento, String tipoDeDocumento,int horas_clase,int horas_investigacion,int horas_admin){
        super(nombre, apellido, nroDocumento, tipoDeDocumento);
        this.horas_clase=horas_clase;
        this.horas_investigacion=horas_investigacion;
        this.horas_admin=horas_admin;    
    }
    public int getHoras_clase() {
        return horas_clase;
    }
    public void setHoras_clase(int horas_clase) {
        this.horas_clase = horas_clase;
    }
    public int getHoras_investigacion() {
        return horas_investigacion;
    }
    public void setHoras_investigacion(int horas_investigacion) {
        this.horas_investigacion = horas_investigacion;
    }
    public int getHoras_admin() {
        return horas_admin;
    }
    public void setHoras_admin(int _horas_admin) {
        this.horas_admin = _horas_admin;
    }

    @Override
    public String toString() {
        return "profesor de planta: \n"+super.toString()+"horas_clase=" + horas_clase + ", horas_investigacion=" + horas_investigacion + ", horas_admin="
                + horas_admin+"\n";
    }
    
}
