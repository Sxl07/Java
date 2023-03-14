/**
 * Catedra
 */
public class Catedra extends Profesor {
 private String nombreCurso;

public Catedra(String nombre, String apellido, String nroDocumento, String tipoDeDocumento,String nombreCurso) {
    super(nombre,apellido,nroDocumento,tipoDeDocumento);
    this.nombreCurso = nombreCurso;
}

public String getNombreCurso() {
    return nombreCurso;
}

public void setNombreCurso(String nombreCurso) {
    this.nombreCurso = nombreCurso;
}

@Override
public String toString() {
    return "Prfesor de Catedra: \n"+super.toString()+"nombreCurso=" + nombreCurso+"\n";
}

 
}