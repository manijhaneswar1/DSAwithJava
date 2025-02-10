import java.util.Arrays;

public class Smallest_Range {
    public static void main(String[] args) {
        int[] arr = {0,10};
        System.out.println(smallestRangeII(arr,2));
        System.out.println(small(new int[]{1,6,4},2));
    }
    static int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int[] OG = nums.clone();
        int n = nums.length;
        if(nums.length==1) return 0;
        int minScore = nums[n-1] - nums[0];

        for(int i = 0 ; i < n ; i++){
            int j = n - 1;
            while(j >= i){
                if(i > 0) {
                    for(int a = 0 ; a < i ; a++){
                        nums[a] = nums[a] + k;
                    }
                }
                nums[j] = nums[j] - k;
                j--;
            }
            // find max and min in nums
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int num : nums){
                if ( num < min ) min = num;
                if ( num > max ) max = num;
            }
            minScore = Math.min( (max - min) , minScore);
            nums = OG.clone();
        }
        return minScore;
    }
    static int small(int[] arr,int k){
        if(arr.length == 1) return 0;
        Arrays.sort(arr);
        int n = arr.length;
        int minScore = arr[n-1] - arr[0];
        for (int i = 0; i < n-1; i++) {
            int max =Math.max(arr[n-1]-k,arr[i]+k);
            int min =Math.min(arr[0]+k,arr[i+1]-k);
            minScore = Math.min(max-min,minScore);
        }
        return minScore;
    }
}
