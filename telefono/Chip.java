package telefono;
public class Chip {
    private String empresa;
    private int numero;
    
    public Chip(String empresa, int numero){
        this.empresa=empresa;
        this.numero=numero;
    }
    public void mostrar(){
        System.out.println("Sim card de la empresa es: "+this.empresa+" con numero "+this.numero);
    }
}
