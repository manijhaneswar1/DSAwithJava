public class leetcode_2457 {
    public static void main(String[] args) {
        System.out.println(makeIntegerBeautiful(467 , 6));
    }
    static long makeIntegerBeautiful(long n, int target) {
        // edge cases
        if(digitSum(n) <= target) return 0;

        // main thing to do
        long x = 0 , place = 1;
        while(digitSum(n) > target){
            long lastDigit = n % 10;
            long inc = (10 - lastDigit) % 10;
            x += inc * place;
            n = (n + inc) / 10;
            place *= 10;
        }
        return x;
    }
    static int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
