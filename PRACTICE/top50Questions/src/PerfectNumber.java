import java.util.ArrayList;

// A perfect number is a positive integer
// that is equal to the sum of its proper divisors,
// excluding the number itself.
public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        System.out.println(isPerfect(number));
    }
    static boolean isPerfect(int n){
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 1; i < n; i++ ){
            if( n % i == 0 ){
                array.add(i);
            }
        }
        int sum = 0;
        for( int num : array){
            sum += num;
        }
        return sum == n;
    }
}
