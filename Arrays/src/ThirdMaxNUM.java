import java.util.Arrays;

public class ThirdMaxNUM {
    public static void main(String[] args) {
        int[] arr={2,3,54,6,32,6,8,9};
        System.out.println("The Third Max Number in "+ Arrays.toString(arr) +" is : "+thirdMax(arr));
    }
    static int thirdMax(int[] nums) {
        int max = nums[0];
        if (nums.length <= 2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }
        Arrays.sort(nums);
        int count = 0;
        int unique=Integer.MIN_VALUE;
        for (int j = nums.length-1; j >= 0; j--) {
            if (nums[j] != unique) {
                unique=nums[j];
                count++;
            }
            if(count==3){
                return nums[j];
            }
        }
        return nums[nums.length - 1];
    }
}
