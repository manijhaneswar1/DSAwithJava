public class Sum_Of_Digits_Number {
    public static void main(String[] args) {
        int n=45632;
        System.out.println(SUM(n));
    }
    static int SUM(int n){
        // base condition
        if(n == 0) return n;
        // body
        int ans = n % 10;
        // recursive call
        return ans + SUM(n / 10);
    }
}
