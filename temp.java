
import java.util.Scanner;

class Temperaturas {
    public static void main(String[] args){
        double higher=0;
        double lower=100;
        double counter=0;
        double[] medidas= new double[7];
        Scanner keyboard = new Scanner(System.in);
    for(int hour=8;hour<=14;hour++){
        System.out.printf("write the temperature at %d:00 hours \n",hour);
        medidas[hour-8]=keyboard.nextDouble();
    }
    keyboard.close();
        System.out.println("the measured temperatures are: ");
        for (int i=0; i<medidas.length;i++){
            counter+=medidas[i];
            System.out.println(medidas[i]);
        }
        for(int j=0;j<7;j++){
            if(medidas[j]>higher){
                higher=medidas[j];
            }
        }
        for(int j=0;j<7;j++){
            if(medidas[j]<lower){
                lower=medidas[j];
            }
        }
        double average=counter/(double)medidas.length;

        System.out.printf("the highest temperature is: %.2f \nthe lower temperature is: %.2f \n",higher,lower);
        System.out.println("the average of temperature is "+average);
}
}
