public class leetcode_1283 {
    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{44,22,33,11,1}, 5));
    }
    static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = max(nums);
        int ans = 0;

        while( left <= right){
            int mid = left + (right-left)/2;
            if(divArr(nums, mid, threshold)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    static boolean divArr(int[] nums, int mid, int thr){
        double sum = 0;
        for(int num : nums){
            sum += Math.ceil((double)num/mid);
            if(sum > thr) return false;
        }
        return sum <= thr;
    }
    static int max(int[] nums){
        int max = -1;
        for(int num : nums){
            max = Math.max(max, num);
        }
        return max;
    }
}
