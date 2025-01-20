public class ten {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            int spaces=n-i;
            for (int s = 0; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
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
 */