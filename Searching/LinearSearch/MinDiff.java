public class MinDiff {
    public static void main(String[] args) {
        int[] arr={9,4,1,7};
        System.out.println(minimumDifference(arr,2));
    }
    static int minimumDifference(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int diff=0;
        int min=diff;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                diff = nums[i] - nums[j];
                if(diff<min){
                    min=diff;
                }
            }
        }
        return Math.abs(min);
    }
}
