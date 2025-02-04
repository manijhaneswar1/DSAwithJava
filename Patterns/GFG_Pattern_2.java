public class GFG_Pattern_2 {
    public static void main(String[] args) {
        int n = 6;
        int number = 1;
        for (int i = 0; i < n; i++) {
            int spaces=n-i-1;
            for (int s = 0; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
            number++;
        }
    }
}
/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
 */
