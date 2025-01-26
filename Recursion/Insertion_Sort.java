import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={3,2,4,5,1,6};
        int n=1;
        ISort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void ISort(int[] arr,int n){

        if( n >= arr.length){
            return;
        }

        for (int i = n; i > 0; i--) {
            if(arr[i] < arr[i-1]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
         ISort(arr,n+1);
    }
}
