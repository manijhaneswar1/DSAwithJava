public class Main {
    public static void main(String[] args) {
       reverse_num(12345);
    }
    static void i_to_n(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        i_to_n(n-1);
    }
    static void n_to_i(int n){
        if(n == 0){
            return;
        }
        n_to_i(n - 1);
        System.out.print(n + " ");
    }
    static void n_to_i_and_i_to_n(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        n_to_i_and_i_to_n(n - 1);
        System.out.print(n + " ");
    }
    static int Factorial(int n){
        if(n == 1){
            return n;
        }
        return n * Factorial(n-1);
    }
    static int sum(int n){
        if(n == 1){
            return n;
        }
        return n + sum(n-1);
    }
    static int sum_of_digits(int n){
        if(n == 0){
            return n;
        }
        return n % 10 + sum_of_digits(n / 10);
    }
    static int product_of_digits(int n){
        if(n % 10 == n){
            return n;
        }
        return n % 10 * product_of_digits(n / 10);
    }
    static void reverse_num(int n){
        if(n == 0){
            return;
        }
        System.out.print(n % 10);
        reverse_num(n / 10);
    }
}