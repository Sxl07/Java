public class Leon extends Felino {

    public Leon() {
        super("gato", "felis","silvestris catus");
    }
   
 

    @Override
    public void definirCarne(String tipoCarne) {
        System.out.println("el gato se alimenta con: "+tipoCarne);
    
    }

    @Override
    public void horarioAlimentacion(String hora) {
        System.out.println("alimentarlo a las "+hora);
        
    }
    
}
