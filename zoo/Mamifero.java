public abstract class Mamifero {
   private String nomComun,genero,especie,tipo;

public Mamifero(String nc, String gen, String esp) {
    this.nomComun = nc;
    this.genero = gen;
    this.especie = esp;
}



public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public abstract void horarioAlimentacion(String hora);
 
@Override
public String toString() {
    return "Mamifero nomComun=" + nomComun + ", genero=" + genero + ", especie=" + especie + "]";
}
}