package conditionsANDloops;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Number : ");
        int n=sc.nextInt();
        int digits=String.valueOf(n).length();
        int sum=0;
        for (int i = 0; i < digits; i++) {
            int last_digit=n % 10;
            sum +=last_digit;

            n=n/10;
        }
        System.out.print("Sum of all digit in given Number : "+ sum);

        sc.close();
    }
}
