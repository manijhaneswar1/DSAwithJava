public class nineteen {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n; i++) {

            int stars = i <= n / 2 ? i : n - i;

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            int spaces = n - 2 * stars;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
