public class thirteen {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {

            int colsReq= i==n ? 2*n-1: i;

            int spaces=n-i;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < colsReq; j++) {
                if(i == n){
                    System.out.print("*");
                }else if(i != 3 && j != 1 || i != 4){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*

        *
       * *
      *   *
     *     *
    *********

*/
