import java.util.Arrays;

public class SmallerthanCurrentINArr {
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        System.out.println(Arrays.toString(smaller(arr)));
    }
    static int[] smaller(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && i != j){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
