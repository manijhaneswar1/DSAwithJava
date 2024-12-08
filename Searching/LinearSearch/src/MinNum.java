package src;

public class MinNum {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,-100};
        System.out.println("Minimum element in Array :" + Min(arr));
    }
    static int Min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for (int i = 1;i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
