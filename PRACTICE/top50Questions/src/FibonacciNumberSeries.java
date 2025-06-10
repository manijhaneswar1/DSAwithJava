public class FibonacciNumberSeries {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Fibonacci Series up to " + number + " terms:");
        for (int i = 0; i < number; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < number; i++) {
            System.out.print(fibFormula(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    // using Math Formula
    public static int fibFormula(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        return (int)Math.round(Math.pow(phi, n) / sqrt5);
    }

}
