package conditionsANDloops;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        int RevNum=0;

        while(num > 0){
            int rem=num % 10;

            num = num / 10;

            RevNum=RevNum * 10 + rem;
        }

        System.out.println(RevNum);
    }
}
