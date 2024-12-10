import java.util.Arrays;

public class TargetArrCreate {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(CreateArr(arr, index)));
    }
    static int[] CreateArr(int[] nums,int[] index){
        int[]ans =new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(index[i]==i){
                ans[index[i]]=nums[i];
            }else{
                for (int j = index[i]; j < i+1; j++) {
                    int temp=ans[j];
                    ans[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return ans;
    }
}
