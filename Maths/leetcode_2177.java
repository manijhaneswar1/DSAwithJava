import java.util.Arrays;

public class leetcode_2177 {
    public static void main(String[] args) {
        long num = 77;
        System.out.println(Arrays.toString(threeConSum(num)));
    }
    static long[] threeConSum(long num){

        long l = -1 ;
        long r = num ;

        while( l <= r){
            long mid = l + ((r - l) / 2);
            long sum = mid + (mid + 1) + (mid + 2);
            if(sum == num){
                return new long[] {mid, mid + 1, mid + 2};
            }
            if(sum > num){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return new long[] {};
    }
}
