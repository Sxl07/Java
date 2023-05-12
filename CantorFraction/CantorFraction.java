import java.util.Scanner;

public class CantorFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of i: ");
        int i = scanner.nextInt();
        scanner.close();

        int numerator = 1;
        int denominator = 1;
        boolean increaseNumerator = true;

        for (int count = 1; count < i; count++) {
            if (increaseNumerator) {
                numerator++;
                denominator--;
            } else {
                numerator--;
                denominator++;
            }

            if (denominator == 0) {
                denominator = numerator;
                numerator = 1;
                increaseNumerator = true;
            } else if (numerator == 0) {
                numerator = denominator;
                denominator = 1;
                increaseNumerator = false;
            }
        }

        System.out.println("The " + i + "-th Cantor fraction is: " + denominator + "/" + numerator);
    }
}
