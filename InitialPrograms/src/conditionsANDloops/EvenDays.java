package conditionsANDloops;

import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Month : ");
        String month=sc.nextLine();

        int days=0 ;
       switch(month){
           case "january":
           case "march":
           case "may":
           case "july":
           case "august":
           case "october":
           case "december":
               days=31;
               break;
           case "april":
           case "june":
           case "september":
           case "november":
               days=30;
               break;
           default:
               System.out.println("enter valid Month");
               break;
       }

        int evenDays=days/2;
        System.out.println("Mani would go out in August Month on " + evenDays + " days .");
    }
}
