package functionsANDmethods;

import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n =sc.nextInt();
        System.out.print(SumN(n));
        sc.close();
    }
    static int SumN(int n ){
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
