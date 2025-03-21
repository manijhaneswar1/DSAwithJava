import java.util.Arrays;

public class leetcode_238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            res[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= product;
            product *= nums[i];
        }

        return res;
    }
}
