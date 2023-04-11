package semana10.minicraft;

public class Principal {
    public static void main(String[] args) {
        Cubo miCubo=new Diamante();
        System.out.println("haz creado un cubo de "+ miCubo.getNombre());
        miCubo.destruir();
    }
}
