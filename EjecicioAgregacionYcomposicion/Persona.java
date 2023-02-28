//@Sebastian Lopez usb-cali 2023
package EjecicioAgregacionYcomposicion;

public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(){
    }
    //se creó un constructor con parametros que permita a la clase Persona recibir el nombre y el apellido de una nueva "persona" con nombre y apellido.Aqui abajo vemos el ejemplo de como se crearia (Punto A del primer punto)

     //Persona nuevaPersona = new Persona("sebastian", "lopez");

    public Persona(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    //se creó una funcion toString para imprimir los elementos creados en la clase Persona.(punto B del primer punto)
    public String toString() {
        return  nombre+" " + apellido ;
    }

    public void setNombre(String nom){
        this.nombre=nom;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }
}