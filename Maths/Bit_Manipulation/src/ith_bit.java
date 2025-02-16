public class ith_bit {
    public static void main(String[] args) {
        System.out.println(ith_bit(10));
    }
    static int ith_bit(int n){
        return n & (1 << (n-1));
    }
}
