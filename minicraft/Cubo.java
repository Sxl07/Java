package semana10.minicraft;

abstract class Cubo{
    private String nombre;  
    private int dureza;
    private String textura;

    public Cubo(String nombre, int dureza, String textura) {
        this.nombre = nombre;
        this.dureza = dureza;
        this.textura = textura;
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getDureza() {
        return dureza;
    }



    public void setDureza(int dureza) {
        this.dureza = dureza;
    }



    public String getTextura() {
        return textura;
    }



    public void setTextura(String textura) {
        this.textura = textura;
    }



    public abstract void destruir();

    
}