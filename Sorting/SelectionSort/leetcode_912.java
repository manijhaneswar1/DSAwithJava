import java.util.Arrays;

public class leetcode_912 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                swap(arr, i , minIdx);
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        var tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
