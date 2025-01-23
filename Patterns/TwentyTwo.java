public class TwentyTwo {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                int num = (i+j) % 2==0 ? 1 : 0;
                System.out.print(num + " ");
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
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
 */
