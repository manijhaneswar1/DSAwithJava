public class rev_palindrone {
    public static void main(String[] args) {
        System.out.println(isP(12321)); // true
        System.out.println(isP(1231));  // false
    }

    static boolean isP(int n) {
        return n == rev(n, 0);
    }

    static int rev(int n, int revNum) {
        if (n == 0) {
            return revNum;
        }
        int rem = n % 10;
        return rev(n / 10, revNum * 10 + rem);
    }
}
