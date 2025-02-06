import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,5};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] arr,int target){
       int[] ans=new int[2];
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            int secNum=target-num;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]==secNum){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
       return new int[0];
    }
}
