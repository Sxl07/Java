//@copyright 2023 Juan pablo silvestre(99127), Sebastian Lopez(97500)

public class Piloto {
    private String nombre;
    private int numeroCompeticion;
    private double peso;

//constructor
    public Piloto(String nombre, int numComp, double peso){
        this.nombre = nombre;
        this.numeroCompeticion = numComp;
        this.peso = peso;
        }


//Mostrar====================================================================

@Override
public String toString() {
    return " Nombre=" + this.nombre + ", Numero de Competicion=" + this.numeroCompeticion + ", peso=" + this.peso;
    }
}
