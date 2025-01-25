public class Factorial_Number {
    public static void main(String[] args) {
        System.out.println(FN(5));
    }
    static int FN(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return n * FN(n-1);
    }
}
