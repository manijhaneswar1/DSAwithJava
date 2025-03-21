import java.util.Arrays;

public class selection_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 1, 3, 9, 98875};
        selection(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int i){
        if(i == 0){
            return;
        }
        int max_index = 0;
        for(int k = 0 ; k < i; k++){
            if(arr[k] > arr[max_index]){
                max_index = k;
            }
        }
        swap(arr, i-1, max_index);
        selection(arr, i-1);
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
