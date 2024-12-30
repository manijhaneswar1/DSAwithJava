import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr={0,2,-3,12,100};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }
    //finding maxNumber index
     static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    //Swapping with last index and max Number index
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
