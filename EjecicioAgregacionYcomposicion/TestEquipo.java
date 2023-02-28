package EjecicioAgregacionYcomposicion;
public class TestEquipo {
    public static void main(String[] args) {
        Equipo miequipo;
        miequipo=new Equipo("dream team");
        Jugador j1=new Jugador(34, "ala", "karl", "malone");
        Jugador j2=new Jugador(32, "ala-pivot", "patrick", "erwing");
        Jugador j3=new Jugador(76, "alero", "scottie", "pippens");
        Jugador j4=new Jugador(54, "base", "stephen", "curry");
        Jugador j5=new Jugador(23, "escolta", "michael", "jordan");

        miequipo.agregarJugador(j1);
        miequipo.agregarJugador(j2);
        miequipo.agregarJugador(j3);
        miequipo.agregarJugador(j4);
        miequipo.agregarJugador(j5);
        System.out.println(miequipo);
    }
   
}
