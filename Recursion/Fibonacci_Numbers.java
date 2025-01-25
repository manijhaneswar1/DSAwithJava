public class Fibonacci_Numbers {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        int ans= fibo(n - 1) + fibo(n - 2);

        return ans;
    }
}
