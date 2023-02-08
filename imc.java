
import java.util.Scanner;
class SemanaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Hi, whats your name?");
         String name= teclado.nextLine();
         System.out.println("Nice to meet you "+ name);
         System.out.println("whats your height in centimeters?");
         int height= teclado.nextInt();
         System.out.println("whats your weight in Kg?");
         double weight=teclado.nextDouble();
         double heightInMeters=height/(double)100.0;
         System.out.printf("%s, your height in meters is %.2f \n",name , heightInMeters);
         double IMC =weight/Math.pow(heightInMeters,2);
         System.out.println("your IMC is "+IMC);
         if(IMC<=18.5){
         System.out.println("your IMC is below normal ");
         }else{ 
             if(IMC>=25){
                System.out.println("your IMC is above normal ");
                }else{
                 System.out.println("your IMC is normal ");}
         }
    }
    
}
