public class garden{
    public static void main(String[] args) {
        Animal[] miGranja=new Animal[3];

        miGranja[0]=new Gato("michi");
        miGranja[1]=new Perro("firu");
        miGranja[2]=new Pato("Donald");

        for (Animal animalito : miGranja) {
            animalito.emitirSonido();
        }
    }
}