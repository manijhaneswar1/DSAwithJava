public class twelve {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= 2*n; i++) {

            int spacesAndCols= i > n ? 2 * n - i + 1 : i;

            for (int s = 0; s < spacesAndCols; s++) {
                System.out.print(" ");
            }

            for (int j = n; j >= spacesAndCols; j--) {
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
