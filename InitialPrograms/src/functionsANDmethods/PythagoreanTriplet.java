package functionsANDmethods;

import javax.xml.transform.Source;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first num : ");
        int num1=sc.nextInt();
        System.out.print("enter second num : ");
        int num2=sc.nextInt();
        System.out.print("enter third num : ");
        int num3=sc.nextInt();
        isPythaTri(num1 ,num2,num3);
    }

    static void isPythaTri(int num1, int num2, int num3) {
        int sq2=(num1 *num1) + (num2 * num2);
        int sq1=(num3 *num3);

        if(sq1 == sq2){
            System.out.print("Given Triplets are Pythagorean Triplet.");
        }else{
            System.out.println("Not a pythagorean Triplet.");
        }
    }

}
