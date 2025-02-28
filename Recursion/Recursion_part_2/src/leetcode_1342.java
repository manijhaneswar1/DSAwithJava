public class leetcode_1342 {
    public static void main(String[] args) {
        System.out.println(steps(8 , 0));
    }
    static int steps(int n , int c){
        if(n == 0){
            return c;
        }
        if(n % 2 == 0) n /= 2; c++;
        if(n % 2 != 0) n -= 1; c++;
        return steps(n , c);
    }
}
