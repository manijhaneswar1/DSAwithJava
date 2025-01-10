public class ThreeSumCloset {
    public static void main(String[] args) {
        int[] arr={4,0,5,-5,3,3,0,-4,-5};
        System.out.println(threeSumClosest(arr,-2));
    }
    static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if (n == 3) return nums[0]+nums[1]+nums[n-1];

        int initialSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n-2; i++) {
           int j=i+1;
           int k=i+2;
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum - target) < Math.abs(initialSum - target)) {
                        initialSum = sum;
                    }
        }
        return initialSum;
    }
}

/*
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if(n==3) return nums[0]+nums[1]+nums[n-1];
        Arrays.sort(nums);

        int initialSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int currentSum=nums[i]+nums[j]+nums[k];
                if(Math.abs(currentSum-target) < Math.abs(initialSum-target)){
                    initialSum=currentSum;
                }
                if(currentSum < target){
                    j++;
                }else if(currentSum > target){
                    k--;
                }else{
                    return currentSum;
                }
            }
        }
        return initialSum;
    }
     */