package telefono;
public class smartPhone {
    private String modelo;
    private Bateria Bateria;
    private int nroChips;
    private Chip[] sim;

    public smartPhone(String modelo, int cantMAh, String marcaBateria){
        this.modelo=modelo;
        this.Bateria = new Bateria(cantMAh, marcaBateria);

    }
    public void mostrar(){

    }
    public void agregarChip(Chip nuevoChip){

    }
}
