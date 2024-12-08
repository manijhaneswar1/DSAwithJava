import java.util.Arrays;
import java.util.Scanner;

public class RevArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[5];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Array : " + Arrays.toString(arr));
        System.out.println("Reversed Array : " + Arrays.toString(buildRevArr(arr)));
    }

     static int[] buildRevArr(int[] arr) {
        int[] rev = new int[5];
        int decLen=arr.length;
         for (int i = 0; i < arr.length; i++) {
             rev[i]=arr[decLen-1];
             decLen--;
         }
         return rev;
    }
}
