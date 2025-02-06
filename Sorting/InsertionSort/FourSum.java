import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums={2,2,2,2,2};
        int target=8;
        System.out.println(fourSum(nums,target));
    }
    static List<List<Integer>> fourSum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> hSet = new HashSet<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n-3; i++) {
            for (int j = i+1; j < n-2; j++) {
                int k = j+1;
                int l = n-1;
                while(k < l){
                    long sum = 0;
                    sum += arr[i];sum += arr[j];sum += arr[k];sum += arr[l];
                    if(sum < target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }else{
                        StringBuilder sb = new StringBuilder();
                        sb.append(arr[i]);
                        sb.append(arr[j]);
                        sb.append(arr[k]);
                        sb.append(arr[l]);
                        String match = sb.toString();
                        if(!hSet.contains(match)){
                            hSet.add(match);
                            ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}

/*
    Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

    0 <= a, b, c, d < n
    a, b, c, and d are distinct.
    nums[a] + nums[b] + nums[c] + nums[d] == target
    You may return the answer in any order.
 */