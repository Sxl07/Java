//@Sebastian Lopez usb-cali 2023
package EjecicioAgregacionYcomposicion;
public class Jugador {
    private int dorsal;
    private String posicion;
    private Persona p;
    
    public Jugador(){
    }

    public Jugador(int dorsal, String posicion,String nombre,String apellido) {
        setDorsal(dorsal);
        setPosicion(posicion);
        this.p = new Persona(nombre,apellido);
    }

    

    @Override
    public String toString() {
        return "El jugador es: " + this.p.getNombre() + ", posicion: " + this.posicion + ", dorsal: " + this.dorsal ;
    }
    //creando el setter que limita los dorsales desde 0 a 99. punto 3 punto A
    public void setDorsal(int n) {
        if (n<0) {
            System.err.println("El numero introducido es menor a 0, el dorsal por defecto sera 0");
            this.dorsal=0;
        }
        if(n>99){
            System.err.println("El numero introducido es mayor a 99, el dorsal por defecto sera 99");
            this.dorsal=99;
        }
        if (n<99 && n>0) {
            this.dorsal = n;
        }
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
