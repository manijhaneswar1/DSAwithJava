import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={0,6,2,9,2};
        int target=4;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] arr,int target){
        int[] ans=new int[2];
       for(int i = 0; i < arr.length; i++) {
           int num = target - arr[i];
           for(int j = i + 1; j < arr.length; j++) {
               if(arr[j] == num){
                   ans[0]=i;
                   ans[1]=j;
                   break;
               }
           }
       }
       return ans;
    }
}
