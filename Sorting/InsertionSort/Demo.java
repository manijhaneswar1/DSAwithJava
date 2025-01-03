import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
