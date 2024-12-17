public class SingleElementInArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        int s=0;
        int e=nums.length-1;
        while(s < e){
            int mid=s + (e-s)/2;
            if(mid%2==0){
                if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                    s=mid+2;
                }else{
                    e=mid;
                }
            }else{
                if(nums[mid]==nums[mid-1]){
                    e=mid;
                }else{
                    s=mid+1;
                }
            }
        }
        return nums[s];
    }
}
