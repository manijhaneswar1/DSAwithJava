package functionsANDmethods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n =sc.nextInt();
        EvenOrOdd(n);
    }

    static void EvenOrOdd(int num){
        if(num%2 == 0){
            System.out.println(num + " is a Even Number");
        }else{
            System.out.println(num + " is a Odd Number");
        }
    }
}
