package conditionsANDloops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n terms up to fibonacci series to be perform  : ");
        int n=sc.nextInt();

        int firstNum=0;
        int secondNum=1;

        for (int i=0;i<=n;i++){
            System.out.print(firstNum + " ");

            int nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;

        }
        sc.close();
    }
}
