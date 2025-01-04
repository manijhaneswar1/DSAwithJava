import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearNumsInArr {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,6};
        System.out.println("Missing Numbers in Given " + Arrays.toString(arr) + " :- \n" +findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

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
            if (nums[j] != j + 1) {
                ans.add(j + 1);
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
