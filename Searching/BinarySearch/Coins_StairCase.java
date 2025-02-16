public class Coins_StairCase {
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n) {
        int compStairCase=0,i=1;
        while(n>0){
            n=n-i;
            // edge case if n==1
            if(n==0) return ++compStairCase;
            // main case
            if(n>0) compStairCase++;
            i++;
        }
        return compStairCase;
    }
}
