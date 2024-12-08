import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        SwapNum(arr,3,4);
        System.out.println(Arrays.toString(arr));
    }
    static void SwapNum(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
