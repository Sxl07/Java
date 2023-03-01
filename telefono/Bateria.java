package telefono;
public class Bateria {
    private int mAh;
    private String marca;
    public Bateria(int mAh,String marca){
        this.mAh=mAh;
        this.marca=marca;
    }

    public String toString(){
            return ("bateria marca: "+this.marca+"\nsus miliamperios son: "+this.mAh); 
        }
}
