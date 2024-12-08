package conditionsANDloops;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String Number=sc.next();

        System.out.print("Please enter the digit that Times Occurrences : ");
        int digit=sc.nextInt();

        char digitChar=Character.forDigit(digit,10);

        int count=0;

        for (int i = 0; i <= Number.length()-1; i++) {
                if(Number.charAt(i)==digitChar){
                    count++;
                }
        }
        System.out.println("Given " + digit  + " is occurred " +   count + " Times.");
        sc.close();
    }
}
