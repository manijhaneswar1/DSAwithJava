package functionsANDmethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n=sc.nextInt();
        System.out.println("Factorial of Given Number : " + Factorial(n));
    }
    static int Factorial(int n){
        int fact=1 ;
        if(n==1 && n==0){
            System.out.println(fact);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " ");
             fact *= i;
        }
        return fact;
    }
}
