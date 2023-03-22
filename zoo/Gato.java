public class Gato extends Felino{

    public Gato(String nc, String gen, String esp) {
        super(nc, gen, esp);
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
