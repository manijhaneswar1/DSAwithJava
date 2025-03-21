import java.util.Arrays;

public class mergeSort_inPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int s, int e){
        if(e - s <= 1) return;
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        merge(arr, s, mid, e);
    }
    static void merge(int[] arr, int s, int mid, int e){
        int[] mergeArr = new int[e - s];

        int i = s, j = mid, k = 0;

        while(i < mid && j < e){
            if(arr[i] < arr[j]){
                mergeArr[k] = arr[i];
                i++;
            }else{
                mergeArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mergeArr[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mergeArr[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mergeArr.length; l++) {
            arr[s + l] = mergeArr[l];
        }
    }
}
