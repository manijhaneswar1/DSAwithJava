public class Reverse_Integer {
    public static void main(String[] args){
        int n = 123;
        System.out.println(revOf(n));
        System.out.println(recursion(n));
    }
    static int revOf(int n){
        int legit=n;
        if(n < 0 ) n = -n;
        StringBuilder str = new StringBuilder();
        while(n != 0){
            int rem = n % 10;
            str.append(rem);
            n = n /10;
        }
        return legit < 0 ? -(Integer.parseInt(String.valueOf(str))) : Integer.parseInt(String.valueOf(str));
    }
    static String recursion(int n){
        if(n < 0) n = -n;
        StringBuilder str = new StringBuilder();
        if(n == 0) return "";
        return str.append(n % 10) + recursion(n/10);
    }
}
