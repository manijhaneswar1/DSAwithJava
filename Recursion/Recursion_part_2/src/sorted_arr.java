import java.util.Arrays;

public class sorted_arr {
    public static void main(String[] args) {
        int[] arr = {2,3,4,56};
        System.out.println(is_sorted(arr));
        System.out.println(rec_is_sorted(arr,0));
    }
    // bruteforce approach
    static boolean is_sorted(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i+1 < n && arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    // recursive approach
    static boolean rec_is_sorted(int[] arr , int i){
        if(i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i+1] && rec_is_sorted(arr,i + 1);
    }
}
