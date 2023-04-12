class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre );
        this.setEspecie("gato");
    }

    @Override
    public void emitirSonido() {
       System.out.println("Miaauu hecho por "+getNombre());    
    }
}