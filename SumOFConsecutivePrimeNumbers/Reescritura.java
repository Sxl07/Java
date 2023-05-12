package SumOFConsecutivePrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Reescritura {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static int counter(int n, ArrayList<Integer> prime) {
        int contador = 0;

        for (int i = 0; i < prime.size(); i++) {
            int sum = prime.get(i);
            if (sum == n) {
                contador += 1;
            }
            for (int k = i + 1; k < prime.size(); k++) {
                sum += prime.get(k);
                if (sum == n) {
                    contador += 1;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Ingrese los numeros separados por salto de linea (0 para terminar): ");
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            prime = generatePrimes(number);
            int contador = counter(number, prime);
            System.out.println("Numero ingresado: " + number + " - numero de representaciones: " + contador);
        }
        scanner.close();
    }
}