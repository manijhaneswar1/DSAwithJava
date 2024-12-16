import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] nums){
        boolean swapped;
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            swapped=false;
            for (int j = 0; j < n-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
