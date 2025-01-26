import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={3,2,4,5,1,6};
        int n=arr.length;
        BSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void BSort(int[] arr,int n){

        if(n == 1) return;

        for (int i = 0; i < n; i++) {
            if(i+1 < n && arr[i] > arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        BSort(arr,n-1);
    }
}
