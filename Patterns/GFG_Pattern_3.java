public class GFG_Pattern_3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < 2*n; i++) {
            int colsReq = i == n ? 1 : (i>0 && i<2*n-1 ? 2 : n) ;
            for (int j = 0; j < colsReq; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} // Incomplete ..need to add spaces to complete code

/*

 * * * * * *
 *       *
 *     *
 *   *
 * *
 *
 * *
 *   *
 *     *
 *       *
 * * * * * *

 */
