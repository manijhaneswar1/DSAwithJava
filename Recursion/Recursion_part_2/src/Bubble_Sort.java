import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 1, 3};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int i){
        if(i == 0){
            return;
        }
        for (int j = 0; j <= i ; j++) {
            if(j+1 < arr.length && arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
        }
        bubble(arr, i-1);
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
