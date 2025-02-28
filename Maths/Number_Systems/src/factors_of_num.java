public class factors_of_num {
    public static void main(String[] args) {
        int n = 36;
        // O(n)
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) System.out.print(i + " ");
        }
        System.out.println();
        // O(sqrt(n))
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                if ( n / i == i){
                    System.out.print(i);
                }else{
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
}
