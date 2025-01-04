import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j < nums.length;j++){
            if(nums[j] != j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}
