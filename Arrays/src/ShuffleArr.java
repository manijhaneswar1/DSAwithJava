import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int n=3;
        int[] ans=new int[arr.length];
        for (int i = 0; i < n; i++) {
            ans[i*2]=arr[i];
            ans[i*2+1]=arr[n+i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
