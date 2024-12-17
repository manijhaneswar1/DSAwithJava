public class UpperBound {
    public static void main(String[] args) {
        int[] nums={3,5,8,15,19,19};
        int target=15;
        System.out.println("index of " + target+ " upper bound : " +uperindex(nums,target));
    }
    static int uperindex(int[] nums,int target){
        int ans=nums.length;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                ans= mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}
