public class Pato extends Animal {

    public Pato(String nombre) {
        super(nombre);
        this.setEspecie("pato");
    }

    @Override
    public void emitirSonido() {
       System.out.println("Quackkkk hecho por "+getNombre());
        
    }
    
}
