import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class CountNoOfSwaps {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        //sorting(nums);
        //System.out.println(Arrays.toString(nums));
        System.out.println("No of Swaps : " + sorting(nums));
    }
    static int sorting(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    count++;
                }
            }
        }
        return count;
    }
}
