import java.util.Arrays;

public class leetcode_1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(two_sum(arr, 7)));
    }
    static int[] two_sum(int[] arr, int target){
        int[] ans = new int[2];
        for(int j = 0 ; j < arr.length ; j++){
            int rem_num = target - arr[j];
            for (int i = 0; i < arr.length; i++) {
                if(rem_num == arr[i]){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
