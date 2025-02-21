public class Hamming_Distance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    static int hammingDistance(int x, int y) {
        int c = 0;
        while( x > 0 || y > 0){
            int a = (x & 1);
            int b = (y & 1);
            c += (  a ^ b);
            x >>= 1;
            y >>= 1;
        }
        return c;
    }
}
