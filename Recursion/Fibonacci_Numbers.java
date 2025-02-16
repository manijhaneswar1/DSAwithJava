import java.util.HashMap;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < 6; i++) {
            System.out.print(fiboFormula(i) + " ");
        }
        System.out.println();
        System.out.println( +n+ " th Fibo : " +nthFibonacci(n));
    }

    static int fibo(int n){
        if(n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    // just with one formula
    static int fiboFormula(int n){
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2 ), n ) - Math.pow(((1 - Math.sqrt(5)) / 2 ), n ) ) / Math.sqrt(5));
    }

    // for nth fibonacci number
    static int nthFibonacci(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        if(n < 2) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int result = nthFibonacci(n-1) + nthFibonacci(n-2);
        memo.put(n, result);
        return result;
    }
}
