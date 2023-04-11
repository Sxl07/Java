package semana10.minicraft;

public class Diamante extends Cubo {
    public Diamante(){
        super("diamante",50,"//img.diamante.png");
    }

    @Override
    public void destruir() {
        System.out.println("haz destruido un diamante, toma un diamante para tu inventario");
        
    }
    
}
