public class leetcode_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}
