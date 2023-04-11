package semana10.animales;

public class Murcielago extends Mamifero {

    public Murcielago() {
        super("muercielago", "Pipistrellus", "Pipistrellus pipistrellus");
    }

    public void volar(){
        System.out.println("ahora el murcielago esta volando");
    }

    @Override
    public void gestar() {
       System.out.println("el timepo de gestacion promedio es de 200 dias, aunque puede variar ");
    }
    

    
}
