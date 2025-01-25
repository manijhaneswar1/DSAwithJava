public class Power_Of_Four {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(POF(n));
    }
    static boolean POF(int n){
        if(n <= 0 ) return false;
        if(n == 1) return true;
        if(n%4 != 0) return false;
        return POF(n/4);
    }
}
