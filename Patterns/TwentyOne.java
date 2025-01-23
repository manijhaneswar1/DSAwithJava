public class TwentyOne {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(num++ + " ");
            }

            for (int s = 0; s < 5-i-1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
 */