
class Cars{
    private String brand;
    private String line;
    private int model;
    private double autonomy;
    private double tankCapacity;
    private double performance;
    //no parameters
    public Cars(){
    }
    //with parameters
    public Cars(String marca,String linea,int modelo,double capacidadTanque, double rendimiento){
        this.brand=marca;
        this.line=linea;
        this.model=modelo;
        this.tankCapacity=capacidadTanque;
        this.performance=rendimiento;
    }
   
    public String toString() {
        return "\nLos resultados del auto son: \nmarca: "+this.brand+"\n"+"linea: "+this.line+"\n"+"modelo: "+this.model+"\n"+"capacidad del tanque: "+this.tankCapacity+"\n"+"Rendimiento: "+this.performance+"\nLa autonomia es: "+getAutonomia()+"\n";
    }

    double getAutonomia(){
       return this.performance*this.tankCapacity;
    }

    public String getMarca(){
        return this.brand;
    }

    public String getLinea(){
        return this.line;
    }

    public int getModelo(){
        return this.model;
    }

    public double getTanque(){
        return this.tankCapacity;
    }

    public double getRendimiento(){
        return this.performance;
    }

    public void setMarca(String Brand) {
        this.brand=Brand;
        
    }

    public void setLinea(String Line) {
        this.line=Line;
        
    }

    public void setModelo(int Model) {
        this.model=Model;
        
    }

    public void setTanque(double Tanque) {
        if (Tanque<=0){
            System.err.println("haz introducido un dato erroneo");
        }
        this.tankCapacity=Tanque;
        
    }

    public void setRendimiento(double Rendimiento) {
        this.performance=Rendimiento;
        
    }

    public void setAutonomia(double Autonomia){
        this.autonomy=Autonomia;
    }
}