public abstract class Mamifero extends Animal {
private int tiempoGestacion;

public Mamifero() {
}



public int getTiempoGestacion() {
    return tiempoGestacion;
}

public void setTiempoGestacion(int tiempoGestacion) {
    this.tiempoGestacion = tiempoGestacion;
}

@Override
public String info() {
    return null;
}
    
}
