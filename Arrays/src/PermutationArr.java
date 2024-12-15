import java.util.Arrays;
import java.util.Scanner;

public class PermutationArr {
    public static void main(String[] args){
        int[] arr={0,2,1,5,3,4};
        System.out.println(Arrays.toString(PerArr(arr)));
    }
    static int[] PerArr(int[] arr){
        int n =arr.length;
        int[] ans=new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}





































