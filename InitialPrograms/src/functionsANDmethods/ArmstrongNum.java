package functionsANDmethods;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print(isArmstrongNum(n));
        sc.close();
// printing all Armstrong Numbers
        for (int i = 100; i <999 ; i++) {
            if (isArmstrongNum(i)){
                System.out.println(i + " ");
            }
        }
    }
// finding given number is Armstrong or not
    static boolean isArmstrongNum(int n) {
        int original=n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n = n / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }
}
