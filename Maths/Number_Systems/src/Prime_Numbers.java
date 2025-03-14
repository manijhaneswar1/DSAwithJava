public class Prime_Numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1) return false;
        int i = 2;
        while(i <= Math.sqrt(n)){
            if(n % i == 0) return false;
            i++;
        }
        return true;
    }
}
