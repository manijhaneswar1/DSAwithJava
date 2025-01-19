import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class LC_1929 {
    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums){
        int n=nums.length;
        int j=n;
        int[] ans=new int[2*n];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[j]=nums[i];
            j++;
        }
        return ans;
    }
}
