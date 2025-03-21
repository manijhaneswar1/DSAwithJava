import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] a, int[] b){
        int[] mergeArr = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                mergeArr[k] = a[i];
                i++;
            }else{
                mergeArr[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length){
            mergeArr[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            mergeArr[k] = b[j];
            j++;
            k++;
        }
        return mergeArr;
    }
}
