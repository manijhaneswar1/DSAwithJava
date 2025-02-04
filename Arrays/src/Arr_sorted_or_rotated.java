public class Arr_sorted_or_rotated {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(check(arr));
    }
    static boolean check(int[] nums) {
        int n = nums.length;
        if(nums.length==1) return true;
        if(sortArr(nums)){
            return true;
        }else{
            int c=0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > nums[(i+1) % n]){
                    c++;
                }
            }
            return c <= 1;
        }
    }
    static boolean sortArr(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]) return false;
        }
        return true;
    }
}
