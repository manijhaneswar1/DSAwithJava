public class seventeen {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= 2*n; i++) {

            int spaces=i>n?i:2*n-i;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            int colsReq=i>n?2*n-i:i;

            for (int j = colsReq; j >= 1 ; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= colsReq ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
         1
        212
       32123
      4321234
       32123
        212
         1
 */
