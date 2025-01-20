public class twelve {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= 2*n; i++) {

            int spaces= i > n ? 2 * n - i + 1 : i;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            int colsReq= i > n ? 2 * n - i + 1 : i;

            for (int j = n; j >= colsReq  ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
    * * * * *
     * * * *
      * * *
       * *
        *
        *
       * *
      * * *
     * * * *
    * * * * *
 */
