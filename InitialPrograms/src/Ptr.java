import java.util.Scanner;

public class Ptr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle Amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter the Time : ");
        int t=sc.nextInt();
        System.out.print("Enter the Rate : ");
        float r=sc.nextFloat();

        double SI = (p * t * r )/ 100;
        System.out.println("Simple Interest : " + SI );

        sc.close();
    }

}
