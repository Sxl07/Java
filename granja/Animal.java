public abstract class Animal {
    private String nombre, especie;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.especie = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public abstract void emitirSonido();
}
