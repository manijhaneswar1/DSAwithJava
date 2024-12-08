package functionsANDmethods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        isPrime(n);
        sc.close();
    }

    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println(n + " is neither Composite nor Prime");
            return;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(n + " is a PRIME NUMBER");
        } else {
            System.out.println(n + " is NOT A PRIME NUMBER");
        }
    }
}