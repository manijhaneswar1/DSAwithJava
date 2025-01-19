public class TwentyEight {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < 2*n; i++) {

            int colsReq=i > n ? 2*n-i:i;

            int spaces=n - colsReq;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < colsReq; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */