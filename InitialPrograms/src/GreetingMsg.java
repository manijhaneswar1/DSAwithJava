import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the Name : ");

        String name =sc.nextLine();

        System.out.println("Good Morning " + name + " ! Have a Nice Day..!");
    }
}
