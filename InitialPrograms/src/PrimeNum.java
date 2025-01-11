import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        if(num<=1){
            System.out.println(num + " is neither Prime nor Composite");
        }

        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime && num>1) {
            System.out.println(num + " is a Prime Number");
        }else {
            System.out.println( num + " is not a Prime Number");
        }
    }
}