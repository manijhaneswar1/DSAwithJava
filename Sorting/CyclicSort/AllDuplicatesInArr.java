import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInArr {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
