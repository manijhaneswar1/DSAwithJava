import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.print("Enter the Array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Array : " + Arrays.toString(arr));
        System.out.println("Maximum of Given Array : " + Max(arr));
        System.out.println("Maximum of Given Range of Array : " + MaxRange(arr,2,4));
        sc.close();
    }
    static int Max(int[] arr){
        int max=arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    static int MaxRange(int[] arr,int start,int end){
        int max=arr[start];
        for(int i=arr[start];i < arr[end];i++){
            if(arr[i] > max){
                max=arr[i];
;            }
        }
        return max;
    }
}

// Work on edge cases...!