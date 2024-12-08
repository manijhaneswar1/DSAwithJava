package conditionsANDloops;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        boolean isPalindrome=true;


       for(int left=0,right=str.length()-1;left<right;left++,right--){
           if(str.charAt(left) != str.charAt(right)){
               isPalindrome=false;
               break;
           }
       }

        if(isPalindrome){
            System.out.println("Yes " + str + " is a Palindrome");
        }else{
            System.out.print(str + " is not a palindrome");
        }

    }
}
