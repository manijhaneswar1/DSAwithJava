public class TwentyThree {
    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <= n; i++) {
            // leading spaces

            int colsReq = i == 1 ? 2 : (i==n)? 3 : 4;
            for (int j = 1; j <= colsReq; j++) {
                System.out.print("*");
                //inside spaces

            }
            System.out.println();
        }
    }
}

/*
         *       *
       *   *   *   *
     *       *      *
 */
