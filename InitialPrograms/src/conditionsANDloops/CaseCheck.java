package conditionsANDloops;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        char ch=str.trim().charAt(0);

        if(ch >='a' && ch <='z' ){
            System.out.print(ch + " is LowerCase");
        }
        else{
            System.out.println(ch + " is UpperCase");
        }
    }
}
