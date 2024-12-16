import java.util.Arrays;

public class rotateArrKdigits {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k=1%n;
        int[] temp = new int[k];
        //copy k digits from arr[] to Temp[]
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        //shift rest to right in arr[]
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        //copy temp into into arr
        for (int i = 0; i < k; i++) {
           arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
