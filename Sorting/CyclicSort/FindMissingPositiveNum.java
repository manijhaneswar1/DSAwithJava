public class FindMissingPositiveNum {
    public static void main(String[] args) {
        int[] nums={1,-1,3,2};
        System.out.println(findMissingPositiveNum(nums));
    }
    static int findMissingPositiveNum(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[]nums,int s ,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}
