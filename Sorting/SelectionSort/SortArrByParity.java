import java.util.Arrays;

public class SortArrByParity {
    public static void main(String[] args) {
        int[] arr={0,2,1};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    static int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                if(i != j){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            j++;
        }
        return nums;
    }
}
