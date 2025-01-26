public class Power_Of_Num {
    public static void main(String[] args) {
        double x=2.00000;
        int n=-100;
        System.out.println(POW(x,n));
    }
    static double POW(double x,int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        return powHelper(x,n);
    }
    static double powHelper(double x,int n){
        if(n == 0) return 1;
        double half = powHelper(x,n/2);
        if(n % 2 == 0){
            return half * half;
        }else{
            return half * half * x;
        }
    }
}
