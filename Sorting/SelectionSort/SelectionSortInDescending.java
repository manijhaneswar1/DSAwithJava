import java.util.Arrays;

public class SelectionSortInDescending {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        DescendSelection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void DescendSelection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int lastNum=nums.length-1-i;
            int MinIndex= getMinIndex(nums,0,lastNum);
            Swap(nums,lastNum,MinIndex);
        }
    }
    static int getMinIndex(int[] nums, int s, int e){
        int min=s;
        for (int i = s; i <= e; i++) {
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        return min;
    }
    static void Swap(int[]nums,int num1,int num2){
        int temp=nums[num1];
        nums[num1]=num2;
        nums[num2]=temp;
    }
}
