public class dec_to_binary {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Binary format of " +n+ " : " + d_to_b(n));
        System.out.println("No of Digits in Binary Format : " + noOfDigits_in_Binary(n));
        System.out.println(noOfDigits(n));
    }
    static int d_to_b(int n){
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    static int noOfDigits_in_Binary(int n){
        int c = 0;
        while(n != 0){
            c++;
            n /= 2;
        }
        return c;
    }
    static int noOfDigits(int n){
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        int binary = Integer.parseInt(sb.reverse().toString());
        while(binary != 0){
           binary = binary >> 1;
           c++;
        }
        return c;
    }
}
