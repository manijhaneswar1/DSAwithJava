public class Power_Of_Two {
    public static void main(String[] args) {
        int n=32;
        System.out.println(POT(n));
    }
    static boolean POT(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n%2 != 0) return false;
        return POT(n/2);
    }
}
