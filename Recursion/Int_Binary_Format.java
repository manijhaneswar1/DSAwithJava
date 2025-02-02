public class Int_Binary_Format {
    public static void main(String[] args) {
        System.out.println(b(10));
        System.out.println(b2(10));
        System.out.println(b3(10));
    }
    static String b(int n){
        // base condition
        if(n==0) return "";
        String binary = b(n/2);
        return binary + (n % 2);
    }
    static String b2(int n){
        StringBuilder ans = new StringBuilder();
        while(n != 0){
            int rem = n % 2;
            ans.append(rem);
            n = n / 2;
        }
        return ans.reverse().toString();
    }
    static StringBuilder b3(int n){
        if( n == 0) return new StringBuilder();
        StringBuilder ans = new StringBuilder(b3(n / 2));
        return ans.append(n % 2);
    }
}
