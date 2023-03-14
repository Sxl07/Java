/**
 * Profesor
 */
public class Profesor {
 private String nombre,apellido,nroDocumento,tipoDeDocumento;

 public Profesor(){
 }

 
public Profesor(String nombre, String apellido, String nroDocumento, String tipoDeDocumento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.nroDocumento = nroDocumento;
    this.tipoDeDocumento = tipoDeDocumento;
}


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getNroDocumento() {
    return nroDocumento;
}

public void setNroDocumento(String nroDocumento) {
    this.nroDocumento = nroDocumento;
}

public String getTipoDeDocumento() {
    return tipoDeDocumento;
}

public void setTipoDeDocumento(String tipoDeDocumento) {
    this.tipoDeDocumento = tipoDeDocumento;
}


@Override
public String toString() {
    return "nombre=" + nombre + ", apellido=" + apellido + ", nroDocumento=" + nroDocumento
            + ", tipoDeDocumento=" + tipoDeDocumento;
}

 
}