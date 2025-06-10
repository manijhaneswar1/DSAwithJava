public class leetcode_1248 {
public static void main(String[] args) {
    System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }
    static int numberOfSubarrays(int[] nums, int k) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            int odds = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[j] % 2 != 0){
                    odds++;
                }
                if(odds == k){
                    c++;
                }else if(odds > k){
                    break;
                }
            }
        }
        return c;
    }
}
