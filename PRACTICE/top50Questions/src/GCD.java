public class GCD {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        System.out.println( gcd(num1, num2) );
    }
    // By Using Euclid's Algorithm, which is an Efficient Way
    public static int gcd(int n1, int n2){
        if( n2 == 0 ) return n1;
        return gcd( n2, n1 % n2);
    }
}
