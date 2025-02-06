public class Power_Sqs {
    public static void main(String[] args) {
        int n = 3;
        int[] memo = new int[n+1];
        System.out.println(helper(n,memo));
    }
    static int helper(int n,int[] memo){
        if(n < 4) return n;
        if(memo[n] != 0) return memo[n];
        int ans=n;
        for (int i = 1; i *i <= n; i++) {
            int squares = i*i;
            ans = Math.min(ans,1+helper(n-squares,memo));
        }
        return memo[n] = ans;
    }
}
