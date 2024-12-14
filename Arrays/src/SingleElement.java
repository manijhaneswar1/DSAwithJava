public class SingleElement {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

        static int singleNumber(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            int singleElement=0;
            boolean found;
            for(int i=0;i<nums.length;i++){
                found=false;
                for(int j=0;j<nums.length;j++){
                    if(i!=j && nums[i]==nums[j]){
                        found=true;
                        break;
                    }
                }
                if(!found){
                    singleElement=nums[i];
                    break;
                }
            }
            return singleElement;
        }
}
