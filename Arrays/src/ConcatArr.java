import java.util.Arrays;

public class ConcatArr {
    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(Concatenating(arr)));
    }
    static int[] Concatenating(int[] arr){
        int n=arr.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
           ans[i]=arr[i];
           ans[i+n]=arr[i];
        }
        return ans;
    }
}
