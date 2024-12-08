import java.util.Scanner;

public class celToFahren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Temp in Celsius : ");
        float cel=sc.nextFloat();

        float fah= ( cel * 9/5 ) + 32;
        System.out.println("Fahrenheit : " + fah);
    }
}
