package telefono;
public class Chip {
    private String empresa;
    private long numero;
    
    public Chip(String empresa, int numero){
        this.empresa=empresa;
        this.numero=numero;
    }
    public String toString(){
      return ("empresa: "+this.empresa+" numero: "+this.numero);
    }
}
