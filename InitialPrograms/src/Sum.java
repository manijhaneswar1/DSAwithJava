import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the second Number : ");
        int num2=sc.nextInt();

        int res=num1 + num2;
        System.out.println("sum of given Numbers : " + res);
    }
}
