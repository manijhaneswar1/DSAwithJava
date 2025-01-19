public class five {
    public static void main(String[] args) {
        int num=1;
        for (int i = 1; i <= 9 ; i++) {
            if(i<=5){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
            }else{
                for (int k = i-(2*num++); k >= 1; k--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // another method
        for (int a = 1; a <= 9; a++) {
            int colsReq=a > 9/2 ? 2*(9/2)-a: a;
            for (int b = 0; b <= colsReq ; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */