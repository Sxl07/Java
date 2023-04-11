package semana10.animales;

public class Leon extends Mamifero {

    public Leon() {
        super("leon", "Panthera","Panthera leo");
    }

    public void rugir(){
        System.out.println("raaaar");
    }

    @Override
    public void gestar() {
        System.out.println("el tiempo medio de gestacion de una leona es de 110 dias");
        
    }
    
    
}
