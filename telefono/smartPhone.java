package telefono;
import java.util.ArrayList;
public class smartPhone {
    private String modelo;
    private Bateria bateria;
    ArrayList<Chip> sim;

    public smartPhone(String mod,int cantMAh,String marcaBateria){
        this.modelo=mod;
        this.bateria=new Bateria(cantMAh, marcaBateria);
        this.sim = new ArrayList<Chip>();
    }
    public void agregarChip(Chip nuevo){
        
        if(sim.size()<2){
            sim.add(nuevo);
        }
        else{
            System.err.println("Se ha sobrepasado la cantidad maxima de chips");
        }
    }
    @Override
    public String toString() {
       String salida = "\nsmartphone modelo: "+this.modelo+"\n";
       salida += bateria.toString()+"\n";
       salida += "simcards \n";
       for (Chip chip : sim) {
           salida+=chip+"\n";
       }
       return salida;
    }
    public void mostrar(){
        System.out.println(this.toString());
    }
}
