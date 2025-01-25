public class ThirtyThree {
    public static void main(String[] args) {
        int n=5;
        char low='a';
        char upp='B';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char alpha= (i + j) % 2 == 0 ? low  : upp;
                System.out.print(alpha + " ");
            }
            System.out.println();
            low = (char) (low + 2);
            upp = (char) (upp + 2);
        }
    }
}

/*
       a
       B c
       D e F
       g H i J
       k L m N o
 */