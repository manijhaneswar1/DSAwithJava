package functionsANDmethods;
import java.util.Scanner;

public class PrimeBtwTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Num : ");
        int num1=sc.nextInt();
        System.out.print("Enter the second Num : ");
        int num2=sc.nextInt();
        System.out.print("Al primes btw given two numbers : ");
        AllPrimes(num1,num2);
    }
    static void AllPrimes(int num1, int num2){
        if(num1 > num2) {
            System.out.println("invalid Range ... enter valid range...!");
        }
        for (int i = num1; i <=num2 ; i++) {
            boolean isPrime=true;

            for(int j=2;j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime=false;
                    break;
                }
            }
             if(isPrime){
                 System.out.print(i + " ");
             }
        }
    }
}
