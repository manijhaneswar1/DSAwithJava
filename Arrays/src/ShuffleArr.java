import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[arr.length];
        for (int i = 0; i < n; i++) {
            ans[2*i]=arr[i];
            ans[2*i+1]=arr[n+i];
        }
        System.out.println("shuffled Array : "+ Arrays.toString(ans));
    }
}
