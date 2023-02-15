import java.util.Scanner;
public class basket {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Jugador playerOne=new Jugador();
        System.out.println("digite el nombre del jugador");
        playerOne.setName(keyboard.nextLine());
        System.out.println("digite el apellido del jugador");
        playerOne.setLastName(keyboard.nextLine());
        System.out.println("digite la estatura del jugador");
        playerOne.setHeight(keyboard.nextDouble());
        System.out.println("digite la edad del jugador");
        playerOne.setAge(keyboard.nextInt());
        System.out.println("digite el dorsal del jugador");
        playerOne.setDorsal(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("digite la posicion del jugador");
        playerOne.setPosition(keyboard.nextLine());
        keyboard.close();

        System.out.println(playerOne);

    }
}