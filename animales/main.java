package semana10.animales;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        Mamifero leon=new Leon();
        Leon leoncito=new Leon();
        Mamifero murcielago=new Murcielago();
        Murcielago murcielaguito=new Murcielago();

        System.out.println(leoncito.getNombre());
        leoncito.gestar();

        System.out.println(leon.getNombre());
        leon.gestar();
    }
    
}