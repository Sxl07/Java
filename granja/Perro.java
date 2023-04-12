public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
        this.setEspecie("perro");
    }

    @Override
    public void emitirSonido() {
        System.out.println("guauu hecho por "+getNombre());
        
    }
    
}
