public class eigth {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {

            int colsReq=(i+1) + i;

            int spaces=n-i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < colsReq; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
        *
       ***
      *****
     *******
    *********
 */