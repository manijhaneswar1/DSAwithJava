public class Power_Of_Three {
    public static void main(String[] args) {
        int n=-1;
        System.out.println(POT(n));
    }
    static boolean POT(int n){
        if(n <= 0) return false;
        if(n == 3) return true;
        if(n%3 != 0) return false;
        return POT(n/3);
    }
}
