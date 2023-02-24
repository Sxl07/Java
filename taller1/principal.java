//@Sebastian Lopez usb-cali 2023
package taller1;
import java.util.Scanner;   
class principal {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        //aqui se crea una nueva persona con la clase Persona.(Punto A del primer punto)
        Persona nuevaPersona = new Persona("sebastian", "lopez");
        //aqui se imprime la nueva persona que se creó con la clase Persona(punto B del primer punto)
        System.out.println(nuevaPersona);
        //ingresando el nombre, apellido, dorsal y poscion del punto 3 punto B
        System.out.println("ingresa el nombre del jugador");
        String nom=keyboard.nextLine();
        System.out.println("ingresa el apellido del jugador");
        String ape=keyboard.nextLine();
        System.out.println("ingresa el dorsal del jugador");
        int dor=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("ingresa la posicion del jugador");
        String pos=keyboard.nextLine();

        Jugador player=new Jugador(dor,pos,nom,ape);
        keyboard.close();
        //en la carpeta se encuentra la captura con la ejecucion del programa. Ese sería el punto 2 del taller
        System.out.println(player);
    }
}