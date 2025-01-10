public class HouseRob {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        System.out.println(rob(arr));
    }
    static int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        for(int i=0;i<nums.length;i++){
               int temp=prev1;
               prev1=Math.max(prev1,nums[i]+prev2);
               prev2=temp;
            }
        return prev1;
    }
}
