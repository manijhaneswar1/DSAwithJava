import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_496 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums1.length; i++){
            int n = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == n){
                    int k = j + 1;
                    while(k < nums2.length){
                        if(nums2[k] > nums2[j]){
                            list.add(nums2[k]);
                            break;
                        }else{
                            k++;
                        }
                    }
                    if(k == nums2.length){
                        list.add(-1);
                        break;
                    }
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int a = 0 ; a < list.size(); a++){
            ans[a] = list.get(a);
        }
        return ans;
    }
}
