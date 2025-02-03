public class GFG_pattern {
    public static void main(String[] args) {
        int n=6;
        for (int i = 0; i < n; i++) {
            int colsReq = i == 0 || i == n-1 ? n : 2;
            for (int j = 0; j < colsReq; j++) {
                System.out.print("*");
                int spaces = i > 0 && i < n-1 ? n-2 : 0;
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
        ******
        *    *
        *    *
        *    *
        *    *
        ******
 */
