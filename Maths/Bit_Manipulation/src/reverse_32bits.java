public class reverse_32bits {
    public static void main(String[] args) {
        int input = 0b10100101000001111010011100;
        System.out.println(reverseBits(input));
    }
    static int reverseBits(int n) {
        int ans = 0;
        for(int i =0 ; i < 32 ; i++){
            int bit = n & 1;
            ans = (ans << 1) | bit;
            n = n >> 1;
        }
        return ans;
    }
}
