public class DuplicateNum {
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        System.out.println(duplicate(nums));
    }
    static int duplicate(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        // find duplicate here
        if(nums[nums.length-1]!=nums.length){
            return nums[nums.length-1];
        }
        return nums.length;
    }
    static void swap(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}
