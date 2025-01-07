import java.lang.reflect.Array;
import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr={1,1,4,3,1,3};
        System.out.println("Students those are not Match : "+check(arr));
    }
    static int check(int[] arr){
        int n= arr.length;
        int[] expected=new int[n];
        System.arraycopy(arr,0,expected,0,n);
        Arrays.sort(expected);

        int count=0;
        for (int i = 0; i < n; i++) {
            if(expected[i] != arr[i]){
                count++;
            }
        }
        return count;
    }
}
