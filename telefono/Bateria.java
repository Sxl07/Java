package telefono;
public class Bateria {
    private int mAh;
    private String marca;
    public Bateria(int mAh,String marca){
        this.mAh=mAh;
        this.marca=marca;
    }

    public void mostrar(){
            System.out.println("bateria marca: "+this.marca+"\n sus miliamperios son: "+this.mAh);
    }
}
