import java.util.Arrays;
import java.util.HashSet;

public class leetcode_202 {
    public static void main(String[] args) {
//        System.out.println("Happy Number");
//        System.out.println(isHappy(2));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));

    }
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while(n != 1 && !hs.contains(n)){
            hs.add(n);
            int num = 0;
            while(n > 0){
                int rem = n % 10;
                num += rem * rem;
                n /= 10;
            }
            n = num;
        }
        return n == 1;
    }
    public static int[] twoSum(int[] nums, int target){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if( hs.contains(diff) && diff != nums[i] ){
                return new int[]{i, findIndex(nums, diff)};
            }
        }
        return new int[]{};
    }
    public static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
