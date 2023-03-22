public abstract class Carnivoro extends Mamifero{

    public Carnivoro(String nc,String gen,String esp) {
        super(nc,gen,esp);
        super.setTipo("Carnivoro");
    }
    public abstract void definirCarne(String tipoCarne);
}
