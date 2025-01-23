public class TwentySix {
    public static void main(String[] args) {
        int num=1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6-i; j++) {
                System.out.print(num + " ");
            }
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            System.out.println();
            num++;
        }
    }
}

/*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
 */