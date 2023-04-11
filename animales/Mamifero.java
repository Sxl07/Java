package semana10.animales;

public abstract class Mamifero {
    private String nombre;
    private String genero;
    private String especie;
    
    
    public Mamifero(String nombre, String genero, String especie) {
        this.nombre = nombre;
        this.genero = genero;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public abstract void gestar();
}
