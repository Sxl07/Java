package EjecicioAgregacionYcomposicion;

public class Equipo {
    private String nombreEquipo;
    private Jugador[] plantel;
    private int capacidad=5;
    private int nroJugadores=0;

    public Equipo(String nom){
        this.nombreEquipo=nom;
        this.plantel=new Jugador[capacidad];
        this.nroJugadores=0;
    }

    public void agregarJugador(Jugador nuevo){
        if (nroJugadores<capacidad) {
            this.plantel[nroJugadores]=nuevo;
            nroJugadores++;
        }
    }

    @Override
    public String toString() {
        String salida= "equipo: "+this.nombreEquipo+"\n";
        salida+="=====JUGADORES=====\n";
        if (nroJugadores>0) {
            for(Jugador jugador:plantel){
                salida+=jugador+"\n";
            }
        }
        return salida;
    }
 
}