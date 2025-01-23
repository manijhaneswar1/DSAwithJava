import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last=nums.length-i-1;
            int maxIndex=findMaxIndex(nums,0,last);
            swap(nums,last,maxIndex);
        }
    }

    static int findMaxIndex(int[] nums,int s,int l){
        int max=s;
        for (int i = s; i <= l ; i++) {
            if(nums[i] > nums[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] nums,int maxindex,int last){
        int temp=nums[maxindex];
        nums[maxindex]=nums[last];
        nums[last]=temp;
    }
}