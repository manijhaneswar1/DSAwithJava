package src;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the start Range : ");
        int startRange=sc.nextInt();
        System.out.print("Enter the end Range : ");
        int endRange=sc.nextInt();
        System.out.print("Enter the Target Element : ");
        int target =sc.nextInt();
        System.out.println(Range(arr,startRange,endRange,target));
    }
    static boolean Range(int[] arr,int startRange,int endRange,int target){
        if(arr.length==0){
            return false;
        }
        for (int i = startRange; i < endRange; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
