//@copyright 2023 Juan pablo silvestre(99127), Sebastian Lopez(97500)

public class Main {
    public static void main(String[] args){
        Auto miauto = new Auto("Ford", 9000, "RB19", 680);
       Piloto p1 = new Piloto("Checo Perez", 11, 63 );
       Piloto p2 = new Piloto("Max verstappen", 1, 67 );

       miauto.agregarPiloto(p1);

       System.out.println(miauto);

       miauto.reemplazar(p2);

       System.out.println(miauto);
    }
};
