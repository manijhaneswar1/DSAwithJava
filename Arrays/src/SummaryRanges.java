import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 7, 10};
        System.out.println(summaryRanges(arr));
    }

    static List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sNum = nums[i];
            int cNum = nums[i];
            if(nums[n-1] == cNum){
                ans.add(String.valueOf(cNum));
                break;
            }
            if (i + 1 < n && nums[i + 1] != cNum + 1) {
                ans.add(String.valueOf(cNum));
            } else {
                while (i + 1 < n && nums[i + 1] == cNum + 1) {
                    i++;
                    cNum = nums[i];
                }
                String str = sNum + "->" + cNum;
                ans.add(str);
            }
        }
        return ans;
    }
}