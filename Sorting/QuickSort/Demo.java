import java.util.Arrays;
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,3,4};
        QuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr, int low, int hi){
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + ( e - s) / 2;
        int pivot = arr[mid];
        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s <= e){
                swap(arr, s, e);
                s++;
                e--;
            }
        }
        QuickSort(arr,low, e);
        QuickSort(arr, s, hi);
    }
    static void swap(int[] arr, int s, int e){
        int tmp = arr[s];
        arr[s] = arr[e];
        arr[e] = tmp;
    }
}
