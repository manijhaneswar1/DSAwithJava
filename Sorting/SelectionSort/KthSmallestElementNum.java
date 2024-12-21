public class KthSmallestElementNum {
    public static void main(String[] args) {
        int[] nums={1,4,32,14,123};
        int k=1;
        System.out.println("The "+k+ " smallest Element in Array is : " +KthSmallest(nums,k));
    }
    static int KthSmallest(int[] nums,int k){
        for (int i = 0; i < nums.length; i++) {
            int lastIndex=nums.length-1-i;
            int minIndex=getMinIndex(nums,0,lastIndex);
            Swap(nums,lastIndex,minIndex);
        }
        return nums[nums.length-k];
    }
    static int getMinIndex(int[] nums,int s,int e){
        int min=s;
        for (int i = s; i <= e; i++) {
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        return min;
    }
    static void Swap(int[] nums,int num1,int num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}
