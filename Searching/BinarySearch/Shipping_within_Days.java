public class Shipping_within_Days {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(weights,days));
    }
    static int shipWithinDays(int[] weights,int days){
        int tW=0,maxW=Integer.MIN_VALUE;
        for(int weight : weights){
            maxW = Math.max(weight,maxW);
            tW += weight;
        }
        int left = maxW , right = tW;
        while(left < right){
            int mid=(left + right)/2;
            int ReqDays = 1 , curWeight=0;
            for(int w : weights){
                if(w + curWeight > mid){
                    ReqDays++;
                    curWeight=0;
                }
                curWeight += w;
            }
            if(ReqDays > days) left = mid+1;
            else right = mid;
        }
        return left;
    }
}
