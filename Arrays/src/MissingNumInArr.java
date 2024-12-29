import java.util.Arrays;
import java.util.Scanner;

public class MissingNumInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Elements in Array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Given Array is : "+Arrays.toString(arr));
        System.out.println("Missing Number in the Array is : "+ missNum(arr));
    }
    static int missNum(int[] arr){
        int n=arr.length;
        int totalSum=(n*(n+1))/2;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum-totalSum;
    }
}
