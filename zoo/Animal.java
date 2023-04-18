/**
 * Animal
 */
public abstract class Animal {

  private String nombreComun, genero, especie,datoCurioso;

public Animal() {
}

public String getNombreComun() {
    return nombreComun;
}

public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
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

public String getDatoCurioso() {
    return datoCurioso;
}

public void setDatoCurioso(String datoCurioso) {
    this.datoCurioso = datoCurioso;
}

public abstract String info();
}