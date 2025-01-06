import java.util.Arrays;

public class SortArrByParity2 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;

        while (even < n) {
            if (nums[even] % 2 == 0) {
                even += 2;
            } else {
                while (odd < n && nums[odd] % 2 != 0) {
                    odd += 2;
                }
                if (odd < n) {
                    int temp = nums[even];
                    nums[even] = nums[odd];
                    nums[odd] = temp;
                }
            }
        }
        return nums;
    }
}