package semana10.minicraft;

public class Carbon extends Cubo{
    public Carbon(){
        super("carbon",10,"//img.png");
    }

    @Override
    public void destruir() {
        System.out.println("me he roto, toma 1 carbon");
        
    }
    
}
