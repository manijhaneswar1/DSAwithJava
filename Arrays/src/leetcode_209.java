public class leetcode_209 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
    static int minSubArrayLen(int target, int[] nums) {
        int s = 0;
        int e = nums.length;

        while(s < e){
            int mid = (s + e) / 2;
            if(nums[mid] >= target){
                return 1;
            }else{
                int left_sum = sum(s, mid - 1 , nums);
                int right_sum = sum(mid , e, nums );

                if(left_sum < target && right_sum < target){
                    return 0;
                }
                if(left_sum < target && right_sum > target){
                    s = mid;
                }else{
                    e = mid;
                }
            }
        }
        return e - s;
    }
    static int sum(int s , int e, int[] arr){
        int total = 0;
        while(s < e){
            total += arr[s];
            s++;
        }
        return total;
    }
}
