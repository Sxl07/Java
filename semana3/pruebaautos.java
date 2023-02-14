import java.util.Scanner;

public class pruebaautos {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        cars car1=new cars();
        System.out.println("digite la marca del auto: ");
        car1.setMarca(keyboard.nextLine());
        System.out.println("digite la linea del auto: ");
        car1.setLinea(keyboard.nextLine());
        System.out.println("digite el modelo del auto: ");
        car1.setModelo(keyboard.nextInt());
        System.out.println("digite la capacidad del tanque del auto en galones: ");
        car1.setTanque(keyboard.nextDouble());
        System.out.println("digite el rendimiento(kilometros que recorre por galon) del auto: ");
        car1.setRendimiento(keyboard.nextDouble());
        keyboard.close();
        /*
        System.out.printf("La marca es: %s\n La linea del auto es: %s\n el modelo del auto es: %d\n la capacidad del tanque es: %.2f\n el rendimiento del auto es: %.2f",car1.brand,car1.line,car1.model,car1.tankCapacity,car1.performance);
        
        System.out.println("los datos de tu carro son: ");
        */
        System.out.println(car1.toString());
        
    }
}
