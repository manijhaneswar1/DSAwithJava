public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(findLong(arr));
    }
    static int findLong(int[] nums){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        int longestStreak=0;
        for(int j=0;j<=nums.length;j++){
            int element=smallest+j;
            int count=0;

            for(int num : nums){
                if(num==element){
                    count++;
                    break;
                }
            }

            if(count>0){
                int currentElement=element;
                while(true){
                    currentElement++;
                    boolean foundNext=false;
                    for(int num : nums){
                        if(currentElement==num){
                            count++;
                            foundNext=true;
                            break;
                        }
                    }
                    if(!foundNext){
                        break;
                    }
                }
            }
            longestStreak=Math.max(longestStreak,count);
        }
        return longestStreak;
    }
}
