import java.util.Arrays;

public class MaxProductOfThreeNums {
    public static void main(String[] args) {
        int[] arr={-100,-98,-1,2,3,4};
        System.out.println(maxOptimal(arr));
    }

    //oPTIMAL
    static int maxOptimal(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int p1=arr[n-1]*arr[n-2]*arr[n-3];
        int p2=arr[0]*arr[1]*arr[n-1];
        int Max=Math.max(p1,p2);

        return Max;

    // bRUTE fORCE mETHOD
    /* static int maxBruteForce(int[] nums) {
        if (nums.length == 3) {
            int ans = 1;
            for (int i = 0; i < nums.length; i++) {
                ans = ans * nums[i];
            }
            return ans;
        }

        int maxMul = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentMul = nums[i] * nums[j] * nums[k];
                    if (currentMul > maxMul) {
                        maxMul = currentMul;
                    }
                }
            }
        }
        return maxMul;
    */
    }
}