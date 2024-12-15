public class ConsecutiveOnesInArr {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,1,1,1,1};
        System.out.println(findConsecutiveones(arr));
    }
    static int findConsecutiveones(int[] nums){
        int count=0;
        int maxCount=count;
        int i = 0;
        while ( i < nums.length) {
            if(nums[i]==1){
                count++;
            }else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
            i++;
        }
        return Math.max(count,maxCount);
    }
}
