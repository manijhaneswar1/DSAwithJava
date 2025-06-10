public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
    public static int reverse(int number){
        int rev = 0;
        while( number > 0){
            int rem = number % 10;
            rev = rem + rev * 10 ;
            number /= 10;
        }
        return rev;
    }
}
